package com.company.F2;


public class notasTurma {
    private int[][] notasTurma;
    private int n = 5;

    /**
     * Construtor de turma e notas
     * Aceita como parametro uma matriz
     */
    public notasTurma(int[][] turma) {
        this.notasTurma = turma;
    }

    /**
     * Setter of aluno
     * Coloca na variável de instância notasTurma a nota do respetivo aluno
     */
    public void setGrade(int nota, int uc, int aluno) {
        this.notasTurma[aluno][uc] = nota;
    }

    /**
     * Get nota of aluno
     * Devolve a nota que um aluno tem a uma determinada disciplina
     */
    public int getNota(int aluno, int uc) {
        return this.notasTurma[aluno][uc];
    }

    /**
     * Soma das notas a uma determinada unidade curricular
     * @param uc
     * @return somatório de uc
     */
    public int SomaUC(int uc) {
        int sum = 0;
        for(int i = 0;i < n; i++) sum += getNota(i,uc);
        return sum;
    }

    /**
     *  média das notas de um aluno
     */
    public int media(int aluno) {
        int media = 0;
        for(int i = 0; i < n; i++) media += getNota(aluno,i);
        return media/5;
    }

    /**
     * Calcular menor nota de todas
     */
    public int menorNota() {
        int menor = Integer.MAX_VALUE, nota = 0;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                nota = (getNota(i,j) < menor) ? getNota(i,j) : menor;
        return nota;
    }

    /**
     * Calcular maior nota de todas
     */
    public int maiorNota() {
        int maior = Integer.MIN_VALUE, nota = 0;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                nota = (getNota(i,j) > maior) ? getNota(i,j) : maior;
        return nota;
    }

}