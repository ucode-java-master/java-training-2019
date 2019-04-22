package ucode.curs4;

public class CodingBat {

    public int[] makeLast(int[] nums) {
        int[] rezultat = new int[nums.length * 2];
        for (int iterator = 0; iterator < rezultat.length - 1; iterator++) {
            rezultat[iterator] = 0;
        }
        rezultat[rezultat.length - 1] = nums[nums.length - 1];
        return rezultat;
    }

    public int[] makeEnds(int[] nums) {
        int[] rez = new int[2];
        rez[0] = nums[0];
        rez[1] = nums[nums.length - 1];
        return rez;
    }

    public boolean twoAsOne(int a, int b, int c) {
        return a + b == c || b + c == a || a + c == b;
    }

    public boolean lastDigit(int a, int b, int c) {

        int lasta = a % 10;
        int lastb = b % 10;
        int lastc = c % 10;
        if (lasta == lastb || lastb == lastc || lastc == lasta) {
            return true;
        }
        return false;
    }

    public int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || b >= 13 && b <= 19) {
            return 19;
        } else {
            return a + b;
        }
    }

    public boolean makeBricks(int small, int big, int goal) {
        if (goal / 5 <= big) {
            return goal % 5 <= small;
        } else {
            goal = goal - big * 5;
            return goal <= small;
        }
    }


}
