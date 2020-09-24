package sk.it;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputData {
    public int[][] processData(){
        String inputData = getData();
        int[][] arr = new int[9][9];
        for (int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                arr[i][j] = (inputData.charAt(9*i+j)) - '0';
            }
        }
        return arr;
    }

    public String getData(){
        String sourceFile = "C:\\Users\\MIRO\\IdeaProjects\\Sudoku\\src\\sk\\it\\InputData.txt";
        String data = "";
        try {
            File myFile = new File(sourceFile);
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }
}
