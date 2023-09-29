package org.example.validaciones;

import org.example.validaciones.utilidades.Utilidad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionAfiliado {

    Utilidad utilidad=new Utilidad();
    public ValidacionAfiliado() {
    }

    public Boolean validarId(Integer id) throws Exception{
        if(id<0){
            throw new Exception("El id no puede ser negativo");
        }
        return true;
    }

    public Boolean validarNombres(String nombre)throws Exception{
        if(nombre.length()<3 || nombre.length()>40){
            throw new Exception("el nombre debe tener entre 3 y 40 caracteres");
        }

        String expresionRegular="^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,nombre)){
            throw new Exception("El nombre no cumple con el formato requerido, recuerda que debes tener solo letras");
        }
        return true;
    }

    public Boolean validarApellidos(String apellidos)throws Exception{
        if (apellidos.length()<10 || apellidos.length()>50){
            throw new Exception("El apellido debe tener entre 10 y 50 caracteres");
        }

        String expresionRegular="^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,apellidos)){
            throw new Exception("El apellido no cumple con el formato requerido");
        }
        return true;
    }

    public Boolean validarDocumento(String documento)throws Exception{
        if (documento.length()<7 || documento.length()>10){
            throw new Exception("El documento debe tener minimo 7 numeros y maximo 10");
        }

        String expresionRegular="^[0-9]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,documento)){
            throw new Exception("Recuerda que debes ingresar solo numeros");
        }
        return true;
    }

    public Boolean validarCiudad(Integer ciudad)throws Exception{
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

        String expresionRegular="^[A-Za-z0-9+_.-]+@(.+)$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,correo)){
            throw new Exception("Debes ingresar un correo valido");
        }
        return true;
    }

    public Boolean validarTelefono(String telefono)throws Exception{

        if (telefono.length() != 10){
            throw new Exception("Tu telefono debe tener exactamente 10 digitos porque estamos en colombia mi amigo");
        }

        String expresionRegular="^[0-9]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,telefono)){
            throw new Exception("Debes ingresar solo numeros");
        }
        return true;
    }

}
