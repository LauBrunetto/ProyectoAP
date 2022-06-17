package com.portfolio.lb.Interface;

import com.portfolio.lb.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    
    //traer lista de persona
     public List<Persona> getPersona();
    
    //Guardar un objeto tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto por  buscado porID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
    
    
}
