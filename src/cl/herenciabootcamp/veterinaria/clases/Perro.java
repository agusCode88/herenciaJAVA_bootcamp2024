package cl.herenciabootcamp.veterinaria.clases;

public class Perro extends Animal{

    protected String raza;
    /**
     * @param nombre Atributo base de la clase animal
     * @param peso   Atributo baase que contendrá el peso del animal
     * @author Agustín Romero
     */
    public Perro(String nombre, double peso,String raza) {
        super(nombre, peso);
        this.raza= raza;
    }

    public Perro(){
        super();
    }

    @Override
    public void mostrarDatosAnimal() {
        System.out.println("***************************");
        System.out.println("      DATOS DEL PERRO     ");
        System.out.println("***************************");
        System.out.println("Nombre del perro: " + getNombre());
        System.out.println("Peso del perro: " + getPeso());
        System.out.println("Raza del perro: " + raza);
    }

    public void mostrarDatosDelPerro(){
        System.out.println("Raza del perro: " + this.raza);
    }

    @Override
    public void comer() {
        System.out.println("El perro está comiendo");
    }

    @Override
    public void dormir() {
        super.dormir();
    }

    @Override
    public void emitirSonido() {
        //super.emitirSonido();
        System.out.println("!GUAU!");
    }


}
