package com.usa.ciclo3.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usa.ciclo3.reto3.model.Papeleria;
import com.usa.ciclo3.reto3.repository.PapeleriaRepository;

@Service
public class PapeleriaService {
    
    
    @Autowired
    private PapeleriaRepository papeleriaRepository;

    public List<Papeleria> obtenerPapeleriaCompleta(){
        return papeleriaRepository.obtenerPapeleriaCompleta();
    }

    public Optional<Papeleria> obtenerPapeleriaId(Integer id){
        return papeleriaRepository.obtenerPapeleriaId(id);
    }
    public Papeleria  salvarPapeleria(Papeleria papeleria){
        if (papeleria.getId()==null){
            return papeleriaRepository.salvarPapeleria(papeleria);
        }
        else{

            Optional <Papeleria> papeleriaAuxiliar = papeleriaRepository.obtenerPapeleriaId(papeleria.getId());
            if (papeleriaAuxiliar.isEmpty()){
                return papeleriaRepository.salvarPapeleria(papeleria);
            }
            else{
                return papeleria;
            }
        }

    }
}
