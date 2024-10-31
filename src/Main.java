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
        float radio = (float) scanner.nextDouble();
        circulo1.establecerRadio(radio);
        //Triangulo
        Triangulo triangulo1 = new Triangulo();
        System.out.println("--- Triangulo --- ");
        System.out.println("Ingrese la medida del lado base: ");
        double ladoBaseTriangulo = scanner.nextDouble();
        triangulo1.establecerLadoBase(ladoBaseTriangulo);
        System.out.println("Ingrese la medida del lado alto: ");
        double ladosAltoTriangulo = scanner.nextDouble();
        triangulo1.establecerLadosAlto(ladosAltoTriangulo);
        System.out.println("Ingrese la altura: ");
        double alturaTriangulo = scanner.nextDouble();
        triangulo1.establecerAltura(alturaTriangulo);

        //Impresion Datos
        cuadrado1.imprimirDatosCuadrado();
        rectangulo1.imprimirDatosRectangulo();
        circulo1.imprimirDatosCirculo();
        triangulo1.imprimirDatosTriangulo();

        //Suma total de Areas
        System.out.println("Suma de todas las areas de las figuras regulares: "+String.format("%.2f",cuadrado1.area()+rectangulo1.areaRectangulo()+circulo1.areaCirculo()+triangulo1.areaTriangulo()));


    }
}