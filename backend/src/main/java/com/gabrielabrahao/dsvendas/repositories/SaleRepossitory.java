package com.gabrielabrahao.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielabrahao.dsvendas.entities.Sale;

@Repository
public interface SaleRepossitory extends JpaRepository<Sale, Long> {

}


