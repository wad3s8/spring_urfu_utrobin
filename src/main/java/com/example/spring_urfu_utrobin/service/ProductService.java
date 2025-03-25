package com.example.spring_urfu_utrobin.service;

import com.example.spring_urfu_utrobin.dto.InfoDateAndId;
import com.example.spring_urfu_utrobin.dto.ProductIn;
import com.example.spring_urfu_utrobin.dto.ProductOut;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class ProductService {
    public ProductOut getProduct(ProductIn productIn){
        ProductOut productOut = new ProductOut();
        InfoDateAndId infoDateAndId = productOut.getInfo();
        infoDateAndId.setDate(productIn.getInfo().getDate());
        infoDateAndId.setId(ThreadLocalRandom.current().nextInt(1000));
        productOut.setPrice(productIn.getPrice());
        return productOut;
    }
}
