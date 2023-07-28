package com.example.concepcion.moldes;

public class MoldeRestau {
    private String nombre;
    private String plato;
    private String precios;
    private Integer foto;

    public MoldeRestau(String nombre, String plato, String precios, Integer foto) {
        this.nombre = nombre;
        this.plato = plato;
        this.precios = precios;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public String getPrecios() {
        return precios;
    }

    public void setPrecios(String precios) {
        this.precios = precios;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }
}
