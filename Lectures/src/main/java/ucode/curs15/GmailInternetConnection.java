package ucode.curs15;

import ucode.curs4.Dog;

public class GmailInternetConnection extends InternetConnection {
    @Override
    protected String getActualMessage(Dog dog) {
        return dog.getColor() + "|" + dog.getWeight();
    }

}
