package org.example.validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionAfiliado {

    public ValidacionAfiliado() {
    }

    public Boolean validarId(Integer id) throws Exception{
        if(id<0){
            throw new Exception("El id no puede ser negativo");
        }
        //PASE TODAS LAS VALIDACIONES
        return true;
    }

    public Boolean validarNombres(String nombre)throws Exception{
        //longitud sea menor 3 o mayor que 40
        if(nombre.length()<3 || nombre.length()>40){
            throw new Exception("el nombre debe tener entre 3 y 40 caracteres");
        }
        //el formato del nombre tiene numeros o caracteres especiales
        String expresionRegular="^[a-zA-Z]+$";

        //busco la coincidencia entre la expresionregular
        //y mi string
        Pattern patron=Pattern.compile(expresionRegular);
        Matcher coincidencia=patron.matcher(nombre);
        if(coincidencia.matches()){
            System.out.println("tenemos coincidencia, cumple");
            return true;
        }else{
            System.out.println("No tenemos coincidencia");
            return false;
        }

    }

    public Boolean validarApellidos(String apellidos)throws Exception{
        //el apellido debe estar en un rango entre 10 y 50 caracteres
        if (apellidos.length()<10 || apellidos.length()>50){
            throw new Exception("El apellido debe tener entre 10 y 50 caracteres");
        }
        //el apellido no debe tener numeros o caracteres especiales
        String expresionRegular="^[a-zA-Z]+$";
        Pattern patron=Pattern.compile(expresionRegular);
        Matcher coincidenciaApellidos= patron.matcher(apellidos);
        if (coincidenciaApellidos.matches()){
            System.out.println("el apellido cumple las condiciones requeridas por el software");
            return true;
        }else {
            System.out.println("el apellido no cumple las condiciones requeridas por el software");
            return false;
        }
        //return true;
    }

    public Boolean validarDocumento(String documento)throws Exception{
        //EL DOCUMENTO NO PUEDE TENER MAS DE 10 DIGITOS
        if (documento.length()<7 || documento.length()>10){
            throw new Exception("El documento debe tener minimo 7 numeros y maximo 10");
        }

        //EL DOCUMENTO SOLO PUEDE TENER NUMEROS
        String expresionRegular="^[0-9]+$";
        Pattern patron=Pattern.compile(expresionRegular);
        Matcher coincidenciaDocumento=patron.matcher(documento);
        if (coincidenciaDocumento.matches()){
            System.out.println("el documento cumple con todos los requerimientos");
            return true;
        }else {
            System.out.println("el documento no cumple los requerimientos");
            return false;
        }

    }

    public Boolean validarCiudad(Integer ciudad)throws Exception{
        //LA CIUDAD NO PUEDE TENER NUMEROS NEGATIVOS Y NO PUEDE SER MAYOR A 1123
        if (ciudad<1 || ciudad>1123){
            throw new Exception("Ingresa un numero positivo y menor o igual a 1123");
        }
        return true;
    }

    public Boolean validarDepartamento(Integer departamento)throws Exception{
        //EL NUMERO DE DEPARTAMENTO NO PUEDE SER NEGATIVO NI MAYOR A 32
        if (departamento<1 || departamento>32){
            throw new Exception("Ingresa numero entre 1 y 32");
        }
        return true;
    }

    public Boolean validarCorreo(String correo)throws Exception{
        //EL CORREO DEBE CUMPLIR CON EL FORMATO DE CORREO
        String expresionRegular="^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern patron=Pattern.compile(expresionRegular);
        Matcher coincidenciaCorreo= patron.matcher(correo);
        if (coincidenciaCorreo.matches()){
            System.out.println("el correo cumple con el formato requerido");
        }else {
            throw new Exception("El correo no cumple con el formato, validalo");
        }
        return true; //PREGUNTARLE AL PROFE POR ESTA VALIDACION
    }

    public Boolean validarTelefono(String telefono)throws Exception{
        //EL TELEFONO DEBE TENER EXACTAMENTE 10 DIGITOS
        if (telefono.length() != 10){
            throw new Exception("Tu telefono debe tener exactamente 10 digitos porque estamos en colombia mi amigo");
        }

        String expresionRegular="^[0-9]+$";
        Pattern patron=Pattern.compile(expresionRegular);
        Matcher coincidenciaTelefono= patron.matcher(telefono);
        if (coincidenciaTelefono.matches()){
            System.out.println("El telefono cumple con el formato de telefono");
            return true;
        }else {
            System.out.println("El telefono no cumple con el formato de telefono");
            return false;
        }

    }

}
