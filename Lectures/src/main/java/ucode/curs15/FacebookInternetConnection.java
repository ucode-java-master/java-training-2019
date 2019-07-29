package ucode.curs15;

import ucode.curs4.Dog;

public class FacebookInternetConnection extends InternetConnection {


    @Override
    protected String getActuallMessage(Dog mesaj) {
        return mesaj.toString();
    }

    public void playSound() {
        //play a sound
    }

}
