package org.example.validaciones;

import org.example.validaciones.utilidades.Utilidad;

public class ValidacionExamenGeneral {

    public ValidacionExamenGeneral() {
    }

    Utilidad utilidad=new Utilidad();

    public Boolean validarId(Integer id)throws Exception{
        if (id<0){
            throw new Exception("Tu id debe ser positivo");
        }
        return true;
    }

    public Boolean validarNombreExamen(String nombreExamen)throws Exception{
        String expresionRegular="^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,nombreExamen)){
            throw new Exception("Recuerda que debes ingresar solo letras en este campo");
        }

        if (nombreExamen.length()<10 || nombreExamen.length()>150){
            throw new Exception("El nombre del examen debe tener entre 10 y 150 caracteres");
        }
        return true;
    }

    public Boolean validarImagenExamen(String imagenExamen)throws Exception{
        if (imagenExamen.length()>200){
            throw new Exception("La longitud maxima para este campo es de 200 caracteres");
        }
        return true;
    }

}
