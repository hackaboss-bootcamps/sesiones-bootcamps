package com.hackaboss.proyecto.Controller.Ubicacion;

import com.hackaboss.proyecto.Controller.Component.BaseController;
import com.hackaboss.proyecto.Entity.Seguridad.Vista;
import com.hackaboss.proyecto.Entity.Ubicacion.Continente;
import com.hackaboss.proyecto.IService.Seguridad.IVistaService;
import com.hackaboss.proyecto.IService.Ubicacion.IContinenteService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("Continente")
public class ContinenteController extends BaseController<Continente, IContinenteService> {
	public ContinenteController(IContinenteService service) {
        super(service, "Continente");
	}
}