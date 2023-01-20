public class Scrabble {
    private int score = 0;
    private char[] word;
    private Character[] doubleLetter, tripleLetter;
    private boolean doubleWord, tripleWord;

    private static final int[] points = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};

    public Scrabble(String word) {
        this.word = (word == null ? "" : word).toUpperCase().toCharArray();
    }

    public Scrabble(String word, Character[] doubleLetter, Character[] tripleLetter, boolean doubleWord, boolean tripleWord) {
        this.word = (word == null ? "" : word).toUpperCase().toCharArray();
        this.doubleLetter = doubleLetter;
        this.tripleLetter = tripleLetter;
        this.doubleWord = doubleWord;
        this.tripleWord = tripleWord;
    }

    int score() {
        for (char c : word) {
            score += points[c - 65];
        }
        return multiplier();
    }

    int multiplier() {

        if (doubleLetter != null) {
            for (char c : doubleLetter) {
                score += points[c - 65];
            }
        }

        if (tripleLetter != null) {
            for (char c : tripleLetter) {
                score += points[c - 65] * 2;
            }
        }

        score = (doubleWord ? score*2 : score);

        score = (tripleWord ? score*3 : score);

        return score;
    }
}