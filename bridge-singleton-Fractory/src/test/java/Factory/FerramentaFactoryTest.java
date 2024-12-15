package Factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FerramentaFactoryTest {

    @Test
    public void testCriarFerramentaValida() {
        MaterialConcreto material = MaterialConcreto.getInstance("Titânio");
        Ferramenta ferramenta = FerramentaFactory.criarFerramenta("Martelo", material);

        assertNotNull(ferramenta);
        assertEquals("Martelo", ferramenta.getClass().getSimpleName());
    }

    @Test
    public void testCriarFerramentaInvalida() {
        MaterialConcreto material = MaterialConcreto.getInstance("Titânio");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FerramentaFactory.criarFerramenta("Inexistente", material);
        });

        assertEquals("Ferramenta não reconhecida: Inexistente", exception.getMessage());
    }
}