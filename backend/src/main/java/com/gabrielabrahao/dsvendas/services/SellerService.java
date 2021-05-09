package com.gabrielabrahao.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gabrielabrahao.dsvendas.dto.SellerDTO;
import com.gabrielabrahao.dsvendas.entities.Seller;
import com.gabrielabrahao.dsvendas.repositories.SaleRepossitory;
import com.gabrielabrahao.dsvendas.repositories.SellerRepossitory;

@Service
public class SellerService {

	
	@Autowired
	private SellerRepossitory repossitory;
	
	@Autowired
	private SaleRepossitory saleRepossitory;
	
	@Transactional(readOnly = true)
	public List<SellerDTO> findAll(){
		saleRepossitory.findAll();
		List<Seller> result =  repossitory.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
	
	
}
