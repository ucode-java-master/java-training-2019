package ucode.quiz;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("UnnecessaryInterfaceModifier")

public abstract interface Frobnicate {
    public void twiddle(String s);

}


class A {
    public static void main(String[] args) {
        Frobnicate a = new Frobnicate() {
            @Override
            public void twiddle(String s) {

            }
        };
        a.twiddle("a");

        Set b = new HashSet();

        Collection v;


    }

}


