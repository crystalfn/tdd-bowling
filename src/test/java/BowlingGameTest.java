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

    @Test
    void when_ten_frame_with_strike() {
        // Given
        int[] numberOfHits = {10, 1, 9, 5, 3, 6, 4, 3, 6, 5, 5, 10, 10, 7, 2, 10, 2, 4};

        // When
        int result = BowlingGame.calculateScore(numberOfHits);

        // Then
        assertEquals(156, result);
    }
}
