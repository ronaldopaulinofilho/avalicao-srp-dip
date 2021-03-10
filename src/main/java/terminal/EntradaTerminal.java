package terminal;

import java.util.Scanner;

public class EntradaTerminal {

    public static Integer entradaInteira(String texto) {
        System.out.println(texto);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
