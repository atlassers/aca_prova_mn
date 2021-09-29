package it.euris.academy.six.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.euris.academy.six.data.dto.ProductiveCycleDto;
import it.euris.academy.six.service.ProductiveCycleService;
@RestController
@RequestMapping("/productive-cycles")
public class ProductiveCycleController {
  
  
  @Autowired
  ProductiveCycleService productiveCycleService;

  @GetMapping("/v6")
  public List<ProductiveCycleDto> getAll() {
      return productiveCycleService.getAll();
  }

  @GetMapping("/v6/{id}")
  public ProductiveCycleDto getById(@PathVariable("id") Long id) {
      return productiveCycleService.getById(id);
  }

  @DeleteMapping("/v6/{id}")
  public Boolean delete(@PathVariable("id") Long id) {
      return productiveCycleService.delete(id);
  }

  @PostMapping("/v6")
  public ProductiveCycleDto insert(@RequestBody ProductiveCycleDto dto) {
      return productiveCycleService.add(dto);
  }

  @PutMapping("/v6")
  public ProductiveCycleDto update(@RequestBody ProductiveCycleDto dto) {
      return productiveCycleService.update(dto);
  }

}
