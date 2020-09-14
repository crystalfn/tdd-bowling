import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    void should_return_0_when_no_hit() {
        // Given
        int[] numberOfHits = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // When
        int result = BowlingGame.calculateScore(numberOfHits);

        // Then
        assertEquals(0, result);
    }

    @Test
    void should_return_300_when_all_hits() {
        // Given
        int[] numberOfHits = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

        // When
        int result = BowlingGame.calculateScore(numberOfHits);

        // Then
        assertEquals(300, result);
    }
}
