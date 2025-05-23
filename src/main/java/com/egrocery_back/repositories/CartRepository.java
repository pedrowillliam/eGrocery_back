package com.egrocery_back.repositories;

import com.egrocery_back.models.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<CartEntity, Integer>, 
        JpaSpecificationExecutor<CartEntity> {

    // Adiciona suporte para busca por lista de IDs
    List<CartEntity> findByIdIn(List<Integer> ids);
}
