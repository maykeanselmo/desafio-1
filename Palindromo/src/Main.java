import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite uma palavra: ");
            String textoOriginal = sc.nextLine();
            if (textoOriginal == null || textoOriginal.trim().isEmpty())
                throw new IllegalArgumentException("Erro: Palavra inválida.");

            String textoLimpo = textoOriginal.replaceAll("[^\\p{Alpha}\\s]", "").toLowerCase();

            if (textoLimpo.isEmpty() || textoLimpo.matches("[\\p{Punct}\\s]+")) {
                throw new IllegalArgumentException("Erro: Palavra composta apenas por caracteres especiais.");
            }

            boolean palindromo = true;

            for (int i = 0; i < textoLimpo.length() / 2; i++) {
                if (textoLimpo.charAt(i) != textoLimpo.charAt(textoLimpo.length() - i - 1)) {
                    palindromo = false;
                    break;
                }
            }
            if (palindromo)
                System.out.println("É um palindromo");
            else
                System.out.println("Não é um palindromo");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}