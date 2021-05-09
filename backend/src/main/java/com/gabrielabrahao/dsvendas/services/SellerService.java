package com.gabrielabrahao.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielabrahao.dsvendas.dto.SellerDTO;
import com.gabrielabrahao.dsvendas.entities.Seller;
import com.gabrielabrahao.dsvendas.repositories.SellerRepossitory;

@Service
public class SellerService {

	
	@Autowired
	private SellerRepossitory repossitory;
	
	public List<SellerDTO> findAll(){
		List<Seller> result =  repossitory.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
	
	
}
