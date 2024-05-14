import br.com.theotrin.desafio.dominio.Bootcamp;
import br.com.theotrin.desafio.dominio.Curso;
import br.com.theotrin.desafio.dominio.Dev;
import br.com.theotrin.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoJavaPoo = new Curso();
        cursoJavaPoo.setDescricao("guia completo de programação orientada a objetos com Java");
        cursoJavaPoo.setCargaHoraria(20);
        cursoJavaPoo.setTitulo("POO com Java");

        Curso cursoJavaSpring = new Curso();
        cursoJavaSpring.setDescricao("Aprenda como criar API com Java e Springboot de forma robusta e eficaz");
        cursoJavaSpring.setCargaHoraria(80);
        cursoJavaSpring.setTitulo("Guia completo de Springboot ");

        Curso cursoSpringSecurity = new Curso();
        cursoSpringSecurity.setDescricao("Aprenda tudo sobre Spring Security");
        cursoSpringSecurity.setCargaHoraria(80);
        cursoSpringSecurity.setTitulo("Spring Security");

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria Java no back end");
        mentoriaJava.setDescricao("Vamos tirar todas as suas duvidas sobre Java no back end");
        mentoriaJava.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Imersão Java");
        bootcamp.setDescricao("Doomine Java no back end");
        bootcamp.getConteudos().add(cursoJavaPoo);
        bootcamp.getConteudos().add(cursoJavaSpring);
        bootcamp.getConteudos().add(cursoSpringSecurity);
        bootcamp.getConteudos().add(mentoriaJava);

        Dev devTheo = new Dev();
        devTheo.setNome("Theo");
        devTheo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos "+devTheo.getConteudosInscritos());

        devTheo.progredir();
        devTheo.progredir();

        System.out.println("Conteudos inscritos "+devTheo.getConteudosInscritos());
        System.out.println("Conteudos concluidos "+devTheo.getConteudosConcluidos());
        System.out.println("XP: "+ devTheo.calcularTotalXp());

        Dev devAlfredo = new Dev();
        devTheo.setNome("Alfredo");

    }
}
