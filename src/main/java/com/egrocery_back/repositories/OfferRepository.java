package com.egrocery_back.repositories;

import com.egrocery_back.models.OffersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfferRepository extends JpaRepository<OffersEntity, Integer>,
        JpaSpecificationExecutor<OffersEntity> {

    List<OffersEntity> findByIdIn(List<Integer> ids);
}
