package org.example.validaciones.utilidades;

public enum Mensajes {

    ID_NEGATIVO("El id no puede ser negativo"),
    NOMBRES_LONGITUD("el nombre debe tener entre 3 y 40 caracteres"),
    NOMBRES_FORMATO("El nombre no cumple con el formato requerido, recuerda que debes tener solo letras");

    private String Mensaje;

    Mensajes(String mensaje) {
        Mensaje = mensaje;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }



}
