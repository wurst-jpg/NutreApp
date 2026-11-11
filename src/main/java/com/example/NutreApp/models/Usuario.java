package com.example.NutreApp.models;

import java.util.UUID;

import com.example.NutreApp.models.helpers.Departamento;
import com.example.NutreApp.models.helpers.Rol;

public class Usuario {
    private UUID id;
    private String nombre;
    private String correo;
    private Rol rol;
    private Departamento departamento;
    private String contrasenia_hash;
    public Usuario() {
    }
    public Usuario(UUID id, String nombre, String correo, Rol rol, Departamento departamento, String contrasenia_hash) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
        this.departamento = departamento;
        this.contrasenia_hash = contrasenia_hash;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Rol getRol() {
        return rol;
    }
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public String getContrasenia_hash() {
        return contrasenia_hash;
    }
    public void setContrasenia_hash(String contrasenia_hash) {
        this.contrasenia_hash = contrasenia_hash;
    }
    
    
}
