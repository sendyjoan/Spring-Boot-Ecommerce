package com.johan.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johan.ecommerce.entity.Pesanan;

public interface PesanananRepository extends JpaRepository<Pesanan, String> {
    
}
