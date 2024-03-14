package cl.herenciabootcamp.rectangulo.clases;

public class Rectangulo extends Figura{

    private double base;
    private double altura;
    private double area;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double  calcularArea() {
        this.area = base * altura;
        return this.area;
    }
}
