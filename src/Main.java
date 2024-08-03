import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Develper");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devSidney = new Dev();
        devSidney.setNome("Sidney");
        devSidney.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Sidney: " + devSidney.getConteudosInscritos());
        devSidney.progredir();
        devSidney.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Sidney: " + devSidney.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Sidney: " + devSidney.getConteudosConcluidos());
        System.out.println("XP: " + devSidney.calcularTotalXp());

        System.out.println("------------------------------");

        Dev devIvanessa = new Dev();
        devIvanessa.setNome("Ivanessa");
        devIvanessa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ivanessa: " + devIvanessa.getConteudosInscritos());
        devIvanessa.progredir();
        devIvanessa.progredir();
        devIvanessa.progredir();
        devIvanessa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ivanessa: " + devIvanessa.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Ivanessa: " + devIvanessa.getConteudosConcluidos());
        System.out.println("XP: " + devIvanessa.calcularTotalXp());

    }
}
