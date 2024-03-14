import cl.herenciabootcamp.clases.Cliente;
import cl.herenciabootcamp.clases.Ejecutivo;
import cl.herenciabootcamp.clases.Persona;

public class Main {
    public static void main(String[] args) {

        /**
         * Crea a una persona , esta no es ni ejecutivo , ni cliente.
         * Sólo una persona con sus atributos.
         */
        Persona persona1 = new Persona(16990510,"yyyy",35);

        /**
         * Crea una persona pero que es un ejecutivo
         *
         * ((Ejecutivo) persona) Esto es un casteo de persona a
         * ajecutivo para poder llegar al método de mostrarDatos
         */
        Persona persona = new Ejecutivo(135245, "Soy ejecutivo", 35,"Vendedor");
        ((Ejecutivo) persona).mostrarDatosEjecutivo();

        /**
         * Crea una persona pero que es un Cliente
         *
         * ((Cliente) persona) Esto es un casteo de persona a
         * cliente para poder llegar al método de mostrarDatos
         */
        Persona persona2 = new Cliente(135245, "Soy Cliente", 35,"usuarioAPP");
        ((Cliente) persona2).mostrarDatosCliente();

    }
}