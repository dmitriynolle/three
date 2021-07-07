package ru.geekbrains.java_three;

public class TestMain {
    public static int[] test_1(int[] test) {
        int j = 0;
        for (int i = test.length - 1; i >= 0; i--) {
            if (test[i] == 4) {
                j = i + 1;
                int[] testNew = new int[test.length - j];
                if (test.length - j >= 0) System.arraycopy(test, j, testNew, j - j, test.length - j);
                return testNew;
            }
        }
        throw new RuntimeException("Не содержит цифры 4");
    }

    public static boolean test_2(int[] test) {
        boolean contentOne = false;
        boolean contentTwo = false;
        for (int i = 0; i < test.length; i++) {
            if (test[i] == 1) contentOne = true;
            else if (test[i] == 4) contentTwo = true;
            else return false;
        }
        return contentOne && contentTwo;
    }
}
