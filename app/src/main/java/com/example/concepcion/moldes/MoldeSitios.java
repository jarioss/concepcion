package com.example.concepcion.moldes;

public class MoldeSitios {

    private String nombre;
    private String precios;
    private Integer foto;

    public MoldeSitios(String nombre, String precios, Integer foto) {
        this.nombre = nombre;
        this.precios = precios;
        this.foto = foto;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
