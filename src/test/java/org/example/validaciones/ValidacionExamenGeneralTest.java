package org.example.validaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidacionExamenGeneralTest {

    private ValidacionExamenGeneral validacionExamenGeneral;

    @BeforeEach
    public void prepararPruebas(){
        this.validacionExamenGeneral=new ValidacionExamenGeneral();
    }

    @Test
    public void validarIdCorrecto(){
        Integer idPrueba=0;
        Boolean resultado= Assertions.assertDoesNotThrow(()->this.validacionExamenGeneral.validarId(idPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarIdIncorrecto(){
        Integer idPrueba=-50;
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionExamenGeneral.validarId(idPrueba));
        Assertions.assertEquals("Tu id debe ser positivo",resultado.getMessage());
    }

    @Test
    public void validarNombreCorrecto(){
        String nombrePrueba="Juan Pablo Berrio";
        Boolean resultado=Assertions.assertDoesNotThrow(()->this.validacionExamenGeneral.validarNombreExamen(nombrePrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarNombreIncorrectoTipoCaracteres(){
        String nombrePrueba="juan125*/.#";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionExamenGeneral.validarNombreExamen(nombrePrueba));
        Assertions.assertEquals("Recuerda que debes ingresar solo letras en este campo",resultado);
    }

    @Test
    public void validarNombreIncorrectoLongitud(){
        String nombrePrueba="examendet";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionExamenGeneral.validarNombreExamen(nombrePrueba));
        Assertions.assertEquals("El nombre del examen debe tener entre 10 y 150 caracteres",resultado);
    }

    @Test
    public void validarImagenExamenCorrecta(){
        String nombrePrueba="https/www.imagenexmaen.png*/.3.com%";
        Boolean resultado=Assertions.assertDoesNotThrow(()->this.validacionExamenGeneral.validarImagenExamen(nombrePrueba));
    }

    @Test
    public void validarImagenIncorrecta(){
//        INCOMPLETO
        String nombrePrueba="";
    }

}
