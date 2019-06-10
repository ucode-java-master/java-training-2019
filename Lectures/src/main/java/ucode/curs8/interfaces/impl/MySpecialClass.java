package ucode.curs8.interfaces.impl;

import ucode.curs8.interfaces.Clickable;
import ucode.curs8.interfaces.MySpecialInterface;

public class MySpecialClass implements MySpecialInterface, Clickable {

    public void testThis() {
        this.contractMethod1();
        Pass pass = new Pass(3, 3);

        contractMethod1();
        contractMethod2();

    }

    @Override
    public void veryFunnyName() {

    }

}
