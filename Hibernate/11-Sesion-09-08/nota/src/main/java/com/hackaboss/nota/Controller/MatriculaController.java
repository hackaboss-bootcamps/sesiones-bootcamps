package com.hackaboss.nota.Controller;

import com.hackaboss.nota.Entity.Matricula;
import com.hackaboss.nota.IService.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Matricula")
public class MatriculaController {
    @Autowired
    private IMatriculaService service;

    @GetMapping()
    public List<Matricula> all() {
        return service.all();
    }
    @GetMapping("{id}")
    public Optional<Matricula> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Matricula save(@RequestBody Matricula matricula) {
        return service.save(matricula);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@PathVariable Long id, @RequestBody Matricula matricula) {
        service.update(id, matricula);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
