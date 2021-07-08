
package ec.edu.intsuperior.modelo;


public class Punto {
    private int x;
    private int y;

    public Punto() {
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
public double distanciaDosPunto(int x1,int x2,int y1,int y2){
       double d;
       
       double w= Math.pow((double)(x2-x1), 2);
       double z= Math.pow((double)(y2-y1), 2);
       d=Math.sqrt(z+w);
       
       return d;

}
public double distanciaAlCentro(int x2,int y2){
       return distanciaDosPunto(x2, 0, y2, 0);



}

    
    
}
