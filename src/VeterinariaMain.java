import cl.herenciabootcamp.veterinaria.clases.Animal;
import cl.herenciabootcamp.veterinaria.clases.Gato;
import cl.herenciabootcamp.veterinaria.clases.Perro;

public class VeterinariaMain {
    public static void main(String[] args) {

        Animal pajaro = new Animal("Piolín",0.55);
        Animal iguana = new Animal("Guayabera",5);

        pajaro.mostrarDatosAnimal();
        iguana.mostrarDatosAnimal();

        Animal perro = new Perro("Amadeus",20,"Labrador");
        ((Perro)perro).mostrarDatosDelPerro();

        Perro castingPerro = (Perro)perro;
        castingPerro.mostrarDatosDelPerro();

        Animal gato = new Gato("Garfield",10,"Montés");
        gato.emitirSonido();

        ((Gato) gato).mostrarDatosGato();

    }
}
