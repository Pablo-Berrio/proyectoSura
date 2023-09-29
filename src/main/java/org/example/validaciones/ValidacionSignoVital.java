package org.example.validaciones;

import org.example.validaciones.utilidades.Utilidad;

public class ValidacionSignoVital {

    public ValidacionSignoVital() {
    }
    Utilidad utilidad=new Utilidad();

    public Boolean validarId(Integer id)throws Exception{
        if (id<0){
            throw new Exception("El id debe ser positivo");
        }
        return true;
    }

    public Boolean validarNombre(String nombre)throws Exception{
        String expresionRegular="^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,nombre)){
            throw new Exception("Recuerda que debes ingresar solo letras en este campo");
        }

        if (nombre.length()<10 || nombre.length()>100){
            throw new Exception("El nombre no puede tener menos de diez letras");
        }
        return true;
    }

    public Boolean validarUnidadMedida(Integer unidadMedida)throws Exception{
        if (unidadMedida<0){
            throw new Exception("La unidad de medida esta estandarizada en numeros positivos");
        }
        return true;
    }

}
