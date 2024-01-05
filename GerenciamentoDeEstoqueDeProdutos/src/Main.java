import entities.Produto;
import exceptions.EstoqueInsuficienteException;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws EstoqueInsuficienteException {



        try{
            Produto p = new Produto("Café", 89671, 17.90, 19);


            System.out.println("\n\n### Inicialmente ###: \n\n");
            System.out.println(p);
            p.atualizaEstoqueVenda(15);
            System.out.println("\n\n### Depois da venda ###: \n\n");
            System.out.println(p);

            p.atualizaEstoqueCompra(13);
            System.out.println("\n\n### Depois da compra ###: \n\n");
            System.out.println(p);

            System.out.println("\n### Tentativa de vender 18 unidades do produto ###");

            p.atualizaEstoqueVenda(18);
        }
        catch (IllegalArgumentException e){
            System.out.println("\nErro: " + e.getMessage());
        }
        catch (EstoqueInsuficienteException e) {

            System.out.println("\nOperação inválida: " + e.getMessage());
        }
        catch(
                InputMismatchException e)

        {
            System.out.println("\nErro: entrada inválida, tipo de dado incorreto");
        }
        catch(Exception e) {
            System.out.println("\nErro desconhecido: " + e.getMessage());
        }

    }
}



