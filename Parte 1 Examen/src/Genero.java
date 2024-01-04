public class Genero extends Artista{
    private  String generos;

    public Genero(String nombre, int edad, String generos) {
        super(nombre, edad);
        this.generos = generos;
    }

    public String getGeneros() {
        return generos;
    }
}

