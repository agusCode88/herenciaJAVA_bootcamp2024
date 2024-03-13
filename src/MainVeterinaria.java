import cl.herenciabootcamp.veterinaria.clases.Animal;
import cl.herenciabootcamp.veterinaria.clases.Perro;

public class MainVeterinaria {
    public static void main(String[] args) {

        Animal pajaro = new Animal("Piolín",0.8);
        pajaro.mostrarDatosAnimal();

        Perro perroEjemplo = new Perro("Chocolate",25,"Doberman");
        perroEjemplo.mostrarDatosDelPerro();

        Animal perro1 = new Perro("Amadeus",20,"Quiltroberman");
        perro1.mostrarDatosAnimal();
        ((Perro)perro1).mostrarDatosDelPerro();

      //  Perro perroCasting = (Perro)perro1;
       // perroCasting.mostrarDatosDelPerro();



    }
}
