package com.everis.bootcamp.priceService.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.bootcamp.priceService.dto.Prices;
import com.everis.bootcamp.priceService.servicio.PriceServiceImpl;

@RestController
public class PriceController {
	
private PriceServiceImpl priceService;

public PriceController(PriceServiceImpl priceService) {
	
	this.priceService = priceService;
		
}
	
	
@PostMapping(value = "/get-price/{id}")
public Prices getProducto(@PathVariable int id) {
	return priceService.getOnePrice(id);
	
}

@PostMapping(value = "/get-all-prices")
public List<Prices> postProducto() {
	return priceService.getAllPrices();
	
}



}
