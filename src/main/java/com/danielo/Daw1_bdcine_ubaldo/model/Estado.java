package com.danielo.Daw1_bdcine_ubaldo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Estado  {
// private static final long serialversionUID=1L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "idestado")
    private Integer IdEstado;
    @Column(name = "descestado")
    private String DescEstado;



}
