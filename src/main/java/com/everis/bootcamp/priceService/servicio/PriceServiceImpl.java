package com.everis.bootcamp.priceService.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.everis.bootcamp.priceService.dto.Prices;
import com.everis.bootcamp.priceService.repository.PriceRepositoryI;

@Service
public class PriceServiceImpl{
	
	
	private PriceRepositoryI priceRepositoryI;
	
	public PriceServiceImpl(PriceRepositoryI priceServiceI) {
		
		this.priceRepositoryI = priceServiceI;
			
	}

	public Prices getOnePrice(int id) {

		return priceRepositoryI.findById(id).orElseThrow();
	}

	public List<Prices> getAllPrices() {

		return priceRepositoryI.findAll();
	}

	

}
