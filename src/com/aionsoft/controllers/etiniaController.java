package com.aionsoft.controllers;

import com.aionsoft.estructuras.Persona;

import java.util.ArrayList;
import java.util.Random;

//tarea, en base a un numero aleatoria asignar color de ojos, color de piel y pelo a una persona, tambien asignando una estatura acorde a la edad de la persona.
public class etiniaController {

    public static void main(String[] args) {
        Random r = new Random();
        new Persona();
        ArrayList<Persona> persona = new ArrayList<>();
        String[] colorOjos = {"azul", "cafe", "negro", "rojo"};
        String[] colorPiel = {"negro", "blanco", "moreno", "amarillo"};
        String[] colorPelo = {"negro", "cafe", "azul", "celeste", "morado", "rubio", "blanco", "rojo"};
        int edad;
        int estatura;

        int edadR;

        for (int i = 0; i < 100; i++) {
            Persona personaNueva = new Persona();
            edadR = r.nextInt(80) + 1;
            personaNueva.setEdad(edadR);
            if (edadR < 2) {
                personaNueva.setEstatura(r.nextInt(40) + 25);
            } else if (edadR < 5) {
                personaNueva.setEstatura(r.nextInt(30) + 100);
            } else if (edadR < 10) {
                personaNueva.setEstatura(r.nextInt(60) + 100);
            } else if (edadR <= 80) {
                personaNueva.setEstatura(r.nextInt(60) + 140);
            }

            personaNueva.setColorOjo(colorOjos[r.nextInt(colorOjos.length)]);
            personaNueva.setColorPelo(colorPelo[r.nextInt(colorPelo.length)]);
            personaNueva.setColorPiel(colorPiel[r.nextInt(colorPiel.length)]);
            persona.add(personaNueva);
        }
        int aux = 0;
        for (Persona personita : persona) {
            System.out.println(++aux + ".- personita = " + personita);
        }

        sumaVar(10, 2, 3, 4, 5, 6, 2, 3, 4, 5);

    }


    public static void sumaVar(float xd, int... arguments) {

        for (int i :
                arguments) {
            xd = xd + i;
        }

        System.out.println("la suma es = " + xd);

    }


}
