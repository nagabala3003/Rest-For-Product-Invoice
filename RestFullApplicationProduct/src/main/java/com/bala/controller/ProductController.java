package com.bala.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bala.model.Product;
import com.bala.repository.ProductRepo;

import ch.qos.logback.core.model.Model;

@RestController
public class ProductController {

@Autowired
public ProductRepo repo;

@PostMapping("/save")
public Product pSave(@RequestBody Product prod,Model m) {
	return repo.save(prod) ;
	}


 @PutMapping("/update/{proId}")
public Product updateProd(@RequestBody Product p,
	@PathVariable Integer proId,Model m) {
	Optional<Product> o=repo.findById(proId);
	Product p1=o.get();
	p1.setProName(p.getProName());
	p1.setPrice(p.getPrice());
	return repo.save(p1);  //save for update record
}


@DeleteMapping("/delete/{proId}")
public void deleteProd(@PathVariable Integer proId,Model m) {
	repo.deleteById(proId);
}

@GetMapping("/get/{proId}")
public Product getOne(@PathVariable Integer proId,Model m) {
	return repo.findById(proId).get();
	}

@GetMapping("/getAll")
public List<Product> getProductAll(){
	return (List<Product>) repo.findAll();
	
} 
}
