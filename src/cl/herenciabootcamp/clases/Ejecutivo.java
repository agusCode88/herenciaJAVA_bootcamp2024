package cl.herenciabootcamp.clases;

/**
 * Subclase Ejecutivo o clase Hija de @Persona
 */
public class Ejecutivo extends Persona{
    protected  String cargo;

    /**
     * Constructor de la clase, utiliza el método
     * super para ejecutar al constructor de la Superclase
     * @param rutPersona Heredado de la superclase
     * @param nombre Heredado de la superclase
     * @param edad  Heredado de la superclase
     * @param cargo Atributo específico de esta clase
     */
    public Ejecutivo(long rutPersona, String nombre, int edad, String cargo) {
        super(rutPersona, nombre, edad);
        this.cargo = cargo;
    }

    /**
     * Consructor que da la posibidad de instanciar el objeto
     * sin la necesidad del rut(depende de la funiconalidad)
     * @param nombre Heredado de la superclase
     * @param edad   Heredado de la superclase
     * @param cargo  Atributo específico de esta clase
     */
    public Ejecutivo(String nombre, int edad, String cargo) {
        super(nombre, edad);
        this.cargo = cargo;
    }

    /**
     * Método que se utiliza para mostrar los datos del ejecutivo
     * no tiene retorno , ya que solo muestra.
     */
    public void mostrarDatosEjecutivo(){
        System.out.println("Mostrar Datos Ejecutivo");
        System.out.println("Nombre Persona" + nombre);
        System.out.println("Rut de la persona: " + getRutPersona());
        System.out.println("Edad de la persona: " + edad);
        System.out.println("Tipo cliente "+ this.cargo);
    }

}

