package com.example.concepcion.moldes;

public class MoldeHotel {

    private String nombre;
    private String desc;
    private String precios;
    private Integer foto;

    public MoldeHotel(String nombre, String desc, String precios, Integer foto) {
        this.nombre = nombre;
        this.desc = desc;
        this.precios = precios;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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
