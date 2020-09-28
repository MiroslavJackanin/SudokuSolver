package sk.it;

import sk.it.controller.SudokuSolver;
import sk.it.view.View;

public class Main {
    public static void main(String[] args) {
        SudokuSolver sudokuSolver = new SudokuSolver();
        View view = new View();

        sudokuSolver.start();
        view.printBoard(sudokuSolver.getBoard().getTiles());
        System.out.println("-------------------------");
        do {
            sudokuSolver.reduceAvailableValues();
            sudokuSolver.assignValues();
        } while (!sudokuSolver.checkCompletion());
        view.printBoard(sudokuSolver.getBoard().getTiles());
    }
}
