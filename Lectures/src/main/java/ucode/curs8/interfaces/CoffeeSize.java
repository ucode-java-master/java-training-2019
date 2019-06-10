package ucode.curs8.interfaces;

public enum CoffeeSize {
    BIG(20, "jacobs"),
    HUGE(40),
    OVERWHELMING(60, "jacobs");

    private final int size;
    private final String brand;

    CoffeeSize(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    CoffeeSize(int size) {
        this.size = size;
        brand = "";
    }

    public int getSize() {
        return size;
    }
}
