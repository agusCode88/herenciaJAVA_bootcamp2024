package cl.herenciabootcamp.veterinaria.clases;

public class Gato extends Animal{

      protected String raza;

    public Gato(String nombre, double peso,String raza) {
        super(nombre, peso);
        this.raza= raza;
    }

    public Gato() {

    }

    @Override
    public void mostrarDatosAnimal() {
        System.out.println("***************************");
        System.out.println("      DATOS DEL GATO     ");
        System.out.println("***************************");
        System.out.println("Nombre del gato: " + getNombre());
        System.out.println("Peso del gato: " + getPeso());
        System.out.println("Raza del gato: " + raza);
    }

    @Override
    public void comer() {
        System.out.println("El gato está comiendo");
    }

    @Override
    public void dormir() {
        super.dormir();
    }

    @Override
    public void emitirSonido() {
        super.emitirSonido();
        System.out.println("Miau");
    }
}
