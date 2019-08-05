package ucode.curs15;

import ucode.curs4.Dog;

public class FacebookInternetConnection extends InternetConnection {


    @Override
    protected String getActualMessage(Dog dog) {
        return dog.toString();
    }

    public void playSound() {
        //play a sound
    }

}
