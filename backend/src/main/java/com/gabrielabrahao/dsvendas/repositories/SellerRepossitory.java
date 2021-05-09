package com.gabrielabrahao.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielabrahao.dsvendas.entities.Seller;


public interface SellerRepossitory extends JpaRepository<Seller, Long> {

}
