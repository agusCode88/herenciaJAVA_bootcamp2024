import cl.herenciabootcamp.veterinaria.clases.Animal;
import cl.herenciabootcamp.veterinaria.clases.Gato;
import cl.herenciabootcamp.veterinaria.clases.Perro;

import java.util.ArrayList;

public class MainVeterinaria {
    public static void main(String[] args) {

        ArrayList<Animal> pacientesVeterinaria = new ArrayList<>();


        Animal pajaro = new Animal("Piolín",0.8);
       // pajaro.mostrarDatosAnimal();

        //pajaro.comer();
        Perro perroQueEmiteGuau = new Perro();
        //perroQueEmiteGuau.emitirSonido();
        Gato gatoQueEmiteMiau = new Gato();
        //gatoQueEmiteMiau.emitirSonido();
        Perro perroEjemplo = new Perro("Chocolate",25,"Doberman");
       // perroEjemplo.mostrarDatosDelPerro();

        Animal perro1 = new Perro("Amadeus",20,"Quiltroberman");
        //perro1.mostrarDatosAnimal();
        //((Perro)perro1).mostrarDatosDelPerro();

      //  Perro perroCasting = (Perro)perro1;
       // perroCasting.mostrarDatosDelPerro();
        Gato gatoMascota = new Gato("Garfield",10,"Michu");

        pacientesVeterinaria.add(pajaro);
        pacientesVeterinaria.add(perroQueEmiteGuau);
        pacientesVeterinaria.add(gatoQueEmiteMiau);
        pacientesVeterinaria.add(perro1);
        pacientesVeterinaria.add(gatoMascota);

        System.out.println("La cantidad de pacientes que tiene la veterinaria es de :" + pacientesVeterinaria.size());


        for(Animal pacienteAnimal: pacientesVeterinaria){
            //System.out.println("Nombre del paciente animal:" + pacienteAnimal.getNombre());
            if( pacienteAnimal instanceof  Perro){
                pacienteAnimal.emitirSonido();

            }else{
                pacienteAnimal.dormir();
            }
        }

    }
}
