package ucode.curs15;

import ucode.curs4.Dog;

public class Main {
    public static void main(String[] args) {
        InternetConnection connection = new FacebookInternetConnection();
        connection.connect();
        connection.sendMessage(new Dog());
        connection.disconnect();


//        InternetConnection connection = new GmailInternetConnection();
//        connection.connect();
//        connection.sendMessage(new Dog());
//        connection.disconnect();

        sendAMessageToMyWebsite(new Dog());
//        FacebookInternetConnection connection = (FacebookInternetConnection) getInternetConnection("facebookInternetConnection");


    }

    public static void sendAMessageToMyWebsite(Dog mesaj) {
        InternetConnection connection = null;
//                spring.getName("facebookInternetConnection");


        connection.connect();
        connection.sendMessage(mesaj);
        connection.disconnect();
    }


    public static InternetConnection getInternetConnection(String name) {
        return new FacebookInternetConnection();
    }

}
