package com.johan.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johan.ecommerce.entity.Kategori;

public interface KategoriRepository extends JpaRepository<Kategori, String> {
    
}
