package com.nominas.SistemaNominas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Empleado {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String contrasenia;
    private Date fechaNaciemiento;
    private String telefono;
    private String direccion;
    private Double salario;
    private String cargo;

    public Empleado() {
    }

    public Empleado(Long id, String nombre, String apellido, String correoElectronico, String contrasenia, Date fechaNaciemiento, String telefono, String direccion, Double salario, String cargo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.contrasenia = contrasenia;
        this.fechaNaciemiento = fechaNaciemiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.salario = salario;
        this.cargo = cargo;
    }
    
    
}
