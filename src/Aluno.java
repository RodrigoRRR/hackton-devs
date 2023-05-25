public class Aluno {
    private int idAluno;
    private String nomeAluno;
    private int turma;
    double[] nota = new double[3];
    boolean situacao;

    public Aluno() {
    }

    public Aluno(int idAluno, String nomeAluno, int turma, double[] nota, boolean situacao) {
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
        this.turma = turma;
        this.nota = nota;
        this.situacao = situacao;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
}
