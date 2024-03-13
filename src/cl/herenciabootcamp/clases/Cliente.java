package cl.herenciabootcamp.clases;

/**
 * Subclase Cliente o clase Hija de @Persona
 */
public class Cliente extends Persona{

     protected String tipo;

    public Cliente(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Constructor de la clase, utiliza el método
     * super para ejecutar al constructor de la Superclase
     * @param rutPersona Heredado de la superclase
     * @param nombre Heredado de la superclase
     * @param edad  Heredado de la superclase
     * @param tipo Atributo específico de esta clase
     */
    public Cliente(long rutPersona, String nombre, int edad, String tipo) {
        super(rutPersona, nombre, edad);
        this.tipo = tipo;
    }

    /**
     * Método que se utiliza para mostrar los datos del ejecutivo
     * no tiene retorno , ya que solo muestra.
     */
    public void mostrarDatosCliente(){
        System.out.println("Mostrar Datos Cliente");
        System.out.println("Nombre Persona" + nombre);
        System.out.println("Rut de la persona: " + getRutPersona());
        System.out.println("Edad de la persona: " + edad);
        System.out.println("Tipo cliente "+ this.tipo);
    }
}
