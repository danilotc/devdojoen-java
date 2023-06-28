package edu.danilotc.javaoneforall.introduction.arraysmult;

public class MultidimensionalArrays01 {
    public static void main(String[] args) {
        int[][] days = new int[4][3];

        days[0][0] = 31; // january
        days[0][1] = 28; // february
        days[0][2] = 31; // march

        days[1][0] = 30; // april
        days[1][1] = 31; // may
        days[1][2] = 30; // june

        days[2][0] = 31; // july
        days[2][1] = 31; // august
        days[2][2] = 30; // september

        days[3][0] = 31; // october
        days[3][1] = 30; // november
        days[3][2] = 31; // december

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }
    }
}
