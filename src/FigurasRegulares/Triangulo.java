package FigurasRegulares;

public class Triangulo {
    //Atributos
    private double baseTriangulo;
    private double ladoTriangulo;
    private double alturaTriangulo;
    //Constructor
    public Triangulo(double baseTriangulo, double ladoTriangulo, double alturaTriangulo){
        this.baseTriangulo = baseTriangulo;
        this.ladoTriangulo = ladoTriangulo;
        this.alturaTriangulo = alturaTriangulo;
    }
    //Constructor Vacio
    public Triangulo(){}
    //Setters
    public void establecerBaseTriangulo(double baseTriangulo){
        this.baseTriangulo = baseTriangulo;}
    public void establecerLadoTriangulo(double ladoTriangulo){
        this.ladoTriangulo = ladoTriangulo;}
    public void establecerAltura(double altura){
        this.alturaTriangulo = altura;}
    //Getters
    private double obtenerBaseTriangulo(){return baseTriangulo;}
    private double obtenerLadoTriangulo(){return ladoTriangulo;}
    private double obtenerAltura(){return alturaTriangulo;}
    //Perimetro
    public double perimetroTriangulo(){
        return ((ladoTriangulo*2)+baseTriangulo);}
    //Area
    public double areaTriangulo(){
        return ((baseTriangulo*alturaTriangulo)/2);}
    //Metodo Personalizado
    public void imprimirDatosTriangulo(){
    System.out.println("--- Triangulo Equilatero---");
    System.out.println("Lado base: "+obtenerBaseTriangulo());
    System.out.println("Lados alto: "+obtenerLadoTriangulo());
    System.out.println("Altura: "+obtenerAltura());
    System.out.println("Perimetro: "+perimetroTriangulo());
    System.out.println("Area: "+areaTriangulo());
    }

}
