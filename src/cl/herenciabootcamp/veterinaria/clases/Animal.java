package cl.herenciabootcamp.veterinaria.clases;

public class Animal {
    String nombre;
    double peso;
    public Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void  mostrarDatosAnimal(){
        System.out.println("**************************");
        System.out.println("    Datos del animal     ");
        System.out.println("**************************");
        System.out.println("Nombre del Animal: " + this.nombre);
        System.out.println("Peso del animal: " + getPeso());
    }
}
