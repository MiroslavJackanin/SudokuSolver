package sk.it.view;

import sk.it.model.Tile;

public class View {
    public void printBoard(Tile[][] tiles){
        for (int i=0; i<tiles.length; i++){
            if (i%3 == 0){
                System.out.println();
            }
            for (int j=0; j<tiles.length; j++){
                if (j%3 == 0){
                    System.out.print("   ");
                }
                System.out.print(tiles[i][j].getValue()+" ");
            }
            System.out.println();
        }
    }
}
