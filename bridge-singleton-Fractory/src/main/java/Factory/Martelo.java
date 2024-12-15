package Factory;

import Bridge.Ferramenta;
import Bridge.Material;

public class Martelo extends Ferramenta {
    public Martelo(Material material) {
        super(material);
    }

    @Override
    public void fabricar() {
        System.out.println("Fabricando martelo com " + material.getTipo());
    }
}