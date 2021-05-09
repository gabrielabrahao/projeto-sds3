package com.gabrielabrahao.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gabrielabrahao.dsvendas.dto.SaleSucessDTO;
import com.gabrielabrahao.dsvendas.dto.SaleSumDTO;
import com.gabrielabrahao.dsvendas.entities.Sale;

@Repository
public interface SaleRepossitory extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new com.gabrielabrahao.dsvendas.dto.SaleSumDTO(obj.seller,SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller ")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.gabrielabrahao.dsvendas.dto.SaleSucessDTO(obj.seller,SUM(obj.visited),SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller ")
	List<SaleSucessDTO> sucessGroupedBySeller();

}


