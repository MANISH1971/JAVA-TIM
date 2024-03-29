package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(0, 5, 5));
        System.out.println(canPack(1, 0, 6));
        System.out.println(canPack(5, 3, 24));
        System.out.println(canPack(1, 5, 10));
        System.out.println(canPack(2, 1, 5));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        int bigPack = bigCount * 5;

        if ((bigPack + smallCount) == goal) return true;

        for (int i = 0; i <= bigPack; i += 5) {
            for (int j = 0; j <= smallCount; j++) {
                if ((i) + j == goal) {
                    return true;
                }
            }
        }
        return false;
    }
}