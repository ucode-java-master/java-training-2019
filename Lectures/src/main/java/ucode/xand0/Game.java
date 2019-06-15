package ucode.xand0;

public class Game {

    private KeyboardReader reader;
    private Score score;

    public Game() {
        this.reader = new KeyboardReader();
        this.score = new Score();
    }

    public void startGame() {
        while (true) {
            playGame();
            Printer.printScore(score);
        }
    }

    private void playGame() {
        MatrixElement whoMakesAMoveNextTurn = MatrixElement.X;

        XAnd0Matrix xand0 = new XAnd0Matrix();

        Printer.printMatrix(xand0);

        while (true) {
            MatrixElement whoMakesAMoveThisTurn = whoMakesAMoveNextTurn;
            PlayerMove nextMove = reader.getNextMove(whoMakesAMoveThisTurn);

            if (!xand0.makeMove(nextMove, whoMakesAMoveThisTurn)) {
                Printer.printIllegalMove();
                continue;
            } else {
                whoMakesAMoveNextTurn = determineNextMove(whoMakesAMoveThisTurn);
            }

            if (xand0.isGameWon(whoMakesAMoveThisTurn)) {
                gameIsWon(whoMakesAMoveThisTurn);
                break;
            }
            if (xand0.isGameEven()) {
                Printer.printGameEven();
                break;
            }
            Printer.printMatrix(xand0);
        }

        Printer.printMatrix(xand0);
    }

    private void gameIsWon(MatrixElement whoMakesAMoveThisTurn) {
        Printer.printGameWon(whoMakesAMoveThisTurn);
        score.updateScore(whoMakesAMoveThisTurn);
    }


    private MatrixElement determineNextMove(MatrixElement whoMakesAMove) {
        if (whoMakesAMove == MatrixElement.X) {
            return MatrixElement.O;
        }
        return MatrixElement.X;
    }

}
