package ucode.xand0;

public class Score {

    private int xNumberOfWinnings;
    private int oNumberOfWinnings;

    public void updateScore(MatrixElement whoWon) {
        if (whoWon == MatrixElement.O) {
            oNumberOfWinnings++;
        } else {
            xNumberOfWinnings++;
        }
    }

    @Override
    public String toString() {
        return "player X: " + xNumberOfWinnings + ", player 0: " + oNumberOfWinnings;
    }

}
