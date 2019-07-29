package ucode.curs7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {

    public static void main(String[] args) {
        File ourFile = new File("Lectures/src/main/java/ucode/curs7/resources/asd1.txt");

        FileReader inputStream = null;
        try {
            inputStream = new FileReader(ourFile);
        } catch (FileNotFoundException e) {
            try {
                ourFile.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
//            System.out.println("Lectures/src/main/java/ucode/curs7/resources/asd1.txt" +" nu poate fi gasit");
//            System.exit(0);
        }

        BufferedReader bufferedReader = new BufferedReader(inputStream);

        Scanner scanner = new Scanner(inputStream);

        String a = scanner.nextLine();
        System.out.println(a);

        System.out.println(ourFile.exists());
    }

}
