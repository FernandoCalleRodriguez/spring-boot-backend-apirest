package com.bolsadeideas.spring.boot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bolsadeideas.spring.boot.backend.apirest.models.emtity.Cliente;
import com.bolsadeideas.spring.boot.backend.apirest.models.emtity.Region;

public interface IClienteDao extends JpaRepository<Cliente, Long>{

	@Query("from Region")
	public List<Region> findAllRegiones();
	
}
