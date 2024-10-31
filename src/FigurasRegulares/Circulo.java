package FigurasRegulares;

public class Circulo {
    //atributos
    private double radio;

    //Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    //Constructor vacio
    public Circulo() {
    }

    //Setters
    public void establecerRadio(double radio) {
        this.radio = radio;
    }

    //Getters
    private double obtenerRadio() {
        return radio;
    }

    //Perimetro
    public Double perimetroCirculo() {
        return ((2 * Math.PI) * radio);
    }

    //Area
    public Double areaCirculo() {
        return (Math.PI * Math.pow(radio, 2));
    }
    //Metodo Personalizado
        public void imprimirDatosCirculo () {
            System.out.println("--- Circulo ---");
            System.out.println("Radio: " + obtenerRadio());
            System.out.println("Perimetro: " + String.format("%.2f",perimetroCirculo()));
            System.out.println("Area: " + String.format("%.2f",areaCirculo()));
        }
    }
