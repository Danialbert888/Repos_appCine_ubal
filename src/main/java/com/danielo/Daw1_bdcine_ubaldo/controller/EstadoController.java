package com.danielo.Daw1_bdcine_ubaldo.controller;

import com.danielo.Daw1_bdcine_ubaldo.model.Estado;
import com.danielo.Daw1_bdcine_ubaldo.repository.EstadoDAO;
import com.danielo.Daw1_bdcine_ubaldo.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/hola")
@Controller
public class EstadoController {
@Autowired
    private EstadoService estadoService;
@GetMapping("/frmes")
    public String frmestado(Model model){
        List<Estado> listaestados=estadoService.listarestados();


        model.addAttribute("estados",listaestados);
        return "frmestado";
    }
}
