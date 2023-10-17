package org.example.validaciones;

import org.example.validaciones.utilidades.Mensajes;
import org.example.validaciones.utilidades.Utilidad;

public class ValidacionExamenGeneral {

    public ValidacionExamenGeneral() {
    }

    Utilidad utilidad=new Utilidad();

    public Boolean validarId(Integer id)throws Exception{
        if (id<0){
            throw new Exception(Mensajes.ID_NEGATIVO.getMensaje());
        }
        return true;
    }

    public Boolean validarNombreExamen(String nombreExamen)throws Exception{
        String expresionRegular="^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,nombreExamen)){
            throw new Exception(Mensajes.NOMBRES_FORMATO.getMensaje());
        }

        if (nombreExamen.length()<10 || nombreExamen.length()>150){
            throw new Exception(Mensajes.NOMBRE_EXAMEN_LONGITUD.getMensaje());
        }
        return true;
    }

    public Boolean validarImagenExamen(String imagenExamen)throws Exception{
        if (imagenExamen.length()>200){
            throw new Exception(Mensajes.IMAGEN_EXAMEN.getMensaje());
        }
        return true;
    }

}
