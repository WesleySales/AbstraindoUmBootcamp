import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        //criei o primeiro curso disponivel
        Cursos curso1 = new Cursos();
        curso1.setTitulo("Java funcional");
        curso1.setDescricao("Aprenda do zero ao funcional com Java");
        curso1.setCargaHoraria(4);

        //criei o segundo curso disponivel
        Cursos curso2 = new Cursos();
        curso2.setTitulo("Backend avançado com GO");
        curso2.setDescricao("Domine a linguagem GO e seja um backend requisitado");
        curso2.setCargaHoraria(6);

        //criei o terceiro curso disponivel
        Cursos curso3 = new Cursos();
        curso3.setTitulo("Banco de Dados");
        curso3.setDescricao("O melhor de Banco de Dados para um dev backend");
        curso3.setCargaHoraria(3);

        //criei o bootcamp1 que vai receber (nome, descrição e cursos)
        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Maratona Backend");
        bootcamp1.setDescricao("Voce vai sair do zero para o avaçado como desenvolverdor backend");
        bootcamp1.adicionarCurso(curso1);
        bootcamp1.adicionarCurso(curso3);

//        bootcamp1.adicionarAluno("Joao");
//        bootcamp1.adicionarAluno("Icaro");
//        bootcamp1.adicionarAluno("Breno");

        Alunos aluno1 = new Alunos();
        aluno1.setNome("Vinicius");
        aluno1.inscreverBootcamp(bootcamp1);

        Alunos aluno2 = new Alunos();
        aluno2.criarAluno("Aline");




        System.out.println(aluno2);
    }
}
