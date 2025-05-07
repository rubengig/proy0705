package com.proyecto.proyecto.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.proyecto.entity.usuarioEntity;

@Repository
public interface usuarioRepository extends JpaRepository<usuarioEntity, Long> {

     Page<usuarioEntity> findByNombreContainingOrApellido1ContainingOrApellido2ContainingOrEmailContaining(
            String filter, String filter2, String filter3, String filter4, Pageable oPageable);
    
}
