package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    //A medida que for concluindo os cursos, serão listados em ordem
    //polimorfismo = instanciando atraves da classe mãe

    //listar métodos abaixo:
    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosIncritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this); //adiciona o dev no bootcamp
    }
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosIncritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get()); //conteudo concluido sai da lista de conteudo a fazer
            this.conteudosIncritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum Conteudo.");
        }
    }
    public double calcularTotalXp() {
        this.conteudosConcluidos
                .stream()
                .mapToDouble((Conteudo::calcularXp)) //reference method no lugar do lambda
                .sum();
    //pega o XP de cada conteúdo e soma
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosIncritos() {
        return conteudosIncritos;
    }

    public void setConteudosIncritos(Set<Conteudo> conteudosIncritos) {
        this.conteudosIncritos = conteudosIncritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    //criar equals e hashcode pois está usando o "Hash":
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosIncritos, dev.conteudosIncritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosIncritos, conteudosConcluidos);
    }
}