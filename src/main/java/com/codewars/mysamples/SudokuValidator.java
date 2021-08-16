package com.codewars.mysamples;

import com.codewars.mysamples.annotation.UncompletedKata;

@UncompletedKata
public class SudokuValidator {
    public static void valid(int[][] sudoku) {
        int[] numCount = new int[9];
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                numCount[sudoku[i][j] - 1]++;
            }
        }
        for (int i = 0; i < numCount.length; i++) {
            System.out.printf("%d %10d;\n", i + 1, numCount[i]);
        }
    }
}
