package com.example.redis.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.redis.demo.model.Shopping;
import com.example.redis.demo.repository.ShoppingDao;

@RestController
@RequestMapping("/shoppingItems")
public class ShoppingController {
	
	@Autowired
	private ShoppingDao shoppingdao;

	@PostMapping
	public Shopping save(@RequestBody Shopping shopping) {
		return shoppingdao.save(shopping);
	}

	@GetMapping
	public List<Shopping> getAllProducts() {
		return shoppingdao.findAll();
	}

	@GetMapping("/{id}")
	public Shopping findItems(@PathVariable int id) {
		Shopping shopping = shoppingdao.findProductById(id);
		return shopping;
	}
	@DeleteMapping("/{id}")
	public String remove(@PathVariable int id)   {
		return shoppingdao.deleteProduct(id);
	}



}
