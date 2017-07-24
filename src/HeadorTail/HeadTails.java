package HeadorTail;

import java.util.Random;

public class HeadTails {

    int[] dropCoin(int count) {
        Random rnd = new Random();
        int headsTails[] = new int[2];

        for (int i = 0; i < count; i++) {
            if (rnd.nextInt(2) == 0) {
                headsTails[0]++;
            } else {
                headsTails[1]++;
            }
        }
        return headsTails;
    }

}
