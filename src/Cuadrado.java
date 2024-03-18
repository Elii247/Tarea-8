public class Cuadrado{
    private float lado;

    public Cuadrado(float lado){
        this.lado = lado;

    }

    public float area(){
        float area = lado * lado;
        return area;
    }

    public float perimetro(){
        float resultado = 4 * lado;
        return resultado;
    }
}
