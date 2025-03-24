package org.example.domain;

import net.datafaker.Faker;

import java.util.Random;

public class Elemento implements Comparable<Elemento>{
    private String id;
    private String palabra;
    private String categoria;
    public Elemento(String id, String palabra, String categoria) {
        this.id = id;
        this.palabra = palabra;
        this.categoria = categoria;
    }

    public Elemento() {
        Random r = new Random();
        this.id = String.valueOf(r.nextInt(100));
        this.palabra = new Faker().movie().name();
        this.categoria="movies";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public int compareTo(Elemento o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "id='" + id + '\'' +
                ", palabra='" + palabra + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
    public String toStringFichero(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.id);
        sb.append(";");
        sb.append(this.palabra);
        sb.append(";");
        sb.append(this.categoria);
        return toString();
    }
}
