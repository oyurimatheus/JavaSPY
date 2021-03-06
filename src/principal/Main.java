package  principal;

import modelos.Aluno;
import org.jspy.core.functools.Util;

import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Util util = new Util();

        Aluno aluno = new Aluno();
        aluno.setMatricula(123L);
        aluno.setNome("João");

        Map<String, Object> vars = util.vars(aluno);

        vars.forEach((String chave, Object valor) -> {
            System.out.println(chave + ": " + valor);
        });

        Set<String> dir = util.dir(aluno);
        System.out.println(dir);
        //dir.forEach(System.out::println);


    }
}
