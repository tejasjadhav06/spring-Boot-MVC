package com.example.spring_mvc_layers.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring_mvc_layers.model.Product;

@Service
public class ProductService {

	List<Product> products = Arrays.asList(new Product(101,"Vivo T2x 5G",12000),new Product(102,"TV",40000));
	
	public List<Product> getAllProducts(){
		return products;
	}
	
}
