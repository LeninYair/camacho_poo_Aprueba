
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Circulo;
import ec.edu.intsuperior.modelo.Punto;
import javax.swing.JOptionPane;


public class Aplicacion {
    public static void main(String[] args) {
   Punto p1=new Punto(4, 3);
   Punto p2=new Punto(-3, 1);
   Circulo c1=new Circulo(5, p1);
        System.out.println("la distncia entre dos puntos es"
                +p1.distanciaDosPunto(p1.getX(),p2.getX(),p1.getY(),p2.getY()));
              
        System.out.println("la distancia entre el punto 1 al centro "
                +p1.distanciaAlCentro(p1.getX(),p1.getY()));        
       
        System.out.println("la distancia entre el punto 2 al centro "
                +p2.distanciaAlCentro(p2.getX(),p2.getY()));        
        
        JOptionPane.showMessageDialog(null,"el centro del circulo es el punto ( "+c1.getCentro().getX()
                +";"+c1.getCentro().getY()+" ) "+"\n "+"el radio del circulo es "+c1.getRadio()+"\n el area del circulo es"
                +c1.areaCirulo());
    }
    
}
