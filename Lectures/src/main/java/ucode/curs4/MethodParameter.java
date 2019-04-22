package ucode.curs4;

public class MethodParameter {

    public static void main(String[] args) {
        MethodParameter methodParameter = new MethodParameter();

        methodParameter.thisMethodReceivesAParameter(26);
        methodParameter.thisMethodReceivesAParameter(16);
    }

    // parameter = variable declared outside of this method, and passed to this method so it can use it
    // methods = first level of encapsulation
    public void thisMethodReceivesAParameter(int personAge) {
        if (personAge < 18) {
            System.out.println("Jail bait");
        } else {
            System.out.println("Some wine can do the trick ;) ");
        }
    }

}
