import java.util.Scanner;

//Escribe un programa que determine si un número es primo.
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % num == 0) {
            System.out.println("El numero es primo");
        } else if (num % 2 == 0) {
            System.out.println("El numero no es primo");
        }
        sc.close();
    }
}
