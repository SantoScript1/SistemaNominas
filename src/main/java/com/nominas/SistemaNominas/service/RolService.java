package com.nominas.SistemaNominas.service;

import com.nominas.SistemaNominas.model.Rol;
import com.nominas.SistemaNominas.repository.IRolRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService implements IRolService{
    
    @Autowired
    private IRolRepository rolRepo;

    @Override
    public List<Rol> getRoles() {
        List <Rol> listaRoles = rolRepo.findAll();
        return listaRoles;
    }

    @Override
    public void saveRol(Rol rol) {
        rolRepo.save(rol);
    }

    @Override
    public void deleteRol(Long id) {
        rolRepo.deleteById(id);
    }

    @Override
    public Rol findRol(Long id) {
        Rol rol = rolRepo.findById(id).orElse(null);
        return rol;
    }
    
}
