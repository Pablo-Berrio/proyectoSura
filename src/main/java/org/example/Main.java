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
        
        System.out.println("Ingrese su documento");
        afiliado.setDocumento(entradaTeclado.nextLine());

        System.out.println("Ingrese su telefono");
        afiliado.setTelefono(entradaTeclado.nextLine());

    }
}