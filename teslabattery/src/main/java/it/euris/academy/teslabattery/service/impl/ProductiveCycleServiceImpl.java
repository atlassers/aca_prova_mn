package it.euris.academy.teslabattery.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.euris.academy.teslabattery.data.dto.ProductiveCycleDto;
import it.euris.academy.teslabattery.data.model.ProductiveCycle;
import it.euris.academy.teslabattery.exception.IdMustBeNullException;
import it.euris.academy.teslabattery.exception.IdMustNotBeNullException;
import it.euris.academy.teslabattery.repository.ProductiveCycleRepository;
import it.euris.academy.teslabattery.service.ProductiveCycleService;

@Service
public class ProductiveCycleServiceImpl implements ProductiveCycleService{
  
  @Autowired
  private ProductiveCycleRepository productiveCycleRepository;
  
  @Override
  public ProductiveCycleDto getById(Long id) {
    return productiveCycleRepository.findById(id).orElse(new ProductiveCycle()).toDto();
  }

  @Override
  public List<ProductiveCycleDto> getAll() {
    return productiveCycleRepository.findAll()
        .stream().map(curProductiveCycle -> curProductiveCycle.toDto())
        .collect(Collectors.toList());
  }

  @Override
  public ProductiveCycleDto add(ProductiveCycleDto productiveCycleDto) {
    if (productiveCycleDto.getId() != null) {
      throw new IdMustBeNullException();
    }
    return productiveCycleRepository.save(productiveCycleDto.toModel()).toDto();
  }

  @Override
  public ProductiveCycleDto update(ProductiveCycleDto productiveCycleDto) {
    if (productiveCycleDto.getId() != null) {
      throw new IdMustNotBeNullException();
    }
    return productiveCycleRepository.save(productiveCycleDto.toModel()).toDto();
  }

  @Override
  public Boolean delete(Long id) {
    productiveCycleRepository.deleteById(id);
    return productiveCycleRepository.findById(id).isEmpty();
  }


}
