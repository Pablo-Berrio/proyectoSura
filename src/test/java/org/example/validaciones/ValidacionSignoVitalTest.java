package org.example.validaciones;
import org.example.validaciones.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidacionSignoVitalTest {
    ValidacionSignoVital validacionSignoVital;
    @BeforeEach
    public void prepararPrueba()
    {
        this.validacionSignoVital = new ValidacionSignoVital();
    }
    @Test
    public void validarIdCorrecto()
    {
        Integer idPrueba = 8;
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionSignoVital.validarId(idPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarIdIncorrecto()
    {
        Integer idPrueba = -8;
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionSignoVital.validarId(idPrueba));
        Assertions.assertEquals(Mensajes.ID_NEGATIVO.getMensaje(), resultado.getMessage());
    }
    @Test
    public void validarNombreSignoVitalCorrecto()
    {
        String nombrePrueba = "Pulsopulso";
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionSignoVital.validarNombre(nombrePrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarNombreSignoVitalIncorrecto()
    {
        String nombrePrueba = "Pulso*/59";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionSignoVital.validarNombre(nombrePrueba));
        Assertions.assertEquals(Mensajes.NOMBRES_FORMATO.getMensaje(),resultado.getMessage());
    }

    @Test
    public void validarNombreSignoVitalIncorrectoLongitud(){
        String nombrePrueba="Loremipsumdolorsitametconsecteturadipiscingelitseddeiusmodemporincididuntutaboreetdoloremagnaaliquase";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionSignoVital.validarNombre(nombrePrueba));
        Assertions.assertEquals(Mensajes.NOMBRE_SIGNO_VITAL_LONGITUD.getMensaje(),resultado.getMessage());
    }
    @Test
    public void validarUnidadCorrecta()
    {
        Integer idPrueba = 8;
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionSignoVital.validarUnidadMedida(idPrueba));
        Assertions.assertTrue(resultado);

    }
    @Test
    public void validarUnidadIncorrecto()
    {
        Integer unidadPrueba = -8;
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionSignoVital.validarUnidadMedida(unidadPrueba));
        Assertions.assertEquals(Mensajes.UNIDAD_MEIDAD_SIGNO_VITAL.getMensaje(), resultado.getMessage());
    }

}
