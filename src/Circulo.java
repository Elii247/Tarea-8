public class Circulo {
    private  float radio;

    public Circulo(float radio) {

        this.radio = radio;
    }

    public float area() {
        float area = (float) (Math.PI * Math.pow(radio, 2));
        return area;
    }

    public float perimetro() {
        float perimetro = 2 * (float) Math.PI * radio;
        return perimetro;

    }
}
