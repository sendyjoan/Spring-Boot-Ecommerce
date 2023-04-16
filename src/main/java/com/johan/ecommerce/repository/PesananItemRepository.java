package com.johan.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johan.ecommerce.entity.PesananItem;

public interface PesananItemRepository extends JpaRepository<PesananItem, String> {
    
}
