package co.edu.uco.uconotas.converter;

import co.edu.uco.uconotas.entity.PersonaEntity;
import co.edu.uco.uconotas.model.Persona;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class PersonaConverter {
    public Persona entityToModel(PersonaEntity personaEntity){
        var persona = new Persona();
        persona.setId(personaEntity.getId());
        persona.setNombre(persona.getNombre());
        persona.setApellido(persona.getApellido());

        return persona;
    }

    public PersonaEntity modelToEntity(Persona persona){
        var personaEntity = new PersonaEntity();

        personaEntity.setId(persona.getId());
        personaEntity.setNombre(persona.getNombre());
        personaEntity.setApellido(persona.getApellido());
        return personaEntity;

    }
    public List<Persona> entityToModel(List<PersonaEntity> personasEntity){
        List<Persona> personas = new ArrayList<>(personasEntity.size());

        /*for(int i = 0; i< personas.size(); i++){
            personas.add(entityToModel(personasEntity.get(i)));
        }

        for(PersonaEntity persona: personasEntity){
            personas.add(entityToModel(persona));
        }*/

        personasEntity.forEach(entity -> {
            personas.add(entityToModel(entity));
        });
        return personas;
    }


}
