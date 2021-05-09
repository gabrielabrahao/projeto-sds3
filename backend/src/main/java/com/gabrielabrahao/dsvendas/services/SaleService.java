package com.gabrielabrahao.dsvendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gabrielabrahao.dsvendas.dto.SaleDTO;
import com.gabrielabrahao.dsvendas.entities.Sale;
import com.gabrielabrahao.dsvendas.repositories.SaleRepossitory;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepossitory repossitory;

	public Page<SaleDTO> findAll(Pageable pageable){
		Page<Sale> result =  repossitory.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
}
