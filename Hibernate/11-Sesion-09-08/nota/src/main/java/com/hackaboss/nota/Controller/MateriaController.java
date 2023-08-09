package com.hackaboss.nota.Controller;

import com.hackaboss.nota.Entity.Materia;
import com.hackaboss.nota.IService.IMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Materia")
public class MateriaController {
    @Autowired
    private IMateriaService service;

    @GetMapping()
    public List<Materia> all() {
        return service.all();
    }
    @GetMapping("{id}")
    public Optional<Materia> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Materia save(@RequestBody Materia materia) {
        return service.save(materia);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@PathVariable Long id, @RequestBody Materia materia) {
        service.update(id, materia);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
