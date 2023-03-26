import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){ //planta da casa
        Curso curso1 = new Curso(); //casa construída
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso(); //casa construída
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBarbara = new Dev();
        devBarbara.setNome("Bárbara");
        devBarbara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bárbara: " + devBarbara.getConteudosInscritos);
        devBarbara.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bárbara: " + devBarbara.getConteudosInscritos);
        System.out.println("Conteúdos Concluídos Bárbara: " + devBarbara.getConteudosConcluidos);
        System.out.println("XP: " + devBarbara.calcularTotalXp());

        System.out.println("----------");

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Matheus: " + devMatheus.getConteudosInscritos);
        devMatheus.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Matheus: " + devMatheus.getConteudosInscritos);
        System.out.println("Conteúdos Concluídos Matheus: " + devMatheus.getConteudosConcluidos);
        System.out.println("XP: " + devMatheus.calcularTotalXp());
    }

}