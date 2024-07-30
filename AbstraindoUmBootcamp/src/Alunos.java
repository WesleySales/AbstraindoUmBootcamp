import java.util.ArrayList;
import java.util.List;

public class Alunos {
    private String nome;
    private List<Cursos> cursosConcluidos = new ArrayList<>();
    private List<Cursos> cursosInscrito = new ArrayList<>();

    public Alunos(String nome) {
        this.nome = nome;
    }
    public Alunos(){
    }

    public void criarAluno(String nome){
        setNome(nome);
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.cursosInscrito.addAll(bootcamp.getListaDeCursos());
        bootcamp.listaDeAlunos.add(this);
    }

    public List<Cursos> getCursosInscrito() {
        return cursosInscrito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    @Override
    public String toString() {
        return nome;
    }
}
