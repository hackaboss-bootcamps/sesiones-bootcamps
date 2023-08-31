package com.hackaboss.proyecto.Service.Ubicacion;

import com.hackaboss.proyecto.Dto.ISeguridad.IVistaDto;
import com.hackaboss.proyecto.Entity.Seguridad.Vista;
import com.hackaboss.proyecto.Entity.Ubicacion.Continente;
import com.hackaboss.proyecto.IRepository.Component.IBaseRepository;
import com.hackaboss.proyecto.IRepository.Seguridad.IVistaRepository;
import com.hackaboss.proyecto.IRepository.Ubicacion.IContinenteRepository;
import com.hackaboss.proyecto.IService.Seguridad.IVistaService;
import com.hackaboss.proyecto.IService.Ubicacion.IContinenteService;
import com.hackaboss.proyecto.Service.Component.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinenteService extends BaseService<Continente> implements IContinenteService {
    @Override
    protected IBaseRepository<Continente, Long> getRepository() {
        return repository;
    }

    @Autowired
    private IContinenteRepository repository;
}
