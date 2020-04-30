package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GronsfeldsCipher gr = new GronsfeldsCipher();
        TheCipherOfPolybias p = new TheCipherOfPolybias();
        Scanner b = new Scanner(System.in);
        Scanner k = new Scanner(System.in);
        System.out.println("Виконав Леськів Юрій КН-301");
        System.out.println("Виберіть мову :1)Англійська 2) - Українська");
        int i = k.nextInt();
        System.out.println("Введіть повідомлення для шифрування");
        String message = b.nextLine();
        b.close();
        k.close();
        if (i == 1) {
            System.out.println("Метод Гронсфельда");
            gr.Encryption(message);
            System.out.println("Метод Полібія");
            p.Encryption(message);
        } else {
            System.out.println("Метод Гронсфельда");
            gr.EncryptionUKR(message);
            System.out.println("Метод Полібія");
            p.EncryptionrUKR(message);
        }
    }
}
