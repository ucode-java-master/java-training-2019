package ucode.strings;

public class StringsCreation {

    public static void main(String[] args) {

        String var1 = "batalin";
        String var2 = "catalim";

        System.out.println(var1.equals(var2));
        System.out.println(var1.compareTo(var2));

        if (var1.compareTo(var2) < 0) {
            System.out.println("batalin este mai mic decat catalim");
        }
        if (var1.compareTo(var2) == 0) {
            System.out.println("sunt egale");
        }
        if (var1.compareTo(var2) > 0) {
            System.out.println("catalim este mai mare decat batalin");
        }


//        StringsCreation stringsCreation = new StringsCreation();
//        stringsCreation.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"b", "f", "z"}, 3);
    }


}
