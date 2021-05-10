import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Criação de linha de encomendas
        LinhaEncomenda l1 = new LinhaEncomenda("123","Sal",2.0,5,0.21,0.1);
        LinhaEncomenda l2 = new LinhaEncomenda("456","Azeite",2.8,25,0.21,0.1);
        LinhaEncomenda l3 = new LinhaEncomenda("789","Gasóleo",5.0,15,0.21,0.1);

        //Inicialização da lista a vazia
        List<LinhaEncomenda> lista = new ArrayList<>();

        //Criação da encomenda
        Encomenda e = new Encomenda("Casa","0210500","Barcelos, Braga",23, LocalDate.now(),lista);
        e.adicionaLinha(l1);
        e.adicionaLinha(l2);
        e.adicionaLinha(l3);
        System.out.println(e.toString());

        //Aplicação de metodos de calculo e verificação de produto por referência
        System.out.println("Valor total da encomenda = " + e.calculaValorTotal());
        System.out.println("Valor total de desconto =  " + e.calculaValorDesconto());
        System.out.println("Existe produto com a referência 123 - " + e.existeProdutoEncomenda("123"));
        System.out.println("Não existe produto com referencia 21 - "+ e.existeProdutoEncomenda("21"));
        System.out.println("Existem no total " + e.numeroTotalProdutos() + " produtos.\n\n");

        // remover produto
        System.out.println("Remoção de produto");
        e.removeProduto("123");
        System.out.println(e.toString());

    }
}
