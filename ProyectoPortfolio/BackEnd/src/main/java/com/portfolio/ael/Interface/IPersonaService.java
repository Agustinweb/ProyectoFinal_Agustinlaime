package com.portfolio.ael.Interface;

import com.portfolio.ael.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    public List<Persona>getPersona();
    
    public void savePersona(Persona persona);
    
    public void deletePersona(Long id);
    
    public Persona findPersona(Long ig);
}
