package com.oreilly.demo.services;

import com.oreilly.demo.dao.ProductRepository;
import com.oreilly.demo.entities.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
@Transactional
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public void initialiseDatabase(){
        if(productRepository.count() == 0){
            productRepository.saveAll(
                    List.of(
                            new Product("TV tray", BigDecimal.valueOf(4.95)),
                            new Product("Toaster", BigDecimal.valueOf(19.95)),
                            new Product("Sofa", BigDecimal.valueOf(249.95))
                    )
            ).forEach(System.out::println);
        }
    }




}
