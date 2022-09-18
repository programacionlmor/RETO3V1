package com.usa.ciclo3.reto3.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.usa.ciclo3.reto3.model.Papeleria;
import com.usa.ciclo3.reto3.service.PapeleriaService;


@RestController
@RequestMapping("/api/papeleria")
@CrossOrigin (origins ="*",methods ={RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class PapeleriaController {
    
    @Autowired
    private PapeleriaService papeleriaService;

    @GetMapping("/papeleriacompleta")
    public List<Papeleria> obtenerPapeleriaCompleta(){
        return papeleriaService.obtenerPapeleriaCompleta();
    }
    @GetMapping("/{id}")
    public Optional<Papeleria> obtenerPapeleriaId(@PathVariable("id)") Integer identificador){
        return papeleriaService.obtenerPapeleriaId(identificador);
    }

    @PostMapping("salvarpapeleria")
    @ResponseStatus(HttpStatus.CREATED)
    public Papeleria salvarPapeleria(@RequestBody Papeleria papeleria){
        return papeleriaService.salvarPapeleria(papeleria);

    }
}
