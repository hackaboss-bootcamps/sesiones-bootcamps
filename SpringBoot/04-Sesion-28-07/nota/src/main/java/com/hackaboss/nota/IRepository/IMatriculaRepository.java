package com.hackaboss.nota.IRepository;

import com.hackaboss.nota.Entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMatriculaRepository extends JpaRepository<Matricula, Long> {

}
