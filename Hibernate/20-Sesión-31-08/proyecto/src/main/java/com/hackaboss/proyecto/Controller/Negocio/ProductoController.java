package com.hackaboss.proyecto.Controller.Negocio;

import com.hackaboss.proyecto.Controller.Component.BaseController;
import com.hackaboss.proyecto.Entity.Negocio.Producto;
import com.hackaboss.proyecto.IService.Negocio.IProductoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("Producto")
public class ProductoController extends BaseController<Producto,IProductoService> {
    public ProductoController(IProductoService service) {
        super(service, "Producto");
    }
}
