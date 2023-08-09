package com.hackaboss.nota.Controller;

import com.hackaboss.nota.Entity.Estudiante;
import com.hackaboss.nota.IService.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Estudiante")
public class EstudianteController {
    @Autowired
    private IEstudianteService service;

    @GetMapping()
    public List<Estudiante> all() {
        return service.all();
    }
    @GetMapping("{id}")
    public Optional<Estudiante> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Estudiante save(@RequestBody Estudiante estudiante) {
        return service.save(estudiante);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@PathVariable Long id, @RequestBody Estudiante estudiante) {
        service.update(id, estudiante);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
