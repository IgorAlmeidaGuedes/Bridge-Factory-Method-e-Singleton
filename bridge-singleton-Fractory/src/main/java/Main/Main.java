package Main;

import Factory.FerramentaFactory;
import Bridge.Ferramenta;

public class Main {

    public static void main(String[] args) {

        // Criar ferramenta com material
        Ferramenta ferramenta = FerramentaFactory.criarFerramenta("martelo", "Titânio");

        // Exibir informações da ferramenta criada
        System.out.println("Ferramenta criada: " + ferramenta.getClass().getSimpleName());
    }
}
