public class Cancion extends Genero {
    private  String Titulo;
    private  int year;
    public Cancion(String nombre, int edad, String generos, String Titulo, int year){
        super(nombre, edad, generos);

        this.Titulo = Titulo;
        this.year = year;
    }

    public String getTitulo() {
        return Titulo;
    }
    public int getYear() {
        return year;
    }


}
