package com.nominas.SistemaNominas.service;

import com.nominas.SistemaNominas.model.Departamento;
import com.nominas.SistemaNominas.repository.IDepartamentoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoService implements IDepartamentoService{
    
    @Autowired
    private IDepartamentoRepository depaRepo;

    @Override
    public List<Departamento> getDepartamentos() {
        List <Departamento> listaDepartamentos = depaRepo.findAll();
        return listaDepartamentos;
    }

    @Override
    public void saveDepartamento(Departamento depar) {
        depaRepo.save(depar);
    }

    @Override
    public void deleteDepartamento(Long id) {
        depaRepo.deleteById(id);
    }

    @Override
    public Departamento findDepartamento(Long id) {
        Departamento depa = depaRepo.findById(id).orElse(null);
        return depa;
    }
}
