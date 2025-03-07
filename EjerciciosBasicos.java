/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios.basicos;

/**
 *
 * @author s0733
 */
public class EjerciciosBasicos {
//Ejercicios prácticos # 1: Programando en Java
    public static void main(String[] args) {
        System.out.println("Ejercicio 1");
        // Ejercicio 1: Crear el código que imprima la siguiente salida: 
        System.out.println("Hola, soy Sharon Osorio");
        
        System.out.println("Ejercicio 2");
        //Ejercicio 2: Crear un programa que imprima en consola todas las operaciones
        //aritmeticas de dos números enteros
        int num1 = 2;
        int num2 = 4;
        System.out.println("Suma: "+ (num1+num2));
        System.out.println("Resta: "+ (num1-num2));
        System.out.println("Multiplicacion: "+ (num1*num2));
        System.out.println("Division: "+ (num1/num2));
        System.out.println("Mod: "+ (num1%num2));
        
        System.out.println("Ejercicio 3");
        //Ejercicio 3: Dadas las variables de tipo int M = 6, T = 1, K = -10 indicar si la evaluación
        //de estas expresiones daría como resultado verdadero o falso:
        int M = 6, T = 1, K = -10;
        System.out.println("M > T: " + (M > T));
        System.out.println("T / K == -5: " + (T / K == -5));
        System.out.println("(M+T == 7) || (M-T == 5): " + ((M + T == 7) || (M - T == 5)));
        
        System.out.println("Ejercicio 4");
        //Ejercicio 4: Crear un arrelo que guarde e imprima 10 nombres
        //de tus compañeros de la clase
        String[] nombres = {"Allison", "Kevin", "Amir", "Andrea", "Bianka", "Brayan", "Lisbeth", "Henry", "David", "Diana"};
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        System.out.println("Ejercicio 5");
        //Ejericicio 5: Crear un arreglo multidimensional que guarde
        //mas datos personales tus compañeros de clase
        //(nombre, apellido, carrera, lugarTrabajo).
        String[][] datosPersonales = {
            {"Josue", "Cruz", "Ingenieria Industrial", "N/A"},
            {"Jose", "Rodriguez", "Ingenieria Industrial", "N/A"},
            {"Edwin", "Rodriguez", "Ingenieria Electrica", "N/A"},
            {"Emerson", "Santos", "Ingenieria en Computacion", "N/A"},
            {"Briggitte", "Ardon", "Ingenieria en Computacion", "N/A"}
        };
        for (String[] datosPersonale : datosPersonales) {
            for (String datosPersonale1 : datosPersonale) {
                System.out.print(datosPersonale1 + " ");
            }
            System.out.println();
        }
        
        System.out.println("Ejercicio 6");
        //Ejercicio 6: Crear un programa que imprima en consola un nombre de estudiante
        //una nota y una etiqueta que diga Aprobado o Reprobado
        //dependiendo del valor de la nota que tenga.
        
        String nombreEstudiante = "Nathan";
        int nota = 60;
        System.out.println(nombreEstudiante);
        System.out.println(nota);
        if (nota >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        String nombreEstudiante2 = "Norlin";
        int nota2 = 95;
        System.out.println(nombreEstudiante2);
        System.out.println(nota2);
        if (nota2 >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
        
        System.out.println("Ejercicio 7");
        //Ejercico 7: Escribe un programa que imprima mediante
        //un ciclo los números pares del 2 al 100
        for (int i = 2; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }
}

