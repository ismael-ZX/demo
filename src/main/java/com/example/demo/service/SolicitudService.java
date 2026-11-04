package com.example.demo.service;

import com.example.demo.model.Solicitud;
import java.util.List;

public interface SolicitudService{
    List<Solicitud> listarTodas();
    Solicitud obtenerPorId(Long id);
    Solicitud crearSolicitud(Solicitud solicitud);
    Solicitud actualizarSolicitud(Long id, Solicitud solicitudDetalles);
    boolean eliminarSolicitud(Long id);
}
