public class Rectangulo{
    private final float base;
    private float altura;
    private float lado;

    public Rectangulo(float altura, float base, float lado){
        this.altura = altura;
        this.base = base;
        this.lado = lado;
    }

    public float area(){
        float area = base * altura;
        return area;
    }

    public float perimetro(){
        float resultado = 4 * lado;
        return resultado;
    }
}
