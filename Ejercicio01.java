import java.util.Scanner;

//Escribe un programa que convierta grados Celsius a Fahrenheit y viceversa.
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperatura = sc.nextInt();
        String tipo = sc.next();
        double respuesta = 0;
        if (tipo.equals("C")) {
            respuesta = (temperatura - 32) * (5.0 / 9);
        } else if (tipo.equals("F")) {
            respuesta = (temperatura * (9.0 / 5)) + 32;
        }
        System.out.println(respuesta);
        sc.close();
    }
}
