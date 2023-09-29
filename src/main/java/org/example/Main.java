package org.example;

import org.example.entidades.Afiliado;
import org.example.entidades.ExamenGeneral;
import org.example.entidades.SignoVital;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entradaTeclado=new Scanner(System.in);
        Afiliado afiliado=new Afiliado();
        ExamenGeneral examenGeneral=new ExamenGeneral();
        SignoVital signoVital=new SignoVital();

        System.out.println("Ingrese su documento");
        afiliado.setDocumento(entradaTeclado.nextLine());

        System.out.println("Ingrese su telefono");
        afiliado.setTelefono(entradaTeclado.nextLine());

        System.out.println("Ingrese su id");
        examenGeneral.setId(entradaTeclado.nextInt());

        System.out.println("ingresa tu nombre");
        signoVital.setNombre(entradaTeclado.nextLine());

        System.out.println("ingresa la unidad de medida");
        signoVital.setUnidadMedida(entradaTeclado.nextInt());

    }
}