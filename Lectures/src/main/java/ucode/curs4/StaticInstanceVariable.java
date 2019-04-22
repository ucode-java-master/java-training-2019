package ucode.curs4;

public class StaticInstanceVariable {

    public int instanceVariable = 10;

    // can be accessed using the class or using an object.
    // the best practice is to NEVER EVER access statics using the object
    public static int classVariable = 10;

    public void addValue() {
        instanceVariable += 10;
        System.out.println("inside addValue method. I can see the classVariable here, with value: " + classVariable);
    }

    public static void main(String[] args) {

        System.out.println("Printing the static variable");
        System.out.println(StaticInstanceVariable.classVariable);
        StaticInstanceVariable.classVariable = 15;
        System.out.println(StaticInstanceVariable.classVariable);

        System.out.println("Declaring object 1");
        StaticInstanceVariable instance1 = new StaticInstanceVariable();
        System.out.println(instance1.instanceVariable);
        instance1.instanceVariable = 20;

        System.out.println("Declaring object 2");
        StaticInstanceVariable instance2 = new StaticInstanceVariable();
        System.out.println(instance2.instanceVariable);
        instance2.instanceVariable = 30;

        System.out.println("printing initial object values");
        System.out.println(instance1.instanceVariable);
        System.out.println(instance2.instanceVariable);

        System.out.println("modifying instance 1");
        instance1.addValue();
        System.out.println(instance1.instanceVariable);
        System.out.println(instance2.instanceVariable);

        StaticInstanceVariable.classVariable = 25;


        System.out.println("modifying instance 2");
        instance2.addValue();
        System.out.println(instance1.instanceVariable);
        System.out.println(instance2.instanceVariable);

        // one way of discarding objects to the trash
        instance1 = null;
        instance2 = null;

        System.out.println("we can still use class variables");
        System.out.println(StaticInstanceVariable.classVariable);

    }

}
