package FigurasRegulares;

public class Triangulo {
    //Atributos
    private double ladoBaseTriangulo;
    private double ladosAltoTriangulo;
    private double alturaTriangulo;
    //Constructor
    public Triangulo(double ladoBaseTriangulo, double ladosAltoTriangulo, double alturaTriangulo){
        this.ladoBaseTriangulo = ladoBaseTriangulo;
        this.ladosAltoTriangulo = ladosAltoTriangulo;
        this.alturaTriangulo = alturaTriangulo;
    }
    //Constructor Vacio
    public Triangulo(){}
    //Setters
    public void establecerLadoBase(double ladoBAse){
        this.ladoBaseTriangulo = ladoBAse;}
    public void establecerLadosAlto(double ladosAlto){
        this.ladosAltoTriangulo = ladosAlto;}
    public void establecerAltura(double altura){
        this.alturaTriangulo = altura;}
    //Getters
    private double obtenerLadoBase(){return ladoBaseTriangulo;}
    private double obtenerLadosAlto(){return ladosAltoTriangulo;}
    private double obtenerAltura(){return alturaTriangulo;}
    //Perimetro
    public Double perimetroTriangulo(){
        return ((ladosAltoTriangulo*2)+ladoBaseTriangulo);}
    //Area
    public Double areaTriangulo(){
        return ((ladoBaseTriangulo*alturaTriangulo)/2);}
    //Metodo Personalizado
    public void imprimirDatosTriangulo(){
    System.out.println("--- Triangulo Equilatero---");
    System.out.println("Lado base: "+obtenerLadoBase());
    System.out.println("Lados alto: "+obtenerLadosAlto());
    System.out.println("Altura: "+obtenerAltura());
    System.out.println("Perimetro: "+perimetroTriangulo());
    System.out.println("Area: "+areaTriangulo());
    }

}
