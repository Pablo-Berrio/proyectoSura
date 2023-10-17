package org.example.validaciones;

import org.example.validaciones.utilidades.Mensajes;
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
        Assertions.assertEquals(Mensajes.ID_NEGATIVO.getMensaje(),resultado.getMessage());
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
        Assertions.assertEquals(Mensajes.NOMBRES_FORMATO.getMensaje(),resultado.getMessage());
    }

    @Test
    public void validarNombreIncorrectoLongitud(){
        String nombrePrueba="examendet";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionExamenGeneral.validarNombreExamen(nombrePrueba));
        Assertions.assertEquals(Mensajes.NOMBRE_EXAMEN_LONGITUD.getMensaje(),resultado.getMessage());
    }

    @Test
    public void validarImagenCorrecta(){
        String nombrePrueba="https/www.imagenexmaen.png*/.3.com%";
        Boolean resultado=Assertions.assertDoesNotThrow(()->this.validacionExamenGeneral.validarImagenExamen(nombrePrueba));
    }

    @Test
    public void validarImagenIncorrecta(){
        String nombrePrueba="LoremIpsumLoremIpsumLoremIpsumLoremIpsumLoremIpsumLoremIpsumLoremIpsumLoremIpsumLoremIpsumLoremIpsumLoremIpsumLoremIpsumLoremIpsumLoremIpsumLoremIpsumLoremIpsumLoremIpsumLoremIpsumLoremIpsumLoremIpsuml";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionExamenGeneral.validarImagenExamen(nombrePrueba));
        Assertions.assertEquals(Mensajes.IMAGEN_EXAMEN.getMensaje(),resultado.getMessage());
    }

}
