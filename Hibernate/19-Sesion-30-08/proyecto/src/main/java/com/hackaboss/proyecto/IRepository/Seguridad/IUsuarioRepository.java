package com.hackaboss.proyecto.IRepository.Seguridad;

import com.hackaboss.proyecto.Dto.ISeguridad.IUsuarioDto;
import com.hackaboss.proyecto.Entity.Seguridad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query(value = " SELECT " +
            "    u.id AS id, " +
            "    u.usuario, " +
            "    '****' AS contrasenia, " +
            "    p.id AS personaId, " +
            "    concat(p.primer_nombre,' ',p.segundo_nombre,' ',p.primer_apellido,' ',p.segundo_apellido) AS persona, " +
            "    r.id AS rolId, " +
            "    r.nombre AS rol " +
            " FROM " +
            "    usuario u " +
            "    INNER JOIN persona p ON u.persona_id = p.id " +
            "    INNER JOIN rol r ON u.rol_id = r.id ", nativeQuery = true)
    List<IUsuarioDto> getListUser();
}
