package com.tech4music.musicas.database;

import java.util.List;

import com.tech4music.musicas.Repository.MusicaRepository;
import com.tech4music.musicas.model.Musica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/musicas")
public class MusicaREST {
    
    @Autowired
    private MusicaRepository repositorio;

    
    @GetMapping
    public List<Musica> obterTodos(){
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Musica musica){
      repositorio.save(musica);
    }
    
    @PutMapping
    public void alterar(Musica musica){
        if(musica.getId() > 0)
        repositorio.save(musica);
    }

    @DeleteMapping
    public void excluir(Musica musica){
        repositorio.delete(musica);
    }

}
