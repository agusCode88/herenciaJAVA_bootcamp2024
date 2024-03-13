import cl.herenciabootcamp.veterinaria.clases.Animal;
import cl.herenciabootcamp.veterinaria.clases.Gato;
import cl.herenciabootcamp.veterinaria.clases.Perro;

import java.util.ArrayList;
import java.util.List;

public class VeterinariaMain {
    public static void main(String[] args) {

        ArrayList<Animal>listaAnimales = new ArrayList<>();

        Animal pajaro = new Animal("Piolín",0.55);
        Animal iguana = new Animal("Guayabera",5);

        //pajaro.mostrarDatosAnimal();
       // iguana.mostrarDatosAnimal();

        Animal perro = new Perro("Amadeus",20,"Labrador");
        ((Perro)perro).mostrarDatosDelPerro();

        Perro castingPerro = (Perro)perro;
        //castingPerro.mostrarDatosDelPerro();

        Animal gato = new Gato("Garfield",10,"Montés");
        //gato.emitirSonido();

        ((Gato) gato).mostrarDatosGato();

        listaAnimales.add(pajaro);
        listaAnimales.add(iguana);
        listaAnimales.add(perro);
        listaAnimales.add(gato);

        // Utilizacion de un for normal
        for(int i=0 ; i< listaAnimales.size();i++){
            System.out.println("Nombre animal:" + listaAnimales.get(i).getNombre());
            if(listaAnimales.get(i) instanceof Perro){
                ((Perro) listaAnimales.get(i)).mostrarDatosDelPerro();
            }
        }

        for (Animal animal : listaAnimales){
            System.out.println(animal.getNombre());
            if( animal instanceof Gato){
                ((Gato) animal).mostrarDatosGato();
            }
        }

    }
}
