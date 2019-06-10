package ucode.curs8.interfaces;

public interface MySpecialInterface {


    void veryFunnyName();

    private void doSomethingCommon(Pass pass) {
        System.out.println("common 1");
        System.out.println(pass);
    }

    default void contractMethod1() {
        System.out.println("contract method 1");
        doSomethingCommon(new Pass(1, 1));
    }

    default void contractMethod2() {
        System.out.println("contract method 2");
        doSomethingCommon(new Pass(2, 2));
    }

    class Pass {
        private int a;
        private int b;

        public Pass(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return "Pass{" +
                    "a=" + a +
                    ", b=" + b +
                    '}';
        }

    }


}
