package com.hackaboss.proyecto.Service.Seguridad;

import com.hackaboss.proyecto.Dto.ISeguridad.IVistaDto;
import com.hackaboss.proyecto.Entity.Seguridad.Persona;
import com.hackaboss.proyecto.Entity.Seguridad.Vista;
import com.hackaboss.proyecto.IRepository.Component.IBaseRepository;
import com.hackaboss.proyecto.IRepository.Seguridad.IPersonaRepository;
import com.hackaboss.proyecto.IRepository.Seguridad.IVistaRepository;
import com.hackaboss.proyecto.IService.Seguridad.IPersonaService;
import com.hackaboss.proyecto.IService.Seguridad.IVistaService;
import com.hackaboss.proyecto.Service.Component.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService extends BaseService<Persona> implements IPersonaService {
    @Override
    protected IBaseRepository<Persona, Long> getRepository() {
        return repository;
    }
    @Autowired
    private IPersonaRepository repository;
}
