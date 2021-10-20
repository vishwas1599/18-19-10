package com.thbs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.thbs.model.Product;
import com.thbs.repository.ProductRepository;

@RestController
@RequestMapping("/prod")
public class ProductController {

	@Autowired
	ProductRepository jp;
	
	@PostMapping("/pro")
	public ResponseEntity<Product> save(@RequestBody Product p)
	{
		Product pd=jp.save(p);
		
		return new ResponseEntity<Product>(pd,HttpStatus.OK);
	}
	
	@GetMapping("/getAllProducts")
	public ResponseEntity<List<Product>> getAllProducts()
	{
		List<Product> blist =jp.findAll();
		return new ResponseEntity<List<Product>>(blist,HttpStatus.OK);
	}
	
	@GetMapping("/getAProduct/{id}")
	public ResponseEntity<Product> getABook(@PathVariable int id)
	{
		Optional<Product> bk=jp.findById(id);
		if(bk.isPresent())
		{
			Product b=bk.get();
			return new ResponseEntity<Product>(b,HttpStatus.OK);
		}
		return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		
				
	}
	@DeleteMapping("/DeleteAProduct/{id}")
	public ResponseEntity<Product> deleteProductById(@PathVariable int id)
	{
		if(jp.existsById(id))
		{
			jp.deleteById(id);
			return new ResponseEntity<Product>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
	}
}
