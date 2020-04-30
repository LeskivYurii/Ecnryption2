package com.company;

public class TheCipherOfPolybias {

    void Encryption(String message) {
        message = message.toUpperCase();
        message = message.replaceAll(" ", "");
        message = message.replaceAll("J", "I");
        char[][] aplhavit = new char[][]{{'A', 'B', 'C', 'D', 'E'},
                {'F', 'G', 'H', 'I', 'K'},
                {'L', 'M', 'N', 'O', 'P'},
                {'Q', 'R', 'S', 'T', 'U'},
                {'V', 'W', 'X', 'Y', 'Z'}};
        int len = message.length();
        System.out.println("Зашифрований текст :");

        for(int i = 0; i < len; ++i) {
            char b = message.charAt(i);

            for(int j = 0; j < 5; ++j) {
                for(int k = 0; k < 5; ++k) {
                    if (b == aplhavit[j][k]) {
                        int f = 0;
                        if (j < 4) {
                            f = j + 1;
                        }

                        System.out.print(aplhavit[f][k] + " ");
                    }
                }
            }
        }

    }

    void EncryptionrUKR(String message) {
        message = message.toUpperCase();
        message = message.replaceAll(" ", "");
        char[][] aplhavit = new char[][]{{'А', 'Б', 'В', 'Г', 'Д', 'Е'}, {'Є', 'Ж', 'З', 'И', 'І', 'К'}, {'Л', 'М', 'Н', 'О', 'П', 'Р'}, {'С', 'Т', 'У', 'Ф', 'Х', 'Ц'}, {'Ч', 'Ш', 'Щ', 'Ю', 'Я', 'Ь'}};
        int len = message.length();
        System.out.println();
        System.out.print("Зашифрований текст: ");

        for(int i = 0; i < len; ++i) {
            char b = message.charAt(i);

            for(int j = 0; j < 5; ++j) {
                for(int k = 0; k < 6; ++k) {
                    if (b == aplhavit[j][k]) {
                        int f = 0;
                        if (j < 4) {
                            f = j + 1;
                        }

                        System.out.print(aplhavit[f][k] + " ");
                    }
                }
            }
        }

    }
}
