package HeadorTail;

public class Calc {

    int[] findSumm(Integer num) {

        char numeralChar[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int numeralInt[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String str = num.toString();
        int res[] = new int[(str.length() + 1)];

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < numeralChar.length; j++) {
                if (str.charAt(i) == numeralChar[j]) {
                    res[0] += numeralInt[j];
                    res[i + 1] = numeralInt[j];
                }
            }
        }

        return res;
    }
}
