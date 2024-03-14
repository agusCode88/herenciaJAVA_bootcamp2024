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
    public void comer() {
        super.comer();
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
