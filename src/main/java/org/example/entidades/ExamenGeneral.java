package org.example.entidades;

import org.example.validaciones.ValidacionExamenGeneral;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExamenGeneral {

    private Integer id;
    private String nombreExamen;
    private LocalDate fechaExamen;
    private String imagenExamen;
    ValidacionExamenGeneral validacionExamenGeneral=new ValidacionExamenGeneral();

    public ExamenGeneral() {
    }

    public ExamenGeneral(Integer id, String nombreExamen, LocalDate fechaExamen, String imagenExamen) {
        this.id = id;
        this.nombreExamen = nombreExamen;
        this.fechaExamen = fechaExamen;
        this.imagenExamen = imagenExamen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        try {
            this.validacionExamenGeneral.validarId(id);
            this.id=id;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getNombreExamen() {
        return nombreExamen;
    }

    public void setNombreExamen(String nombreExamen) {
        try {
            this.validacionExamenGeneral.validarNombreExamen(nombreExamen);
            this.nombreExamen=nombreExamen;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public LocalDate getFechaExamen() {
        return fechaExamen;
    }

    public void setFechaExamen(LocalDate fechaExamen) {
        this.fechaExamen = fechaExamen;
    }

    public String getImagenExamen() {
        return imagenExamen;
    }

    public void setImagenExamen(String imagenExamen) {
        try {
            this.validacionExamenGeneral.validarImagenExamen(imagenExamen);
            this.imagenExamen=imagenExamen;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

}
