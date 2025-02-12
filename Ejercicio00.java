import java.util.Scanner;

//Crea un programa que reciba dos números como entrada y devuelva su suma.
public class Ejercicio00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 + num2);
        sc.close();
    }
}