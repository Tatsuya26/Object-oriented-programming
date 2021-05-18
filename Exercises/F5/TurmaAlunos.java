package F5;

import java.util.*;
import java.util.stream.Collectors;

public class TurmaAlunos {
    private String uc;
    private String nome_turma;
    private Map<String, Aluno> alunos;

    public TurmaAlunos() {
        this.uc = "";
        this.nome_turma = "";
        this.alunos = new HashMap<>();
    }

    public TurmaAlunos(String uc, String nome_turma,Map<String,Aluno> alunos) {
        this.uc = uc;
        this.nome_turma = nome_turma;
        this.alunos = new HashMap<>(alunos);
    }

    public String getNome_turma() {
        return this.nome_turma;
    }

    public String getUc() {
        return this.uc;
    }

    public Map<String, Aluno> getAlunos() {
        return new HashMap<>(this.alunos);
    }

    public void setNome_turma(String nome_turma) {
        this.nome_turma = nome_turma;
    }

    public void setUc(String uc) {
        this.uc = uc;
    }

    public void setAlunos(Map<String, Aluno> a) {
        this.alunos = a.values().stream().collect(Collectors.toMap(Aluno::getNumero, Aluno::Clone));
    }

    public void insere_aluno(Aluno a) {
        String key = a.getNumero();
        this.alunos.putIfAbsent(key,a);
    }

    public Aluno getAluno(String codAluno){
        return this.alunos.get(codAluno).Clone();
    }

    public void removeAluno(String codAluno) {
        this.alunos.remove(codAluno);
    }

    public Set<String> todosOsCodigos() {
        return this.alunos.values().stream().
                                    map(Aluno::getNumero).
                                    collect(Collectors.toSet());
    }

    public int qtsAlunos() {
        return this.alunos.size();
    }

    public List<Aluno> collectAlunos() {
        return this.alunos.values().stream().map(Aluno::Clone).collect(Collectors.toList());

    }

    /*
    public Collection<Aluno> alunosOrdemAlfabetica() {
        List<Aluno> n =  this.alunos.values().stream().map(Aluno::Clone).collect(Collectors.toList());
        Comparator<Aluno> comp_letra = (a1,a2) -> (a1.getNome().equals(a2.getNome())) ? 1 : -1;
        n.sort(comp_letra);
        return n.stream().collect(Collectors.toCollection);
    }*/



}
