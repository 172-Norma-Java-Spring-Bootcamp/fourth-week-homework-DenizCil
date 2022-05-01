package org.patikadev.orderexample.controller;


import org.patikadev.orderexample.dto.ProductDTO;
import org.patikadev.orderexample.model.Product;
import org.patikadev.orderexample.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/create")
    public void createProduct(@RequestBody Product product){
        productService.saveProduct(product);

    }

    @GetMapping("/getProduct/{id}")
    public Product getProductById(@PathVariable("id")int id){

        return productService.getProductById(id);
    }

    @GetMapping("getProductList")
    public List<Product> getProductList(){
        return productService.getAllProduct();

    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")int id){
        productService.deleteProductById(id);
    }




}
