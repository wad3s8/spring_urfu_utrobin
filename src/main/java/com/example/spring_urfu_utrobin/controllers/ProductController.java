package com.example.spring_urfu_utrobin.controllers;

import com.example.spring_urfu_utrobin.dto.ProductIn;
import com.example.spring_urfu_utrobin.dto.ProductOut;
import com.example.spring_urfu_utrobin.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ProductController {

    private final ProductService productService;

    @PostMapping("/post")
    public ProductOut addProduct(@RequestBody ProductIn productIn){
        return productService.getProduct(productIn);
    }
}
