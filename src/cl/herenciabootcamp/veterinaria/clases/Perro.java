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

    public void mostrarDatosDelPerro(){
        System.out.println("Raza del perro: " + this.raza);
    }



}
