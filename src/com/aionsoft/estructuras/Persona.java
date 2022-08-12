package com.aionsoft.estructuras;

public class Persona {

    private String colorPiel;
    private String colorPelo;
    private String colorOjo;
    private int edad;
    private int estatura;

    public Persona() {
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getColorOjo() {
        return colorOjo;
    }

    public void setColorOjo(String colorOjo) {
        this.colorOjo = colorOjo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return " Persona edad = [" + edad + "] color piel  [" + colorPiel + "] color pelo [" + colorPelo + "] color ojos  [" + colorOjo + "] estatura [" + estatura + "]";
    }
}
