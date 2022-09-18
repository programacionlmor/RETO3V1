package com.usa.ciclo3.reto3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.usa.ciclo3.reto3.model.Papeleria;
import com.usa.ciclo3.reto3.repository.CRUD.PapeleriaCrudRepositoryInterfaz;

@Repository
public class PapeleriaRepository {

    @Autowired
    private PapeleriaCrudRepositoryInterfaz papeleriaCrudRepositoryInterfaz;

    public  List<Papeleria>  obtenerPapeleriaCompleta(){
        return (List<Papeleria>) papeleriaCrudRepositoryInterfaz.findAll();
    }

    public Optional<Papeleria> obtenerPapeleriaId(Integer id){
        return papeleriaCrudRepositoryInterfaz.findById(id);
    }

    public Papeleria  salvarPapeleria(Papeleria papeleria){
        return papeleriaCrudRepositoryInterfaz.save(papeleria);
        
    }
    
}
