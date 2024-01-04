package entities;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Mensagem {
    private String texto;
    private String sentimento;

    public Mensagem(String texto) {
        this.texto = texto;
        this.sentimento = this.verificaHumor();
    }

    public String getTexto() {
        return this.texto;
    }

    public void editarTexto(String texto) {
        this.texto = texto;
        this.sentimento = this.verificaHumor();
    }

    public String getSentimento() {
        return this.sentimento;
    }

    public String verificaHumor() {
        String padrao1 = ":-\\)";
        String padrao2 = ":-\\(";
        this.texto = this.texto.toLowerCase();
        long contadorPadrao1 = contarOcorrencias(this.texto, padrao1);
        long contadorPadrao2 = contarOcorrencias(this.texto, padrao2);
        if (contadorPadrao1 > contadorPadrao2) {
            return "divertido";
        } else {
            return contadorPadrao2 > contadorPadrao1 ? "chateado" : "neutro";
        }
    }

    public static long contarOcorrencias(String texto, String padrao) {
        Pattern pattern = Pattern.compile(padrao);
        Matcher matcher = pattern.matcher(texto);

        int contador;
        for(contador = 0; matcher.find(); ++contador) {
        }

        return (long)contador;
    }
}
