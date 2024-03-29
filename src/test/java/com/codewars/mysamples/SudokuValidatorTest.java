package com.codewars.mysamples;

import org.junit.Test;

public class SudokuValidatorTest {
    @Test
    public void test() {
        int[][] sudoku = {
                {9, 7, 6, 4, 8, 1, 3, 2, 5},
                {1, 4, 3, 2, 5, 9, 7, 8, 6},
                {5, 2, 8, 3, 7, 6, 1, 9, 4},
                {6, 9, 4, 5, 1, 8, 2, 3, 7},
                {8, 1, 2, 7, 3, 4, 5, 6, 9},
                {7, 3, 5, 9, 6, 2, 4, 1, 8},
                {4, 6, 7, 8, 2, 3, 9, 5, 1},
                {2, 5, 1, 6, 9, 7, 8, 4, 3},
                {3, 8, 9, 1, 4, 5, 6, 7, 2}
        };
        SudokuValidator.valid(sudoku);
    }
}
