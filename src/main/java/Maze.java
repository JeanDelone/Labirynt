import java.util.Stack;

public class Maze {

//    width and height
    private int m = 10;
    private int n = 10;
    private Block[][] maze;

    private void generateEmptyGraph(){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = new Block(false, i, j);
            }
        }
    }


    Maze(int width, int height){
        this.m = width;
        this.n = height;
    }


}
