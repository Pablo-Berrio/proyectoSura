package org.example.entidades;

import org.example.validaciones.ValidacionSignoVital;

import java.time.LocalDate;

public class SignoVital {

    private Integer id;
    private String nombre;
    private Integer unidadMedida;
    private Double maximoNormal;
    private Double minimoNormal;
    private LocalDate fechaDeLaMuestra;
    ValidacionSignoVital validacionSignoVital=new ValidacionSignoVital();

    public SignoVital() {
    }

    public SignoVital(Integer id, String nombre, Integer unidadMedida, Double maximoNormal, Double minimoNormal, LocalDate fechaDeLaMuestra) {
        this.id = id;
        this.nombre = nombre;
        this.unidadMedida = unidadMedida;
        this.maximoNormal = maximoNormal;
        this.minimoNormal = minimoNormal;
        this.fechaDeLaMuestra = fechaDeLaMuestra;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        try {
            this.validacionSignoVital.validarId(id);
            this.id=id;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try {
            this.validacionSignoVital.validarNombre(nombre);
            this.nombre=nombre;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public Integer getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(Integer unidadMedida) {
        try {
            this.validacionSignoVital.validarUnidadMedida(unidadMedida);
            this.unidadMedida=unidadMedida;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public Double getMaximoNormal() {
        return maximoNormal;
    }

    public void setMaximoNormal(Double maximoNormal) {
        this.maximoNormal = maximoNormal;
    }

    public Double getMinimoNormal() {
        return minimoNormal;
    }

    public void setMinimoNormal(Double minimoNormal) {
        this.minimoNormal = minimoNormal;
    }

    public LocalDate getFechaDeLaMuestra() {
        return fechaDeLaMuestra;
    }

    public void setFechaDeLaMuestra(LocalDate fechaDeLaMuestra) {
        this.fechaDeLaMuestra = fechaDeLaMuestra;
    }

}
