package com.tech4music.musicas.Repository;

import com.tech4music.musicas.model.Musica;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MusicaRepository extends MongoRepository <Musica,String> {
    
}
