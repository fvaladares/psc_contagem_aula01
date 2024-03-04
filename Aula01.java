import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner input = new Scanner(System.in);
        String nome;
        System.out.println("Por favor, informe seu nome");
        nome = input.nextLine();
        System.out.println("O nome informado foi: " + nome);

        input.close();
    }
}
