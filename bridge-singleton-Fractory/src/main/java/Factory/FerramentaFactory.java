package Factory;

import Bridge.Ferramenta;
import Bridge.MaterialConcreto;

import java.lang.reflect.Constructor;

public class FerramentaFactory {

    public static Ferramenta criarFerramenta(String tipoFerramenta, String nomeMaterial) {
        try {
            // Obter instância do material
            MaterialConcreto material = MaterialConcreto.getInstance(nomeMaterial);

            // Montar o nome completo da classe da ferramenta
            String nomeClasse = "Bridge." + tipoFerramenta.substring(0, 1).toUpperCase() + tipoFerramenta.substring(1).toLowerCase();

            // Obter a classe da ferramenta usando reflexão
            Class<?> classe = Class.forName(nomeClasse);

            // Obter o construtor que aceita um parâmetro do tipo Material
            Constructor<?> constructor = classe.getConstructor(MaterialConcreto.class);

            // Criar uma nova instância da ferramenta usando o construtor
            return (Ferramenta) constructor.newInstance(material);
        } catch (Exception e) {
            throw new IllegalArgumentException("Ferramenta não reconhecida: " + tipoFerramenta, e);
        }
    }
}
