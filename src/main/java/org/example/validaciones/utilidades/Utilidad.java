package org.example.validaciones.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidad {

    public Boolean buscarCoincidencia(String expresionRegular, String cadenaDeTexto){
        Pattern patron=Pattern.compile(expresionRegular);
        Matcher coincidencia=patron.matcher(cadenaDeTexto);
        if(coincidencia.matches()){
            return true;
        }else{
            return false;
        }
    }

}
