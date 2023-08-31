package com.hackaboss.proyecto.IRepository.Component;

import com.hackaboss.proyecto.Entity.Component.Auditoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;


//@Repository
//@NoRepositoryBean
public interface IBaseRepository <T extends Auditoria, ID> extends JpaRepository<T, ID> {
    //List<T> findByStateTrue();
}
