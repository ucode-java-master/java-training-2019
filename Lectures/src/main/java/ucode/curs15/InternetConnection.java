package ucode.curs15;

import ucode.curs4.Dog;

import java.io.IOException;
import java.net.Socket;

public abstract class InternetConnection {

    protected Socket socket;
    private String URL;

    public void connect() {
        // connect to URL;
//        socket.connect();
//
    }

    public void disconnect() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(Dog mesaj) {
//        try {
//            socket.getOutputStream().write(getActuallMessage(mesaj));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    protected abstract String getActuallMessage(Dog mesaj);


}
