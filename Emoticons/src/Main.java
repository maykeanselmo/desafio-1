import entities.Mensagem;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma menssagem: ");
        String texto = sc.nextLine();
        Mensagem mensagem = new Mensagem(texto);
        System.out.println(mensagem.verificaHumor());
        sc.close();
    }
}