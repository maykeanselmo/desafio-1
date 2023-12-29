import entities.Mensagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // testes

//        Mensagem msg1 = new Mensagem("Espero que esteja tudo bem:-)");
//        Mensagem msg2 = new Mensagem("Achei o filme muito divertido");
//        Mensagem msg3 = new Mensagem(":-):-(:-(:-)");
//        Mensagem msg4 = new Mensagem("Sonhei com a prova :-( (vou estudar)");
//        Mensagem msg5 = new Mensagem(""); // neutro
//        Mensagem msg6 = new Mensagem(":)-"); // neutro
//        Mensagem msg7 = new Mensagem("-:)"); // newutro
//        Mensagem msg8 = new Mensagem(":-)-:(");// divertido
//
//        // testando o reconhecimento de humor
//
//        System.out.println("msg1: " + msg1.getSentimento());
//        System.out.println("msg2: " +msg2.getSentimento());
//        System.out.println("msg3: " +msg3.getSentimento());
//        System.out.println("msg4: " +msg4.getSentimento());
//        System.out.println("msg5: " +msg5.getSentimento());
//        System.out.println("msg6: "  +msg6.getSentimento());
//        System.out.println("msg7: " +msg7.getSentimento());
//        System.out.println("msg8: " +msg8.getSentimento());
//
//        // testando  a edição de texto
//
//        System.out.println("\n");
//        msg1.editarTexto("Espero que esteja tudo bem:-");
//        System.out.println("msg1 (editada): " +msg1.getSentimento());

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma menssagem: ");
        String texto = sc.nextLine();

        Mensagem mensagem = new Mensagem(texto);
        System.out.println(mensagem.verificaHumor());
        sc.close();
    }
}