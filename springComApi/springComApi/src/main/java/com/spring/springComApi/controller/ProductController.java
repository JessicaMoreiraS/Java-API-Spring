package com.spring.springComApi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springComApi.entities.Department;
import com.spring.springComApi.entities.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@GetMapping
	public List<Product> getObjects(){
		Department d1 = new Department(1L, "Roupas");	/*1L significa que o 1 eh do tipo Long*/
		Department d2 = new Department(2L, "Acessorios");

		Product p1 = new Product(1L, "Camiseta", 40.0, d1);
		Product p2 = new Product(2L, "Vestido", 150.0, d1);
		Product p3 = new Product(3L, "Bolsa", 90.0, d2);
		
		List<Product> lista = Arrays.asList(p1, p2, p3);
		
		return lista;
	}
}
