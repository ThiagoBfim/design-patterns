package br.org.project.design_patterns.behavior.flyweight;

import br.org.project.design_patterns.behavior.flyweight.old.CPlataforma;
import br.org.project.design_patterns.behavior.flyweight.old.JavaPlataforma;
import br.org.project.design_patterns.behavior.flyweight.old.PhytonPlataforma;
import br.org.project.design_patterns.behavior.flyweight.old.Plataforma;
import br.org.project.design_patterns.behavior.flyweight.pattern.PlataformaFactory;

/**
 * Pattern:
 *  Problema:   Há uma interface e muitas implementações dessa inteface. Para obter um objeto de qualquer uma das implementações,
 *              normalmente é gerado um novo, sem haver essa necessidade, todos poderiam ser Singleton.
 *              O ideal seria concentrar a criação em apenas um lugar para tornar o codigo mais limpo e claro.
 *  Solução:    Criar uma Factory que é responsavél por instanciar ou devolver alguma instancia já criada de uma terminada implementação.
 *
 *  Flyweight Pattern :
 *      * O padrão Flyweight tem como objetivo diminuir o custo de criação de objetos, visto que sempre haverá apenas uma unica instancia.
 *      * Esse padrão pode ser utilizado como forma de tornar a criação dos objetos mais eficiente e centralizado.
 */
public class TestFlyweight {

    public static void main(String[] args) {
        String code = "print('Flyweight');";
        formaOld(code);

        System.out.println("\nWith Pattern: \n");
        formaPattern(code, "C");
        formaPattern(code, "JAVA");
        formaPattern(code, "PHYTON");

    }

    private static void formaPattern(String code, String plataforma) {
        PlataformaFactory.getPlatformInstance(plataforma).execute(code);
    }

    private static void formaOld(String code) {
        Plataforma c = new CPlataforma();
        c.execute(code);
        Plataforma java = new JavaPlataforma();
        java.execute(code);
        Plataforma phyton = new PhytonPlataforma();
        phyton.execute(code);
    }

}