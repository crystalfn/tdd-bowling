public class BowlingGame {
    public static int calculateScore(int[] numberOfHits) {
        int totalScore = 0;
        int frame = 0;

        for (int i = 0; i < numberOfHits.length; i++) {
            if (numberOfHits[i] == 10) {
                totalScore += numberOfHits[i] + numberOfHits[i+1] + numberOfHits[i+2];
            }

            frame++;
            if (frame == 10) { break; }
        }
        return totalScore;
    }
}
