package com.hackaboss.proyecto.Service.Negocio;

import com.hackaboss.proyecto.Entity.Negocio.Producto;
import com.hackaboss.proyecto.IRepository.Component.IBaseRepository;
import com.hackaboss.proyecto.IRepository.Negocio.IProductoRepository;
import com.hackaboss.proyecto.IService.Negocio.IProductoService;
import com.hackaboss.proyecto.Service.Component.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService extends BaseService<Producto> implements IProductoService {

    @Override
    protected IBaseRepository<Producto, Long> getRepository() {
        return repository;
    }
    @Autowired
    IProductoRepository repository;
}
