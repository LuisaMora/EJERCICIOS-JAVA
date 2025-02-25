import java.util.*;

public class GlobosICPC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Número de casos de prueba

        while (t-- > 0) {
            int n = scanner.nextInt(); // Longitud de la cadena
            String s = scanner.next(); // Orden de los problemas resueltos

            Set<Character> resueltos = new HashSet<>();
            int totalGlobos = 0;

            for (char problema : s.toCharArray()) {
                if (resueltos.contains(problema)) {
                    totalGlobos += 1; // Globo por resolver el problema
                } else {
                    totalGlobos += 2; // Globo por resolver + adicional por ser el primero
                    resueltos.add(problema);
                }
            }
            System.out.println(totalGlobos);
        }
        scanner.close();
    }
}