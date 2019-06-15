package ucode.xand0;

public class XAnd0Matrix {

    private MatrixElement[][] matrix;

    XAnd0Matrix() {
        matrix = new MatrixElement[3][3];
        for (int lineIterator = 0; lineIterator < 3; lineIterator++) {
            for (int columnIterator = 0; columnIterator < 3; columnIterator++) {
                matrix[lineIterator][columnIterator] = MatrixElement.EMPTY;
            }
        }
    }

    public boolean makeMove(PlayerMove move, MatrixElement element) {
        if (matrix[move.getLine()][move.getColumn()].equals(MatrixElement.EMPTY)) {
            matrix[move.getLine()][move.getColumn()] = element;
            return true;
        }
        return false;
    }

    public boolean isGameWon(MatrixElement element) {
        WinnerDecider winnerDecider = new WinnerDecider(matrix);
        return winnerDecider.isGameWon(element);
    }

    public MatrixElement[][] getMatrix() {
        return matrix;
    }

    public boolean isGameEven() {
        return !isGameWon(MatrixElement.X) && !isGameWon(MatrixElement.O) && isMatrixFull();
    }

    private boolean isMatrixFull() {
        for (int lineIterator = 0; lineIterator < 3; lineIterator++) {
            for (int columnIterator = 0; columnIterator < 3; columnIterator++) {
                if (matrix[lineIterator][columnIterator] == MatrixElement.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

}
