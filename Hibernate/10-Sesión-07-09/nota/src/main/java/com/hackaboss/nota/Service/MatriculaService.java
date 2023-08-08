package com.hackaboss.nota.Service;

import com.hackaboss.nota.Entity.Materia;
import com.hackaboss.nota.Entity.Matricula;
import com.hackaboss.nota.IRepository.IMatriculaRepository;
import com.hackaboss.nota.IService.IMatriculaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaService implements IMatriculaService {
    private IMatriculaRepository repository;

    @Override
    public List<Matricula> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Matricula> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Matricula save(Matricula matricula) {
        return repository.save(matricula);
    }

    @Override
    public void update(Long id, Matricula matricula) {
        //op es el objeto que va validar si existe un registro con el id que llega por parametro [id]
        Optional<Matricula> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Matricula matriculaUpdate = op.get();
            matriculaUpdate.setEstudianteId(matricula.getEstudianteId());
            matriculaUpdate.setMateriaId(matricula.getMateriaId());
            matriculaUpdate.setNota(matricula.getNota());

            //Actualizar el objeto
            repository.save(matriculaUpdate);
        }
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
