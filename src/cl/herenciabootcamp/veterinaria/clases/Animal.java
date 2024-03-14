package cl.herenciabootcamp.veterinaria.clases;

/**
 * Esta es la superclase de la veterinaria
 */
public class Animal {

    protected String nombre;
    protected double peso;

    /**
     * @author Agustín Romero
     *
     * @param nombre Atributo base de la clase animal
     * @param peso   Atributo baase que contendrá el peso del animal
     */
    public Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public Animal(){

    }

    /**
     * Este método devuelve el nombre del animal , lo puedo usar donde quiera
     * @return el nombre del animal que es un string.
     */
    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void mostrarDatosAnimal(){
        System.out.println("***********************************");
        System.out.println("        DATOS DEL ANIMAL            ");
        System.out.println("***********************************");
        System.out.println("Nombre del animal: " + this.nombre);
        System.out.println("Peso del animal: " + this.peso);
    }

    public void comer(){
        System.out.println("El animal está comiendo");

    }

    public void dormir(){
        System.out.println("El animal está durmiendo");
    }

    public void emitirSonido(){
        System.out.println("El animal está emitiendo un sonido");
    }

}
