import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bootcamp {
    private String nome;
    private String descricao;
    private Date dataInicial;
    private Date dataFinal;

    protected List<Alunos> listaDeAlunos= new ArrayList<>();
    protected List<Cursos> listaDeCursos = new ArrayList<>();

    public void adicionarCurso(Cursos curso){
        listaDeCursos.add(curso);
    }

    public void exibirAlunos(){
        System.out.println(listaDeAlunos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public List<Alunos> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Alunos> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public List<Cursos> getListaDeCursos() {
        return listaDeCursos;
    }

    public void setListaDeCursos(List<Cursos> listaDeCursos) {
        this.listaDeCursos = listaDeCursos;
    }

    @Override
    public String toString() {
        return "Bootcamp = "+ nome + '\'' +
                ", \nDescricao='" + descricao + '\'' +
                ", \nAlunos matriculados = " + listaDeAlunos +
                ", \nCursos oferecidos= " + listaDeCursos +
                '}';
    }
}
