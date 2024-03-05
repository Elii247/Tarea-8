import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion, calcular;
        float lado, altura, base, apotema, perimetro, radio, area;

        //introducido por teclado
        System.out.println("Calculadora Geometrica");
        System.out.println("Figuras disponibles: ");
        System.out.println("Ingrese el numero de la figura que desea: ");
        System.out.println("1. Circulo");
        System.out.println("2. Triangulo");
        System.out.println("3. Cuadrado");
        System.out.println("4. Rectangulo");
        System.out.println("5. Pentagono");
        opcion = scanner.nextInt();
        area = scanner.nextFloat();
        perimetro = scanner.nextFloat();

        switch (opcion) {
            case 1://Circulo
                System.out.println("Ingrese el radio del circulo : ");
                radio = scanner.nextFloat();

                Circulo circulo = new Circulo(radio);

                System.out.println("Desea calcular el area o perimetro \n1. para area \n2. para perimetro");
                calcular = scanner.nextInt();

                if (calcular == 1) {
                    System.out.println("El area del circulo es: " + circulo.area());
                } else if (calcular == 2) {
                    System.out.println("El perimetro del circulo es: " + circulo.perimetro());
                } else {
                    System.out.println("Opcion incorrecta");
                }
                break;

            case 2://Triangulo
                System.out.println("Ingrese los tres lado del Triangulo: ");
                lado = scanner.nextFloat();
                altura = scanner.nextFloat();
                base = scanner.nextFloat();

                Triangulo objetoTriangulo = new Triangulo(lado, altura, base);

                System.out.println("Desea calcular el area o perimetro \n1. para area \n2. para perimetro");
                calcular = scanner.nextInt();

                if (calcular == 1) {
                    System.out.println("El area del triangulo es: " + objetoTriangulo.area());
                } else if (calcular == 2) {
                    System.out.println("El perimetro del triangulo es: " + objetoTriangulo.perimetro());
                } else {
                    System.out.println("Opcion incorrecta");
                }
                break;

            case 3://Cuadrado
                System.out.println("Ingrese el lado del Cuadrado: ");
                lado = scanner.nextFloat();

                Cuadrado objetoCuadrado = new Cuadrado(lado);

                System.out.println("Desea calcular el area o perimetro \n1. para area \n2. para perimetro");
                calcular = scanner.nextInt();

                if (calcular == 1) {
                    System.out.println("El area del Cuadrado es: " + objetoCuadrado.area());
                } else if (calcular == 2) {
                    System.out.println("El perimetro del cuadrado es: " + objetoCuadrado.perimetro());
                } else {
                    System.out.println("Opcion incorrecta");
                }

                break;

            case 4://Rectangulo
                System.out.println("Ingrese la base del Rectangulo: ");
                base = scanner.nextFloat();
                altura = scanner.nextFloat();
                lado = scanner.nextFloat();

                Rectangulo objetroRectangulo = new Rectangulo(base, altura, lado);

                System.out.println("Desea calcular el area o perimetro \n1. para area \n2. para perimetro");
                calcular = scanner.nextInt();

                if (calcular == 1) {
                    System.out.println("El area del Rectangulo es: " + objetroRectangulo.area());
                } else if (calcular == 2) {
                    System.out.println("El perimetro del Rectangulo es: " + objetroRectangulo.perimetro());
                } else {
                    System.out.println("Opcion incorrecta");
                }
                break;

            case 5://Pentagono
                System.out.println("Ingrese los apotema del Pentagono: ");
                apotema = scanner.nextFloat();

                System.out.println("Digite el lado: ");
                lado = scanner.nextFloat();

                Pentagono objetoPentagono = new Pentagono(apotema, lado);

                System.out.println("Desea calcular el area o perimetro \n1. para area \n2. para perimetro");
                calcular = scanner.nextInt();

                if (calcular == 1) {
                    System.out.println("El area del Pentagono es: " + objetoPentagono.area());
                } else if (calcular == 2) {
                    System.out.println("El perimetro del Pentagono es: " + objetoPentagono.perimetro());
                } else {
                    System.out.println("Opcion incorrecta");
                }
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + opcion);
        }

    }
}
