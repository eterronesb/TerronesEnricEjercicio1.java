import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crear un nuevo juego
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        //Comenzamos el juego
        while (!game.isGameOver()) {
            game.displayHiddenTitle();
            System.out.println("1. Adivinar una letra");
            System.out.println("2. Adivinar el titulo completo");
            System.out.println("3. Salir");
            System.out.println("Elegir una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Introduce una letra: ");
                    char letter = scanner.nextLine().charAt(0);
                    game.guessLetter(letter);
                    break;
                case 2:
                    System.out.println("Introduce el titulo de la pelicula: ");
                    String title = scanner.nextLine();
                    game.guessMovieTitle(title);
                    break;
                case 3:
                    System.out.println("Gracias por jugar!");
                    game.guessMovieTitle("");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }

    }




}