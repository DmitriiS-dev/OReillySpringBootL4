package com.oreilly.demo.controller;

public class ProductMinimumPriceException extends RuntimeException{

    public ProductMinimumPriceException(){
        this("Minimum price must be greater than zero");
    }

    public ProductMinimumPriceException(String message){
        super(message);
    }

    public ProductMinimumPriceException(double minPrice){
        this("Min price must be greater than zero, but was "+ minPrice);
    }
}
