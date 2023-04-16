package com.johan.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johan.ecommerce.entity.PesananLog;

public interface PesananLogRepository extends JpaRepository<PesananLog, String> {
    
}
