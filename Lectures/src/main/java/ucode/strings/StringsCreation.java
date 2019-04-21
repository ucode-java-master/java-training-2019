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


    /**
     * https://codingbat.com/prob/p139150
     */
    public String[] mergeTwo(String[] a, String[] b, int n) {
        int iter1 = 0;
        int iter2 = 0;
        String[] toReturn = new String[n];
        int count = 0;
        while (count < n && (iter1 < a.length || iter2 < b.length)) {
            if (a[iter1].compareTo(b[iter2]) <= 0) {
                if (count != 0 && a[iter1].equals(toReturn[count - 1])) {
                    iter1++;
                } else {
                    toReturn[count++] = a[iter1++];
                }
            } else if (a[iter1].compareTo(b[iter2]) > 0) {
                if (count != 0 && b[iter2].equals(toReturn[count - 1])) {
                    iter2++;
                } else {
                    toReturn[count++] = b[iter2++];
                }
            }
        }
        return toReturn;
    }

}
