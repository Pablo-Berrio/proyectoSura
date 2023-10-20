package org.example.validaciones;

import org.example.validaciones.utilidades.Mensajes;
import org.example.validaciones.utilidades.Utilidad;

public class ValidacionSignoVital {

    public ValidacionSignoVital() {
    }
    Utilidad utilidad=new Utilidad();

    public Boolean validarId(Integer id)throws Exception{
        if (id<0){
            throw new Exception(Mensajes.ID_NEGATIVO.getMensaje());
        }
        return true;
    }

    public Boolean validarNombre(String nombre)throws Exception{
        String expresionRegular="^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,nombre)){
            throw new Exception(Mensajes.NOMBRES_FORMATO.getMensaje());
        }

        if (nombre.length()<10 || nombre.length()>100){
            throw new Exception(Mensajes.NOMBRE_SIGNO_VITAL_LONGITUD.getMensaje());
        }
        return true;
    }

    public Boolean validarUnidadMedida(Integer unidadMedida)throws Exception{
        if (unidadMedida<0){
            throw new Exception(Mensajes.UNIDAD_MEIDAD_SIGNO_VITAL.getMensaje());
        }
        return true;
    }

}
