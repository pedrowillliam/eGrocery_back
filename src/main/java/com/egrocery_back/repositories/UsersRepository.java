package com.egrocery_back.repositories;

import com.egrocery_back.models.OffersEntity;
import com.egrocery_back.models.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Integer>
        , JpaSpecificationExecutor<UsersEntity> {
}
