public class Exponenciacion{
    private final double base;
    private final int exponente;

    public Exponenciacion(double base, int exponente){
        this.base = base;
        this.exponente = exponente;
    }

    public double calcularExponenciacion(){
        float resultado = (float) Math.pow(base,exponente);
        return resultado;
    }
}