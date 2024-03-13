package cl.herenciabootcamp.clases;

/**
 * Esta es mi superclase
 */
public class Persona {

    private long rutPersona;
    protected String nombre;
    protected int edad;


    public Persona() {
    }

    /**
     * Constructor de persona para poder instanciar objetos
     * de este tipo o de la clase @Ejecutivo y @Cliente
     * @param rutPersona
     * @param nombre
     * @param edad
     */
    public Persona(long rutPersona, String nombre, int edad) {
        this.rutPersona = rutPersona;
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     *
     * @param nombre
     * @param edad
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Método para obtener el Rut de la persona.
     * Este método lo utiliza la clase ejecutivo para demostrar
     * que no solo se heredan atributos, si no que también los
     * métodos de la superclase.
     * @return
     */
    protected long getRutPersona() {
        return rutPersona;
    }

}
