package com.example.NutreApp.models;

import java.time.LocalDate;
import java.util.UUID;

public class Visualizacion {
    private UUID id;
    private LocalDate fecha_visualizaciones;
    private boolean completado;
    public Visualizacion() {
    }
    public Visualizacion(UUID id, LocalDate fecha_visualizaciones, boolean completado) {
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
    public LocalDate getFecha_visualizaciones() {
        return fecha_visualizaciones;
    }
    public void setFecha_visualizaciones(LocalDate fecha_visualizaciones) {
        this.fecha_visualizaciones = fecha_visualizaciones;
    }
    public boolean isCompletado() {
        return completado;
    }
    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
    
}
