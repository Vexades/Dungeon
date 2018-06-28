import java.util.Arrays;
import java.util.Random;

public class Dungeon {
    public int[][] generate(int row, int col){
         int[][] size = dungeon(row,col);
        Random rand = new Random();
        int randomRow = rand.nextInt(row - 2)+2;
        int randomCol = rand.nextInt(col - 2)+2;
        int temp = randomCol;
        if(row < 2 || col < 2){
            System.out.println("Dungeon too small");
        }
        for(int i = 0 ; i <= row+col-1; i++){
            if(temp!=0){
                size[randomRow][i] = 1;
                temp--;
            }else{
                if(randomRow == -1){
                    break;
                }
                size[randomRow][randomCol] = 1;
                randomRow--;
            }
        }
        for (int i = 0; i < size.length; i++) {
            for (int j = 0; j < size[i].length; j++) {
                System.out.print(size[i][j] + " ");
            }
            System.out.println();
        }
        return size;
    }



    private int[][] dungeon(int row, int col){
        int[][] size = new int[row][col];
        for (int i = 0; i < size.length; i++) {
            for (int j = 0; j < size[i].length; j++) {
                size[i][j] = 0;
            }
        }
        return size;
    }






}
