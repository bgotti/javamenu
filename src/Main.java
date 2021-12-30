import java.util.Scanner;

public class Main {
    boolean exit;

    static Scanner clavier = new Scanner(System.in);

    public static void main(String[] args) {
        Main menu = new Main();
        menu.runMenu();
    }

    public void runMenu() {
        afficherEntete();
        while (!exit) {
            afficherMenu();
            int choix = lireChoix();
            executerProgramme(choix);
        }
    }

    private void afficherEntete() {
        System.out.println("+-----------------------------------+");
        System.out.println("|        Bienvenue a                |");
        System.out.println("|        Entreprise ABC             |");
        System.out.println("+-----------------------------------+");
    }

    private void afficherMenu() {
        System.out.println("\nFaire votre choix");
        System.out.println("1) Tell me a color");
        System.out.println("2) Tell me a shape");
        System.out.println("0) Terminer");
    }

    private int lireChoix() {
        int choix = -1;
        while (choix < 0 || choix > 2){
            try {
                System.out.print("\nVotre choix: ");
                choix = Integer.parseInt(clavier.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Choix Invalide.");
            }
        }
        return choix;
    }

    private void executerProgramme(int choix) {
        switch (choix) {
            case 0:
                System.out.println("Vous avez quitter.");
                System.exit(0);
                break;
            case 1:
                pickColor();
                break;
            case 2:
                pickShape();
                break;
            default:
                System.out.println("Erreur. Essayer encore.");
        }
    }

    private void pickColor() {
        int num = (int)(Math.random() * 4);
        switch (num) {
            case 0:
                System.out.println("Green.");
                break;
            case 1:
                System.out.println("Red.");
                break;
            case 2:
                System.out.println("Blue.");
                break;
            case 3:
                System.out.println("White.");
                break;
            default:
                System.out.println("Black.");
        }
    }

    private void pickShape() {
        int num = (int)(Math.random() * 4);
        switch (num) {
            case 0:
                System.out.println("Square.");
                break;
            case 1:
                System.out.println("Circle.");
                break;
            case 2:
                System.out.println("Triangle.");
                break;
            case 3:
                System.out.println("Hexagon.");
                break;
            default:
                System.out.println("Pyramid.");
        }
    }

}