import java.util.Scanner;

//Crea un programa que cuente cuántas vocales tiene una cadena de texto ingresada por el usuario.
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.next();
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char vocal = palabra.charAt(i);
            if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u' ||
                    vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U') {
                contador++; // Si es una vocal, incrementa el contador
            }
        }
        System.out.println(contador);
        sc.close();
    }
}
