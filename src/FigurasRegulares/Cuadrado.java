package FigurasRegulares;

public class Cuadrado {
    //Atributos
    private double lado;

    //Constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    //Constructor vacio
    public Cuadrado() {
    }

    //Setters
    public void establecerLado(double lado) {
        this.lado = lado;
    }

    //Getters
    private double obtenerLado() {
        return lado;
    }

    //Perimetro
    public Double perimetro() {
        return (lado * 4);}

    //Area
    public Double area() {
        return (lado*lado);}

    //Metodos personalizados
    public void imprimirDatosCuadrado(){
        System.out.println("--- Cuadrado ---");
        System.out.println("Lado: " + obtenerLado());
        System.out.println("Perimetro: "+ perimetro());
        System.out.println("Area: "+area());
    }
    }
