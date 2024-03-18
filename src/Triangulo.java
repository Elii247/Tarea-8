public class Triangulo{
    private final float lado;
    private final float altura;
    private final float base;

    public Triangulo(float lado, float altura, float base){
        this.lado = lado;
        this.altura = altura;
        this.base = base;
    }

    public float area(){
        float area = altura * base / 2;
        return area;
    }

    public float perimetro(){
        float resultado = lado + lado + lado;
        return resultado;
    }
}
