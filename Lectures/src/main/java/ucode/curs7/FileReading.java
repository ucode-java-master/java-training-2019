package ucode.curs7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReading {

    public static void main(String[] args) throws FileNotFoundException {
        File ourFile = new File("Lectures/src/main/java/ucode/curs7/resources/asd.txt");

        FileReader inputStream = new FileReader(ourFile);

        BufferedReader bufferedReader = new BufferedReader(inputStream);

        Scanner scanner = new Scanner(inputStream);

        String a = scanner.nextLine();
        System.out.println(a);

        System.out.println(ourFile.exists());
    }

}
