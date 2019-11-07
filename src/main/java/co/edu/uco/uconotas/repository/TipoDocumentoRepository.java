package co.edu.uco.uconotas.repository;

import co.edu.uco.uconotas.entity.PersonaEntity;
import co.edu.uco.uconotas.entity.TipoDocumentoIdentidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoDocumentoRepository extends JpaRepository<TipoDocumentoIdentidadEntity,Integer> {
}
