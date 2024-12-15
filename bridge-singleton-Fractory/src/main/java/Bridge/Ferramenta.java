package Bridge;

public abstract class Ferramenta {
    protected Material material;

    public Ferramenta(Material material) {
        this.material = material;
    }

    public abstract void fabricar();
}
