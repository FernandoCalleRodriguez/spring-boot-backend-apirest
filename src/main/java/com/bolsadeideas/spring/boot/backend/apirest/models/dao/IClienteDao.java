package com.bolsadeideas.spring.boot.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bolsadeideas.spring.boot.backend.apirest.models.emtity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long>{

}
