package com.hackaboss.nota.IRepository;

import com.hackaboss.nota.Entity.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMateriaRepository extends JpaRepository<Materia,Long> {
}
