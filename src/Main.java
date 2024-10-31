import FigurasRegulares.Circulo;
import FigurasRegulares.Cuadrado;
import FigurasRegulares.Rectangulo;
import FigurasRegulares.Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Cuadrado
        Cuadrado cuadrado1 = new Cuadrado();
        System.out.println("--- Cuadrado ---");
        System.out.println("Ingrese la medidad de un lado: ");
        double lado = scanner.nextDouble();
        cuadrado1.establecerLado(lado);
        //Rectangulo
        Rectangulo rectangulo1 = new Rectangulo();
        System.out.println("--- Rectangulo --- ");
        System.out.println("Ingrese la medida del lado base: ");
        double ladoBase = scanner.nextDouble();
        rectangulo1.establecerLadoBse(ladoBase);
        System.out.println("Ingrese la medida del lado alto: ");
        double ladoAlto = scanner.nextDouble();
        rectangulo1.establecerLadoAlto(ladoAlto);
        //Circulo
        Circulo circulo1 = new Circulo();
        System.out.println("--- Circulo --- ");
        System.out.println("Ingrese la medida del radio: ");
        double radio = scanner.nextDouble();
        circulo1.establecerRadio(radio);
        //Triangulo
        Triangulo triangulo1 = new Triangulo();
        System.out.println("--- Triangulo --- ");
        System.out.println("Ingrese la medida del lado base: ");
        double baseTriangulo = scanner.nextDouble();
        triangulo1.establecerBaseTriangulo(baseTriangulo);
        System.out.println("Ingrese la medida del lado alto: ");
        double ladoTriangulo = scanner.nextDouble();
        triangulo1.establecerLadoTriangulo(ladoTriangulo);
        System.out.println("Ingrese la altura: ");
        double alturaTriangulo = scanner.nextDouble();
        triangulo1.establecerAltura(alturaTriangulo);

        //Impresion Datos
        cuadrado1.imprimirDatosCuadrado();
        rectangulo1.imprimirDatosRectangulo();
        circulo1.imprimirDatosCirculo();
        triangulo1.imprimirDatosTriangulo();

        //Suma total de Areas
        double sumaAreas = cuadrado1.area() + rectangulo1.areaRectangulo() + circulo1.areaCirculo() + triangulo1.areaTriangulo();
        System.out.println("Suma de todas las areas de las figuras regulares: "+String.format("%.2f",sumaAreas));


    }
}
