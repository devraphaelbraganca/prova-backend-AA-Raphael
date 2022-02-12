package com.tech4music.musicas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("musica")
public class Musica {
    @Id
    private int id;
    private String titulo;
    private String artista;
    private String album;
    private String genero;
    private int anoLancamento;


    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    private String compositor;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getCompositor() {
        return compositor;
    }
    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }


}
