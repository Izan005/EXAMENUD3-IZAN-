package org.example;

public class Televisor {

    private int canal = 1;
    private int volumen = 5;

    public Televisor (int canal, int volumen) {
        this.canal=canal;
        this.volumen=volumen;
    }

    public int subirCanal() {
        if (this.canal <= 99 && this.canal >= 1 ) {
            return this.canal++;
        }
        return this.canal;
    }
    public int bajarCanal() {
        if (this.canal <= 99 && this.canal >= 1 ) {

            return this.canal--;
        }
        return this.canal;
    }
    public int getCanal() {
        return this.canal;
    }
    public void setCanal(int canal) {
        this.canal=canal;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen=volumen;
    }

}
