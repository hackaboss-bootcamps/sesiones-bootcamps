package com.hackaboss.nota.Service;

import com.hackaboss.nota.Entity.Materia;
import com.hackaboss.nota.IRepository.IMateriaRepository;
import com.hackaboss.nota.IService.IMateriaService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class MateriaService implements IMateriaService {
    @Override
    public List<Materia> all() {
        return null;
    }

    @Override
    public Optional<Materia> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Materia save(Materia materia) {
        return null;
    }

    @Override
    public void update(Long id, Materia materia) {

    }

    @Override
    public void delete(Long id) {

    }
}
