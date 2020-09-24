package sk.it;

import sk.it.controller.SudokuSolver;

public class Main {
    public static void main(String[] args) {
        SudokuSolver sudokuSolver = new SudokuSolver();

        sudokuSolver.start();
        sudokuSolver.reduceAvailableValues();
    }
}
