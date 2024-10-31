package FigurasRegulares;

public class Rectangulo {
    //Atributos
    private double ladoBase;
    private double ladoAlto;
    //Constructor
    public Rectangulo(double ladoBase, double ladoAlto){
        this.ladoBase = ladoBase;
        this.ladoAlto = ladoAlto;
    }
    //Constructor Vacio
    public Rectangulo(){}
    //Setters
    public void establecerLadoBse(double ladoBase){
        this.ladoBase = ladoBase;}
    public void establecerLadoAlto(double ladoAlto){
        this.ladoAlto = ladoAlto;}
    //Getters
    private double obtenerLadoBase(){return ladoBase;}
    private double obtenerLadoAlto(){return ladoAlto;}
    //Perimetro
    public double perimetroRectangulo(){
        return ((ladoBase*2)+(ladoAlto*2));}
    //Area
    public double areaRectangulo(){
        return (ladoBase*ladoAlto);}
    //Metodo personalizado
    public void imprimirDatosRectangulo(){
        System.out.println(" ");
        System.out.println("--- Rectangulo ---");
        System.out.println("Lado Ancho: " + obtenerLadoBase());
        System.out.println("Lado Alto: " + obtenerLadoAlto());
        System.out.println("Perimetro: "+ perimetroRectangulo());
        System.out.println("Area: "+areaRectangulo());
    }
}
