package com.everis.bootcamp.priceService.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.bootcamp.priceService.dto.Prices;

@Repository
public interface PriceRepositoryI extends JpaRepository<Prices, Integer>{
	

}
