package com.martinbordon.exploradorturistico.modelos;

import java.io.Serializable;
import java.time.LocalTime;

public class Lugar implements Serializable {
    private String nombre;
    private String descripcion;
    private String foto;
    private LocalTime horaApertura;

    public Lugar(String nombre, String descripcion, String foto, LocalTime horaApertura) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.foto = foto;
        this.horaApertura = horaApertura;
    }

    public Lugar() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public LocalTime getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(LocalTime horaApertura) {
        this.horaApertura = horaApertura;
    }
}
