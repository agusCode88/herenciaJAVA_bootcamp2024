package cl.herenciabootcamp.rectangulo.clases;

public class Circulo extends Figura{
    public static double NUMERO_PI=3.1416;
    private double radio;
    private double area;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        area = NUMERO_PI * radio * radio;
        return area;
    }
}
