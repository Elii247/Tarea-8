import javax.swing.text.PlainDocument;

public class Pentagono{
    private final float apotema;
    private final float lado;


    public Pentagono(float apotema, float lado){
        this.apotema = apotema;
        this.lado = lado;
    }
    public float perimetro(){
        float perimetro = lado * 5;
        return perimetro;
    }
    public float area(){
        float resultado = perimetro() * apotema / 2;
        return resultado;
    }


}
