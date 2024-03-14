package cl.herenciabootcamp.veterinaria.clases;

/**
 * Esta es la superclase de la veterinaria
 *
 * La transformamos a clase abstracta para tener atributos
 * o métodos que serán compartidos por las subclases.
 *
 * Lo que declaro como abstracto, debe ser impllementados por las
 * subclases o los objetos que quiera instanciar de esta clase
 */
public abstract class Animal {

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

    /**
     * Un método abstracto no puede tener un cuerpo,
     * el cuerpo del método lo implementa la clase hija.
     */
    protected abstract void mostrarDatosAnimal();

    protected abstract void comer();

    public void dormir(){
        System.out.println("El animal está durmiendo");
    }

    public void emitirSonido(){
        System.out.println("El animal está emitiendo un sonido");
    }

}
