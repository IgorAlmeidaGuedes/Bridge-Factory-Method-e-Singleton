package Factory;

import Bridge.Ferramenta;
import Bridge.Material;

public class Machado extends Ferramenta {
    public Machado(Material material) {
        super(material);
    }

    @Override
    public void fabricar() {
        System.out.println("Fabricando machado com " + material.getTipo());
    }
}
