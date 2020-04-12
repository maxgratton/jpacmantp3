package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {

    @Test
    public void testIsAlive() {
        PacManSprites pacManSprites = new PacManSprites();
        PlayerFactory factory = new PlayerFactory(pacManSprites);
        Player player = factory.createPacMan();
        assertThat(player.isAlive()).isTrue();
    }

}
