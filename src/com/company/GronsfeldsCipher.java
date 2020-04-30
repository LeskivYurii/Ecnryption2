package com.company;

import java.util.Arrays;
import java.util.Random;

public class GronsfeldsCipher {

    void Encryption(String message) {
        char[] aplhavit = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] randArr = new int[message.length()];
        Random random = new Random();
        randArr[0] = random.nextInt(9) + 1;

        for(int i = 1; i < message.length(); ++i) {
            randArr[i] = random.nextInt(10);
        }

        System.out.println("Згенерований ключ: " + Arrays.toString(randArr));
        String strUpper = message.toUpperCase();
        System.out.print("Зашифрований текст: ");

        for(int i = 0; i < message.length(); ++i) {
            char curCh = strUpper.charAt(i);

            for(int j = 0; j < aplhavit.length; ++j) {
                if (curCh == aplhavit[j]) {
                    int check = j + randArr[i];
                    if (check > 25) {
                        check -= 25;
                    }

                    System.out.print(aplhavit[check] + " ");
                }
            }
        }

    }

    void EncryptionUKR(String message) {
        char[] aplhavit = new char[]{'А', 'Б', 'В', 'Г', 'Ґ', 'Д', 'Е', 'Є', 'Ж', 'З', 'И', 'І', 'Ї', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ь', 'Ю', 'Я'};
        int[] randArr = new int[message.length()];
        Random random = new Random();
        randArr[0] = random.nextInt(9) + 1;

        for(int i = 1; i < message.length(); ++i) {
            randArr[i] = random.nextInt(10);
        }

        System.out.println("Згенерований ключ: " + Arrays.toString(randArr));
        String strUpper = message.toUpperCase();
        System.out.print("Зашифрований текст: ");

        for(int i = 0; i < message.length(); ++i) {
            char curCh = strUpper.charAt(i);

            for(int j = 0; j < aplhavit.length; ++j) {
                if (curCh == aplhavit[j]) {
                    int check = j + randArr[i];
                    if (check > 32) {
                        check -= 33;
                    }

                    System.out.print(aplhavit[check] + " ");
                }
            }
        }

    }
}
