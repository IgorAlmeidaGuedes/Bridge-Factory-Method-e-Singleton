package Factory;

import Bridge.Ferramenta;
import Bridge.Material;

public class ChaveDeFenda extends Ferramenta {
    public ChaveDeFenda(Material material) {
        super(material);
    }

    @Override
    public void fabricar() {
        System.out.println("Fabricando chave de fenda com " + material.getTipo());
    }
}
