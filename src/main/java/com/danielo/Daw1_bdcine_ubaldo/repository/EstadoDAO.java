package com.danielo.Daw1_bdcine_ubaldo.repository;

import com.danielo.Daw1_bdcine_ubaldo.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoDAO extends JpaRepository<Estado,Integer> {
}
