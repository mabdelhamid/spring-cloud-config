package com.sample.ms.rest;


import com.sample.ms.model.Beneficiary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Long> {
}
