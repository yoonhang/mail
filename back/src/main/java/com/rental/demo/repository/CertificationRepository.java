package com.rental.demo.repository;

import org.springframework.data.jpa.Repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.housing.back.entity.CertificationEntity;

@Repository
public interface CertificationRepository extends JpaRepository<CertificationEntity, String> {

}
