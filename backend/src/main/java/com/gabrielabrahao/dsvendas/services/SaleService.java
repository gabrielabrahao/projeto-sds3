package com.gabrielabrahao.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gabrielabrahao.dsvendas.dto.SaleDTO;
import com.gabrielabrahao.dsvendas.dto.SaleSucessDTO;
import com.gabrielabrahao.dsvendas.dto.SaleSumDTO;
import com.gabrielabrahao.dsvendas.entities.Sale;
import com.gabrielabrahao.dsvendas.repositories.SaleRepossitory;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepossitory repossitory;

	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		Page<Sale> result =  repossitory.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return repossitory.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSucessDTO> sucessGroupedBySeller(){
		return repossitory.sucessGroupedBySeller();
	}
}
