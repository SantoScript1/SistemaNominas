package com.nominas.SistemaNominas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Departamento {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    @OneToMany
    private Empleado emple;

    public Departamento() {
    }

    public Departamento(Long id, String nombre, Empleado emple) {
        this.id = id;
        this.nombre = nombre;
        this.emple = emple;
    }
}
