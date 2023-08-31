package com.hackaboss.proyecto.Service.Seguridad;

import com.hackaboss.proyecto.Dto.ISeguridad.IVistaDto;
import com.hackaboss.proyecto.Entity.Seguridad.Vista;
import com.hackaboss.proyecto.IRepository.Component.IBaseRepository;
import com.hackaboss.proyecto.IRepository.Seguridad.IVistaRepository;
import com.hackaboss.proyecto.IService.Seguridad.IVistaService;
import com.hackaboss.proyecto.Service.Component.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VistaService extends BaseService<Vista> implements IVistaService {
    @Override
    protected IBaseRepository<Vista, Long> getRepository() {
        return repository;
    }

    @Autowired
    private IVistaRepository repository;

    @Override
    public List<IVistaDto> getListRoute() {
        return repository.getListRoute();
    }
}
