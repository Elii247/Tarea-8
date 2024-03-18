import java.util.Scanner;

public class Circulo{
    private final float radio;

    public Circulo(float radio){

        this.radio = radio;
    }

    public float area(){
        float area = (float) (Math.PI * Math.pow(radio, 2));
        return area;
    }

    public float perimetro(){
        float resultado = 2 * (float) Math.PI * radio;
        return resultado;

    }
}