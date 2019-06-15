package ucode.xand0;

public class WinnerDecider {

    private final MatrixElement[][] matrix;

    public WinnerDecider(MatrixElement[][] matrix) {
        this.matrix = matrix;
    }

    public boolean isGameWon(MatrixElement element) {
        return secondaryDiagonalWinCondition(element) ||
                primaryDiagonalWinCondition(element) ||
                allColumnsWinCondition(element) ||
                allLinesWinCondition(element);
    }

    private boolean secondaryDiagonalWinCondition(MatrixElement element) {
        return matrix[0][2].equals(element) &&
                matrix[1][1].equals(element) &&
                matrix[2][0].equals(element);
    }

    private boolean primaryDiagonalWinCondition(MatrixElement element) {
        return matrix[0][0].equals(element) &&
                matrix[1][1].equals(element) &&
                matrix[2][2].equals(element);
    }

    private boolean lineWinCondition(MatrixElement element, int lineNumber) {
        return matrix[lineNumber][0].equals(element) &&
                matrix[lineNumber][1].equals(element) &&
                matrix[lineNumber][2].equals(element);
    }

    private boolean columnWinCondition(MatrixElement element, int columnNumber) {
        return matrix[0][columnNumber].equals(element) &&
                matrix[1][columnNumber].equals(element) &&
                matrix[2][columnNumber].equals(element);
    }

    private boolean allColumnsWinCondition(MatrixElement element) {
        for (int columnIterator = 0; columnIterator <= 2; columnIterator++) {
            if (columnWinCondition(element, columnIterator)) {
                return true;
            }
        }
        return false;
    }

    private boolean allLinesWinCondition(MatrixElement element) {
        for (int lineIterator = 0; lineIterator <= 2; lineIterator++) {
            if (lineWinCondition(element, lineIterator)) {
                return true;
            }
        }
        return false;
    }

}
