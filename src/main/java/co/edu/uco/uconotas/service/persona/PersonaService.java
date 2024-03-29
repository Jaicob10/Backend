package co.edu.uco.uconotas.service.persona;

import co.edu.uco.uconotas.entity.PersonaEntity;
import co.edu.uco.uconotas.model.Persona;

import java.util.List;

public interface PersonaService {


    PersonaEntity findById(Long id);

    List<PersonaEntity> findAll();

    void deleteById(Long id);

    void save(PersonaEntity personaEntity);

    List<PersonaEntity> findByTipoDocumentoIdentidad(Integer id, String nroDocumento);




}
