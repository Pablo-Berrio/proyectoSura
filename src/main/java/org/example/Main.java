package org.example;

import org.example.entidades.Afiliado;
import org.example.entidades.ExamenGeneral;
import org.example.entidades.SignoVital;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Afiliado afiliado=new Afiliado();
        afiliado.setId(100);
        afiliado.setDocumento("1234567789");
        afiliado.setNombres("Juan Pablo");
        afiliado.setApellidos("Berrio Berrio");
        afiliado.setFechaNacimiento(LocalDate.of(1999,12,14));
        afiliado.setCiudad(2);
        afiliado.setDepartamento(4);
        afiliado.setCorreoElectronico("juanpablo@gamil.com");
        afiliado.setTelefono("3227514869");

        SignoVital signoVital=new SignoVital();
        signoVital.setId(100);
        signoVital.setNombre("Juan Pablo");
        signoVital.setFechaDeLaMuestra(LocalDate.of(2023,9,23));
        signoVital.setUnidadMedida(100);
        signoVital.setMaximoNormal(125.5);
        signoVital.setMinimoNormal(80.5);

        ExamenGeneral examenGeneral=new ExamenGeneral();
        examenGeneral.setId(100);
        examenGeneral.setNombreExamen("test UKK");
        examenGeneral.setFechaExamen(LocalDate.of(2023,9,23));
        examenGeneral.setImagenExamen("https.url/imagen.examen");

    }
}