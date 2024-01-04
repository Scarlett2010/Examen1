public class Main {
    public static void main(String[] args) {
        System.out.println(" -------Bienvenido al sistema de canciones-------");
        Cancion cancion = new Cancion("Chayanne", 55, "Pop", "Humanos a Marte", 2014);
        System.out.println("    El nombre del cantante es: "+cancion.getNombre());
        System.out.println("    El genero de la cancion es: "+cancion.getGeneros());
        System.out.println("    El titulo de la cancion es: "+cancion.getTitulo());
        System.out.println("    El año de lanzamiento fue: "+cancion.getYear());
    }
}