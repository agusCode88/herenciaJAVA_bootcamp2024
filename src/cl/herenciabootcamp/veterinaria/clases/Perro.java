package cl.herenciabootcamp.veterinaria.clases;

public class Perro extends Animal{
    String raza;
    public Perro(String nombre, double peso, String raza) {
        super(nombre, peso);
        this.raza = raza;
    }

    public void mostrarDatosDelPerro(){
        System.out.println("**************************");
        System.out.println("    Datos del animal     ");
        System.out.println("**************************");
        System.out.println("Nombre del perro: " + getNombre());
        System.out.println("Peso del perro: " + getPeso());
        System.out.println("Raza del perro: "+ this.raza);
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
        System.out.println("¡Guau!");
    }
}
