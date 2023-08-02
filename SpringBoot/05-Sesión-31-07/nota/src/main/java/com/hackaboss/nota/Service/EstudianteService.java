package com.hackaboss.nota.Service;
import com.hackaboss.nota.Entity.Estudiante;
import com.hackaboss.nota.IRepository.IEstudianteRepository;
import com.hackaboss.nota.IService.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService implements IEstudianteService {
    @Autowired
    private IEstudianteRepository repository;

    @Override
    public List<Estudiante> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Estudiante> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Estudiante save(Estudiante estudiante) {
        return null;
    }

    @Override
    public void update(Long id, Estudiante estudiante) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Estudiante> findOrderByNameStudent() {
        return null;
    }

    @Override
    public List<Estudiante> findListByNameStudent() {
        return null;
    }
}
