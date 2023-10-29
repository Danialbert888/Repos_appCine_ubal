package com.danielo.Daw1_bdcine_ubaldo.service;

import com.danielo.Daw1_bdcine_ubaldo.model.Estado;
import com.danielo.Daw1_bdcine_ubaldo.repository.EstadoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EstadoService {
@Autowired
    private EstadoDAO estadoDAO;
@Transactional(readOnly = true)
    public List<Estado> listarestados(){
        return (List<Estado>) estadoDAO.findAll();

    }
    @Transactional
    public void guardar(Estado estado){
        estadoDAO.save(estado);
    }
    @Transactional
    public void eliminar(Estado estado){
        estadoDAO.delete(estado);
    }
    @Transactional(readOnly = true)
    public Estado encontrarestado(Estado estado){
        return estadoDAO.findById(estado.getIdEstado()).orElse(null);
    }
}
