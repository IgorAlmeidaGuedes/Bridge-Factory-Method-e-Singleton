package Bridge;

public class MaterialConcreto implements Material {
    private static MaterialConcreto instance;
    private String nome;

    private MaterialConcreto(String nome) {
        this.nome = nome;
    }

    public static MaterialConcreto getInstance(String nome) {
        if (instance == null) {
            instance = new MaterialConcreto(nome);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Material: " + nome;
    }
}
