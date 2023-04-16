package com.johan.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johan.ecommerce.entity.Keranjang;

public interface KeranjangRepository extends JpaRepository<Keranjang, String> {
    
}
