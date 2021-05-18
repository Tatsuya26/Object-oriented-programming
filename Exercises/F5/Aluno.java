package F5;

public class Aluno {
    private String nome;
    private String numero;

    public Aluno() {
        this.nome = "";
        this.numero = "";
    }

    public Aluno(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public Aluno(Aluno a) {
        this.nome = a.getNome();
        this.numero = a.getNumero();
    }

    public String getNome() {
        return this.nome;
    }

    public String getNumero() {
        return this.numero;
    }

    public Aluno Clone() {
        return new Aluno(this);
    }

    public boolean equals(Object o) {
        if(o == this) return true;
        if(o == null | !(o instanceof Aluno)) return false;
        Aluno a = (Aluno) o;
        return a.getNumero().equals(this.nome) && a.getNome().equals(this.nome);
    }
}
