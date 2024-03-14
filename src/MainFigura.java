import cl.herenciabootcamp.rectangulo.clases.Circulo;
import cl.herenciabootcamp.rectangulo.clases.Rectangulo;
import cl.herenciabootcamp.rectangulo.clases.Triangulo;

public class MainFigura {
    public static void main(String[] args) {
        // Crear instancias de las figuras
        Rectangulo rectangulo = new Rectangulo(5, 10);
        Triangulo triangulo = new Triangulo(4, 6);
        Circulo circulo = new Circulo(3);

        // Calcular y mostrar el área de cada figura
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
}
