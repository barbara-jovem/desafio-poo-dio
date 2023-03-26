package br.com.dio.desafio.dominio;

/*
todo bootcamp vai ter conteudos
Mentoria e Cursos serão conteudos
*/
public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d; //constante
    //modificador de acesso: só quem poderá ter acesso serão as classes filhas desta

    private String titulo;
    private String descricao;

    public abstract double calcularXp(); //método para calcular XP da Dio
    //abstract pq não consegue instanciar Conteudo
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
