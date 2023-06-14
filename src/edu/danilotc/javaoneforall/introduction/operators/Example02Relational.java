package edu.danilotc.javaoneforall.introduction.operators;

public class Example02Relational {
    public static void main(String[] args) {
        boolean isTenLowerThanTwenty = 10 < 20;
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLowerOrEqualsThanTwenty = 10 <= 20;
        boolean isTenGreaterOrEqualsThanTwenty = 10 >= 20;
        boolean isTenDifferentThanTwenty = 10 != 20;
        boolean isTenEqualsTwenty = 10 == 20;

        System.out.println("isTenLowerThanTwenty " + isTenLowerThanTwenty);
        System.out.println("isTenGreaterThanTwenty " + isTenGreaterThanTwenty);
        System.out.println("isTenLowerOrEqualsThanTwenty " + isTenLowerOrEqualsThanTwenty);
        System.out.println("isTenGreaterOrEqualsThanTwenty " + isTenGreaterOrEqualsThanTwenty);
        System.out.println("isTenDifferentThanTwenty " + isTenDifferentThanTwenty);
        System.out.println("isTenEqualsTwenty " + isTenEqualsTwenty);
    }
}
