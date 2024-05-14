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
public class Rol {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombreRol;
    
    @OneToMany
    private Empleado emple;

    public Rol() {
    }

    public Rol(Long id, String nombreRol, Empleado emple) {
        this.id = id;
        this.nombreRol = nombreRol;
        this.emple = emple;
    }
}
