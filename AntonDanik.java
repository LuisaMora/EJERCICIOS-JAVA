import java.util.Scanner;

public class AntonDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// numero de juegos jugados
        sc.nextLine();
        String cad = sc.nextLine();// Cadena con informacion de partidas
        int i = 0, Anton = 0, Danik = 0;
        while (i < n) {
            char aux = cad.charAt(i);
            if (Character.toUpperCase(aux) == 'A') {
                Anton++;
            } else if (Character.toUpperCase(aux) == 'D') {
                Danik++;
            }
            i++;
        }
        if (Anton > Danik) {
            System.out.println("Anton");
        } else if (Danik > Anton) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
        sc.close();
    }
}
