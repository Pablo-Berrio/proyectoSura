package org.example.validaciones.utilidades;

public enum Mensajes {

    ID_NEGATIVO("El id no puede ser negativo"),

    NOMBRES_LONGITUD("el nombre debe tener entre 3 y 40 caracteres"),
    NOMBRES_FORMATO("El nombre no cumple con el formato requerido, recuerda que debes tener solo letras"),

    APELLIDOS_LONGITUD("El apellido debe tener entre 10 y 50 caracteres"),
    APELLIDOS_FORMATO("El apellido no cumple con el formato requerido"),

    DOCUMENTO_LONGITUD("El documento debe tener minimo 7 numeros y maximo 10"),
    DOCUMENTO_FORMATO("Recuerda que debes ingresar solo numeros"),

    CIUDAD_INCORRECTA("Ingresa un numero positivo y menor o igual a 1123"),

    DEPARTAMENTO_INCORRECTO("Ingresa numero entre 1 y 32"),

    CORREO_FORMATO("Debes ingresar un correo valido"),

    TELEFONO_LONGITUD("Tu telefono debe tener exactamente 10 digitos porque estamos en colombia mi amigo"),
    TELEFONO_FORMATO("Debes ingresar solo numeros"),
    NOMBRE_EXAMEN_LONGITUD("El nombre del examen debe tener entre 10 y 150 caracteres"),
    IMAGEN_EXAMEN("La longitud maxima para este campo es de 200 caracteres"),
    NOMBRE_SIGNO_VITAL_LONGITUD("El nombre debe tener entre 10 y 100 letras"),
    UNIDAD_MEIDAD_SIGNO_VITAL("La unidad de medida esta estandarizada en numeros positivos"),
    ;


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
