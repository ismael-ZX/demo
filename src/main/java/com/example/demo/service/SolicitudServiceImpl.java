package com.example.demo.service;

import com.example.demo.model.Solicitud;
import org.springframework.stereotype.Service;

import  java.util.ArrayList;
import java.util.List;

@Service
public class SolicitudServiceImpl implements SolicitudService {
    // Lista en ,e,oria para simular la persistencia local de datos
    private List<Solicitud> listaSolicitudes = new ArrayList<>();
    private Long contadorId = 1L;

    @Override
    public List<Solicitud> listarTodas() {
        return  listaSolicitudes;
    }

    @Override
    public Solicitud obtenerPorId(Long id) {
        return listaSolicitudes.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Solicitud crearSolicitud(Solicitud solicitud) {
        solicitud.setId(contadorId++);
        listaSolicitudes.add(solicitud);
        return solicitud;
    }

    @Override
    public Solicitud actualizarSolicitud(Long id, Solicitud solicitudDetalles) {
        Solicitud solicitudExistente = obtenerPorId(id);
        if (solicitudExistente != null) {
            solicitudExistente.setDescripcion(solicitudDetalles.getDescripcion());
            solicitudExistente.setEstado(solicitudDetalles.getEstado());
            solicitudExistente.setCliente(solicitudDetalles.getCliente());
            solicitudExistente.setTecnico(solicitudDetalles.getTecnico());
            return solicitudExistente;
        }
        return null;
    }

    @Override
    public boolean eliminarSolicitud(Long id) {
        return listaSolicitudes.removeIf(s -> s.getId().equals(id));
    }
}
