package com.example.spring_mvc_layers.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_mvc_layers.model.Product;

@RestController
public class ProductController {

	@RequestMapping("/")
	public String home() {
		return "This is Home Page of Our Project";
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return null;
	}
}
