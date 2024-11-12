package com.codigo;

import java.util.Scanner;

public class Codigo5 {
    
    public static void main(String[] args) {
        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner s = new Scanner(System.in);
        
        // Pedir al usuario que introduzca un número
        System.out.print("Introduzca un número: ");
        
        // Leer la entrada del usuario como cadena de texto
        String niString = s.nextLine();
        
        // Convertir la cadena de texto a un entero
        int ni = Integer.parseInt(niString);
        int c = ni; // Guardar el valor original del número introducido
        
        int afo = 0; // Contador para dígitos afortunados
        int noAfo = 0; // Contador para dígitos no afortunados
        
        // Procesar cada dígito del número
        while (ni > 0) {
            int digito = (int)(ni % 10); // Obtener el último dígito
            // Verificar si el dígito es afortunado
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++; // Incrementar el contador de dígitos afortunados
            } else {
                noAfo++; // Incrementar el contador de dígitos no afortunados
            }
            ni /= 10; // Eliminar el último dígito del número
        }
        
        // Determinar si el número es afortunado o no
        if (afo > noAfo) {
            System.out.println("El " + c + " es un número afortunado.");
        } else {
            System.out.println("El " + c + " no es un número afortunado.");
        }
        
        // Cerrar el Scanner
        s.close();
    }
}
