package entities;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mensagem {

    private String texto;
    private String sentimento;


    public Mensagem(String texto) {
        this.texto = texto;
        this.sentimento = verificaHumor();
    }

    public String getTexto() {
        return texto;
    }

    public void editarTexto(String texto) {
        this.texto = texto;
        this.sentimento = verificaHumor();
    }

    public String getSentimento() {
        return sentimento;
    }

    public String verificaHumor() {
        String padrao1 = ":-\\)";
        String padrao2 = ":-\\(";

        // Convertendo a string para minúsculas para uma correspondência sem diferenciação de maiúsculas/minúsculas
        texto = texto.toLowerCase();

        // Contagem da primeira ocorrência de emoticon
        long contadorPadrao1 = contarOcorrencias(texto, padrao1);

        // Contagem da segunda ocorrência de emoticon
        long contadorPadrao2 = contarOcorrencias(texto, padrao2);


        // Comparando as contagens
        if (contadorPadrao1 > contadorPadrao2) {
            return "divertido";
        } else if (contadorPadrao2 > contadorPadrao1) {
            return "chateado";
        }
        return "neutro";

    }
    // Função para contar ocorrências de um padrão na string usando Matcher
    public static long contarOcorrencias(String texto, String padrao) {
        Pattern pattern = Pattern.compile(padrao);
        Matcher matcher = pattern.matcher(texto);

        int contador = 0;
        while (matcher.find()) {
            contador++;
        }
        return contador;
    }
}


