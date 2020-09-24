package sk.it.view;

public class View {
    public void printBoard(int[][] arr){
        for (int i=0; i<9; i++){
            if (i%3 == 0){
                System.out.println();
            }
            for(int j=0; j<9; j++){
                if (j%3 == 0){
                    System.out.print("   ");
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
