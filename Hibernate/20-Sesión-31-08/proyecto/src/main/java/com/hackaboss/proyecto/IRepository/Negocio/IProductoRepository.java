package com.hackaboss.proyecto.IRepository.Negocio;

import com.hackaboss.proyecto.Entity.Negocio.Producto;
import com.hackaboss.proyecto.IRepository.Component.IBaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends IBaseRepository<Producto,Long> {

}
