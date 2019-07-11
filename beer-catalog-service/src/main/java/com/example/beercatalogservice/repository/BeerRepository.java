package com.example.beercatalogservice.repository;


import com.example.beercatalogservice.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BeerRepository extends JpaRepository<Beer, Long> {}
