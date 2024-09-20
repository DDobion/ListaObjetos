import java.util.ArrayList;
import java.util.Scanner;

class Video {
    String titulo;
    String autor;
    String url;
    boolean activo;

    // Constructor
    public Video(String titulo, String autor, String url, boolean activo) {
        this.titulo = titulo;
        this.autor = autor;
        this.url = url;
        this.activo = activo;
    }

    // Método para representar el objeto como String
    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", URL: " + url + ", Activo: " + (activo ? "Si" : "No");
    }
}

public class Lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Video> videos = new ArrayList<>();

       
        while (true) {
            System.out.print("Ingrese el titulo del video: ");
            String titulo = scanner.nextLine();

            System.out.print("Ingrese el autor del video: ");
            String autor = scanner.nextLine();

            System.out.print("Ingrese la URL del video: ");
            String url = scanner.nextLine();

            System.out.print("¿Esta activo el video? (si/no): ");
            String activoStr = scanner.nextLine().toLowerCase();
            boolean activo = activoStr.equals("si");

            
            videos.add(new Video(titulo, autor, url, activo));

            System.out.print("¿Desea agregar otro video? (si/no): ");
            String continuar = scanner.nextLine().toLowerCase();
            if (!continuar.equals("si")) {
                break;
            }
        }

        
        System.out.println("\nLista de videos:");
        for (Video video : videos) {
            System.out.println(video);
        }

        scanner.close();
    }
}

