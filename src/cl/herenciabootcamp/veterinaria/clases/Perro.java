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

    public void mostrarDatosDelPerro(){
        System.out.println("Raza del perro: " + this.raza);
    }

    @Override
    public void comer() {
        super.comer();
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
