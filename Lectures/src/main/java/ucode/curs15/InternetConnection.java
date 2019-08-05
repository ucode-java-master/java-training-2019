package ucode.curs15;

import ucode.curs4.Dog;

import java.io.IOException;
import java.net.Socket;

public abstract class InternetConnection {

    protected Socket socket;
    private String URL;

    public final void connect() {
        // connect to URL;
//        socket.connect();
//
    }

    public final void disconnect() {


        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final void sendMessage(Dog mesaj) {
//        try {
//            socket.getOutputStream().write(getActualMessage(mesaj));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    protected abstract String getActualMessage(Dog mesaj);


}
