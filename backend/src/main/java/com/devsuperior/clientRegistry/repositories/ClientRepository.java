package com.devsuperior.clientRegistry.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.clientRegistry.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
