package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Solicitud {

    private Long id;

    @NotBlank(message = "La descripción de la solicitud es obligatoria")
    private String descripcion;

    @NotBlank(message = "El estado es obligatorio")
    private String estado; // Ej: PENDIENTE, EN_PROCESO, RESUELTO

    @NotNull(message = "Los datos del cliente son obligatorios")
    private Cliente cliente;

    @NotNull(message = "Los datos del técnico asignado son obligatorios")
    private Tecnico tecnico;

    public Solicitud() {}

    public Solicitud(Long id, String descripcion, String estado, Cliente cliente, Tecnico tecnico) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = estado;
        this.cliente = cliente;
        this.tecnico = tecnico;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Tecnico getTecnico() { return tecnico; }
    public void setTecnico(Tecnico tecnico) { this.tecnico = tecnico; }
}