import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Encomenda {
    private String nome;
    private String numeroFiscal;
    private String morada;
    private int numEncomenda;
    private LocalDate dataEncomenda;
    private List<LinhaEncomenda> linhaEncomenda;


    //Construtores

    public Encomenda() {
        this.nome = "";
        this.numeroFiscal = "";
        this.morada = "";
        this.numEncomenda = 0;
        this.dataEncomenda = LocalDate.now();
        this.linhaEncomenda = new ArrayList<>();
    }

    public Encomenda(String nome, String numeroFiscal, String morada,int numEncomenda, LocalDate data, List<LinhaEncomenda> linha) {
        this.nome = nome;
        this.numeroFiscal = numeroFiscal;
        this.morada = morada;
        this.dataEncomenda = data;
        this.numEncomenda = numEncomenda;
        this.linhaEncomenda = new ArrayList<>();
        for(LinhaEncomenda l: linha) this.linhaEncomenda.add(l.clone());

    }

    public Encomenda(Encomenda e) {
        this.nome = e.getNome();
        this.numeroFiscal = e.getNumeroFiscal();
        this.morada = e.getMorada();
        this.dataEncomenda = e.getDataEncomenda();
        this.numEncomenda = e.getNumEncomenda();
        this.linhaEncomenda = new ArrayList<>();
        for(LinhaEncomenda l: e.getLinhaEncomenda()) this.linhaEncomenda.add(l.clone());
    }

    /*
        Getters
     */
    public String getNome() {
        return this.nome;
    }

    public String getMorada() {
        return this.morada;
    }

    public List<LinhaEncomenda> getLinhaEncomenda() {
        List<LinhaEncomenda> l = new ArrayList<>();
        for(LinhaEncomenda ls: this.linhaEncomenda) l.add(ls.clone());
        return l;
    }

    public LocalDate getDataEncomenda() {
        return this.dataEncomenda;
    }

    public int getNumEncomenda() {
        return this.numEncomenda;
    }

    public String getNumeroFiscal() {
        return this.numeroFiscal;
    }

    /*
        Setters
     */

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setDataEncomenda(LocalDate dataEncomenda) {
        this.dataEncomenda = dataEncomenda;
    }

    public void setLinhaEncomenda(List<LinhaEncomenda> linha) {
        this.linhaEncomenda = new ArrayList<>();
        for(LinhaEncomenda l: linha) this.linhaEncomenda.add(l.clone());
    }

    public void setNumEncomenda(int numEncomenda) {
        this.numEncomenda = numEncomenda;
    }

    public void setNumeroFiscal(String numeroFiscal) {
        this.numeroFiscal = numeroFiscal;
    }




    /*
    Useful methods
     */

    public Encomenda clone(Encomenda e) {
        return new Encomenda(e);
    }

    // método que determina o valor total da encomenda,
    public double calculaValorTotal() {
        return this.linhaEncomenda.stream().map(LinhaEncomenda::calculaValorLinhaEnc).reduce(0.0, Double::sum);
    }


    //método que determina o valor total dos descontos obti-dos nos diversos produtos encomendados
    public double calculaValorDesconto() {
        return  this.linhaEncomenda.stream().map(LinhaEncomenda::calculaValorDesconto).reduce(0.0,Double::sum);
    }


    //método que determina o número total de produtos a receber
    public int numeroTotalProdutos() {
        return this.linhaEncomenda.stream().map(LinhaEncomenda::getQuantidade).reduce(0, Integer::sum);
    }

    //método  que  determina  se  um  produto  vai  ser  encomendado
    public boolean existeProdutoEncomenda(String refProduto) {
        return this.linhaEncomenda.stream().anyMatch(LinhaEncomenda-> LinhaEncomenda.getReferencia().equals(refProduto));
    }

    //método que adiciona uma nova linha de encomenda
    public void adicionaLinha(LinhaEncomenda linha) {
        this.linhaEncomenda.add(linha.clone());
    }

    //método que remove uma linha de encomenda dado a referênciado produto,
    public void removeProduto(String codProd) {
        this.linhaEncomenda = linhaEncomenda.stream().filter(e -> !(e.getReferencia().equals(codProd))).collect(Collectors.toList());
    }






    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Encomenda)) return false;
        Encomenda e = (Encomenda) o;
        return  this.nome.equals(e.getNome())                      &&
                this.numEncomenda == e.getNumEncomenda()           &&
                this.dataEncomenda.equals(e.getDataEncomenda())    &&
                this.morada.equals(e.getMorada())                  &&
                this.numeroFiscal.equals(e.getNumeroFiscal())      &&
                this.linhaEncomenda.equals(e.getLinhaEncomenda());
    }

    public String toString() {
        List<LinhaEncomenda> l = this.getLinhaEncomenda();
        return "Encomenda{\n" +
                "nome='" + this.nome + '\'' +
                ", \nnumeroFiscal='" + this.numeroFiscal + '\'' +
                ", \nmorada='" + this.morada + '\'' +
                ", \nnumEncomenda=" + this.numEncomenda +
                ", \ndataEncomenda=" + this.dataEncomenda +
                ", \nlinhaEncomenda=" + this.linhaEncomenda +
                '}';
    }
}
