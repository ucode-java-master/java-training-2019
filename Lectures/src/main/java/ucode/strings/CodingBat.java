package ucode.strings;

public class CodingBat {
    public static void main(String[] args) {
        CodingBat codingBat = new CodingBat();
        System.out.println(codingBat.in1020(12, 99));
    }


    //      https://codingbat.com/prob/p144535
//     Given 2 int values, return true if either of them is in the range 10..20 inclusive.
    public boolean in1020(int a, int b) {
        if (a >= 10 && a <= 20) {
            return true;
        }
        if (b >= 10 && b <= 20) {
            return true;
        }
        return false;
    }

    //    https://codingbat.com/prob/p136041
//    Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears
//    in the array somewhere.
    public boolean array123(int[] nums) {
        for (int iterator = 0; iterator < nums.length - 2; iterator++) {
            if (nums[iterator] == 1 && nums[iterator + 1] == 2 && nums[iterator + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    //    https://codingbat.com/prob/p171260
//  Given a string, return a version where all the "x" have been removed.
//  Except an "x" at the very start or end should not be removed.
    // or trecut 5 din 7
//stringX("abxxxcd") → "abcd"	"abxcd"
    public String stringX(String str) {
        for (int iterator = 1; iterator < str.length() - 1; iterator++) {
            if (str.charAt(iterator) == 'x') {
                str = str.substring(0, iterator) + str.substring(iterator + 1);
                iterator--;
            }
        }
        return str;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            if (c > b) {
                return true;
            } else {
                return false;
            }
        } else {
            if (c > b && b > a) {
                return true;
            } else {
                return false;
            }
        }
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
