import java.util.Scanner;
public class Aluno { //inicio da classe
    private String nomeAluno;
    private int matriculaAluno;
    private String cursoAluno;
    private String[] disciplinas;
    private float[] notasAluno;

    public Aluno(String nomeAluno, int matriculaAluno, String cursoAluno, String[] disciplinas, float[] notasAluno){
        this.nomeAluno = nomeAluno;
        this.matriculaAluno = matriculaAluno;
        this.cursoAluno = cursoAluno;
        this.disciplinas = disciplinas;
        this.notasAluno = notasAluno;
    }
//set e get para nomeAluno
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }
//set e get para matriculaAluo
    public void setMatriculaAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public int getMatriculaAluno() {
        return matriculaAluno;
    }
//set e get para cursoAluno
    public void setCursoAluno(String cursoAluno) {
        this.cursoAluno = cursoAluno;
    }

    public String getCursoAluno() {
        return cursoAluno;
    }
//set e get para disciplinas

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setNotasAluno(float[] notasAluno) {
        this.notasAluno = notasAluno;
    }

    public float[] getNotasAluno() {
        return notasAluno;
    }
    public void tabelaDoAluno(){
        System.out.println("Tabela de Disciplinas do Aluno:");
        System.out.println("Nome do Aluno: " + nomeAluno);
        System.out.println("Matrícula: " + matriculaAluno);
        System.out.println("Curso: " + cursoAluno);
        System.out.println("Disciplinas e Notas:");

        for (int i = 0; i < disciplinas.length; i++) {
            String disciplina = disciplinas[i];
            float nota = notasAluno[i];
            System.out.println(disciplina + "  --->  " + nota);
        }
    }
    public static void main(String[] args) { //inicio do metodo
        String[] disciplinas = {"Matematica", "Portugues", "Algebra"};
        float[] notas = {8, 9, 10};
        Aluno aluno1 = new Aluno("Gleyser",365418941,"Engenharia de Software", disciplinas, notas);
        aluno1.tabelaDoAluno();





    }
}
