package ucode.xand0;

public enum MatrixElement {
    X("X"),
    O("0"),
    E(" ");

    private final String representation;

    MatrixElement(String s) {
        this.representation = s;
    }

    @Override
    public String toString() {
        return representation;
    }
}
