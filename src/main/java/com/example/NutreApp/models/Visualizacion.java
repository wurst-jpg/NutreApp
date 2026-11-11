package com.example.NutreApp.models;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Visualizacion {
    @Id 
    @GeneratedValue( strategy = GenerationType.UUID)
    private UUID id;

    @Column (name ="fecha_visualizaciones", nullable = false, unique = false,length = 100)
    private String fecha_visualizaciones;

    @Column (name ="completado", nullable = false, unique = false)
    private boolean completado;

    public Visualizacion() {
    }
    public Visualizacion(UUID id, String fecha_visualizaciones, boolean completado) {
        this.id = id;
        this.fecha_visualizaciones = fecha_visualizaciones;
        this.completado = completado;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getFecha_visualizaciones() {
        return fecha_visualizaciones;
    }
    public void setFecha_visualizaciones(String fecha_visualizaciones) {
        this.fecha_visualizaciones = fecha_visualizaciones;
    }
    public boolean isCompletado() {
        return completado;
    }
    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
    
}
