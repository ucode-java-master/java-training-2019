package ucode.xand0;

public class PlayerMove {

    private int line;
    private int column;

    PlayerMove(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

}
