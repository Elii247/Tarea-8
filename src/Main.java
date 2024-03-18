import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            ArrayList<String> operacionesRealizadas = new ArrayList<>();
            ArrayList<Double> resultadosOperaciones = new ArrayList<>();
            int opcion, calcular, exponente, operaciones = 0;
            float lado, altura, base, apotema, perimetro, radio, area;
            double resultado = 0;
            String respuesta;


            //introducido por teclado
            System.out.println("\nCalculadora Geometrica");
            System.out.println("\nFiguras disponibles: ");
            System.out.println("\nIngrese el numero de la figura que desea: \n");
            System.out.println("1. Circulo");
            System.out.println("2. Triangulo");
            System.out.println("3. Cuadrado");
            System.out.println("4. Rectangulo");
            System.out.println("5. Pentagono");
            System.out.println("6. Exponente");


            System.out.println("Ingrese su Opcion a calcular: \n");
            opcion = scanner.nextInt();


            switch (opcion) {
                case 1://Circulo
                    System.out.println("Ingrese el radio del circulo : ");
                    radio = scanner.nextFloat();

                    Circulo circulo = new Circulo(radio);

                    System.out.println("Desea calcular el area o perimetro \n1. para area \n2. para perimetro");
                    calcular = scanner.nextInt();

                    if (calcular == 1) {
                        System.out.println("El area del circulo es: " + circulo.area());
                        operacionesRealizadas.add("Area del Circulo: ");
                        resultadosOperaciones.add(resultado);
                    } else if (calcular == 2) {
                        System.out.println("El perimetro del circulo es: " + circulo.perimetro());
                    } else {
                        System.out.println("Opcion incorrecta");
                    }

                    break;


                case 2://Triangulo
                    System.out.println("Ingrese Informacion sobre el Triangulo \nLado \naltura \nbase: ");
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
                case 6: // Exponenciacion
                    System.out.println("Ingrese la Base: ");
                    base = scanner.nextFloat();

                    System.out.println("Ingrese el Exponente: ");
                    exponente = scanner.nextInt();

                    Exponenciacion exponente1 = new Exponenciacion(base, exponente);
                    double resultadoExponenciacion = exponente1.calcularExponenciacion();

                    System.out.println("El resultado de la exponenciación es: " + resultadoExponenciacion);
                    break;
                case 7:
                    // Salir del programa
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            if (continuar) {
                System.out.print("¿Desea realizar otra operación? (Si/No): ");
                respuesta = scanner.next();
                continuar = respuesta.equalsIgnoreCase("Si");
            }

        }

    }
}

////////////ESTA ES LA TAREA 5/////