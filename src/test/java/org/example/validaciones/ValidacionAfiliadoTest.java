package org.example.validaciones;

import org.example.entidades.Afiliado;
import org.example.validaciones.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionAfiliadoTest {

    private ValidacionAfiliado validacionAfiliado;
    @BeforeEach
    public void prepararPruebas(){
        this.validacionAfiliado = new ValidacionAfiliado();
    }

    @Test
    public void ValidarIdCorrecto(){
        Integer idPrueba = 0;
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarId(idPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void ValidarIdIncorrecto(){
        Integer idPrueba = -50;
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarId(idPrueba));
        Assertions.assertEquals(Mensajes.ID_NEGATIVO.getMensaje(),resultado.getMessage());
    }

    @Test
    public void ValidarNombreCorrecto(){
        String nombrePrueba = "Juan";
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarNombres(nombrePrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void ValidarNombreIncorrectoTipoCaracteres(){
        String nombrePrueba = "Juan12345*";
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensajes.NOMBRES_FORMATO.getMensaje(),resultado.getMessage());
    }
    @Test
    public void ValidarNombreIncorrectoLongitud(){
        String nombrePrueba = "Ju";
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensajes.NOMBRES_LONGITUD.getMensaje(),resultado.getMessage());
    }
    @Test
    public void ValidarApellidosCorrecto(){
        String apellidosPrueba = "Gallego Mesa";
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarApellidos(apellidosPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void ValidarApellidosIncorrectoLongitud(){
        String apellidosPrueba = "Gallego";
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarApellidos(apellidosPrueba));
        Assertions.assertEquals(Mensajes.APELLIDOS_LONGITUD.getMensaje(),resultado.getMessage());
    }
    @Test
    public void ValidarApellidosIncorrectoTipoCaracteres(){
        String apellidosPrueba = "Gallego 12345";
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarApellidos(apellidosPrueba));
        Assertions.assertEquals(Mensajes.APELLIDOS_FORMATO.getMensaje(),resultado.getMessage());
    }
    @Test
    public void ValidarDocumentoCorrecto(){
        String documentoPrueba = "1007412000";
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarDocumento(documentoPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void ValidarDocumentoIncorrectoLongitud(){
        String documentoPrueba = "100";
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarDocumento(documentoPrueba));
        Assertions.assertEquals(Mensajes.DOCUMENTO_LONGITUD.getMensaje(),resultado.getMessage());
    }
    @Test
    public void ValidarCiudadCorrecto(){
        Integer ciudadPrueba = 156;
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarCiudad(ciudadPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void ValidarCiudadIncorrecta(){
        Integer ciudadPrueba = 1127;
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarCiudad(ciudadPrueba));
        Assertions.assertEquals(Mensajes.CIUDAD_INCORRECTA.getMensaje(),resultado.getMessage());
    }
    @Test
    public void ValidarDepartamentoCorrecto(){
        Integer departamentoPrueba = 15;
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarDepartamento(departamentoPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void ValidarDepartamentoIncorrecto(){
        Integer departamentoPrueba = 112;
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarDepartamento(departamentoPrueba));
        Assertions.assertEquals(Mensajes.DEPARTAMENTO_INCORRECTO.getMensaje(),resultado.getMessage());
    }
    @Test
    public void ValidarCorreoCorrecto(){
        String correoPrueba = "asasds@gmail.com";
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarCorreo(correoPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void ValidarCorreoIncorrecta(){
        String correoPrueba = "asasds gmailcom";
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarCorreo(correoPrueba));
        Assertions.assertEquals(Mensajes.CORREO_FORMATO.getMensaje(),resultado.getMessage());
    }
    @Test
    public void ValidarTelefonoCorrecto(){
        String telefonoPrueba = "3105896472";
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarTelefono(telefonoPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void ValidarTelefonoIncorrectoLongitud(){
        String telefonoPrueba = "562";
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarTelefono(telefonoPrueba));
        Assertions.assertEquals(Mensajes.TELEFONO_LONGITUD.getMensaje(),resultado.getMessage());
    }
    @Test
    public void ValidarTelefonoIncorrectoTipoCaracteres(){
        String telefonoPrueba = "56ads223s2";
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarTelefono(telefonoPrueba));
        Assertions.assertEquals(Mensajes.TELEFONO_FORMATO.getMensaje(),resultado.getMessage());
    }


}