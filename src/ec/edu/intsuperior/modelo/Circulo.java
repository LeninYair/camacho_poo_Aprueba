
package ec.edu.intsuperior.modelo;


public class Circulo {
private int radio;
private Punto centro;

    public Circulo() {
    }

    public Circulo(int radio, Punto centro) {
        this.radio = radio;
        this.centro = centro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

public double areaCirulo(){
    return Math.PI*Math.pow((double)(radio), 2);
    
    
    
    
}
    
    
}
