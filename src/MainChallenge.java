public class MainChallenge {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        displayHighScorePosition("Tim", calculateHighScorePosition(1499));
        displayHighScorePosition("Tim", calculateHighScorePosition(999));
        displayHighScorePosition("Tim", calculateHighScorePosition(499));
        displayHighScorePosition("Tim", calculateHighScorePosition(99));
        displayHighScorePosition("Tim", calculateHighScorePosition(-1000));
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the High Score list.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {return 4;}
    }
}
