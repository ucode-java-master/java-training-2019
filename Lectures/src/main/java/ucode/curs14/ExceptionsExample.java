package ucode.curs14;

import java.io.File;
import java.io.FileNotFoundException;

public class ExceptionsExample {

    public static void main(String[] args) throws FileNotFoundException {
//        ExceptionsExample exceptionsExample = null;
//        nullPointer(exceptionsExample);

//        openFileS();

        ExceptionsExample exceptionsExample = new ExceptionsExample();
        System.out.println("exceptionsExample.getResult() = " + exceptionsExample.getResult());
    }

    public static void nullPointer(ExceptionsExample exceptionsExample) throws NullPointerException {

        try {

            exceptionsExample.aMethod();
        } catch (Exception e) {
            System.out.println("I got this exception: " + e);
        }
    }

    public static void openFileS() throws FileNotFoundException {
        ExceptionsExample exceptionsExample = new ExceptionsExample();
        exceptionsExample.openFile();
    }

    public void aMethod() {

    }

    public void openFile() throws FileNotFoundException {
        File file = new File("");
        System.out.println("file.exists() = " + file.exists());
        System.out.println("file.getPath() = " + file.getPath());

//            FileInputStream inputStream = new FileInputStream(file);

        try {
            if (file.exists()) {
            }
            throw new FileNotFoundException();

        } catch (IllegalArgumentException e) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException();
            fileNotFoundException.initCause(e);
            throw fileNotFoundException;
        } catch (RuntimeException e) {


        } catch (FileNotFoundException e) {
            System.out.println("naspa");
        } finally {
            System.out.println("finally");
        }
    }

    public int getResult() {
        int result = 10;
        try {
            return result;
        } finally {
            result = 30;
        }
    }

}
