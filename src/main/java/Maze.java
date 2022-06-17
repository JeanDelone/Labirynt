import java.util.Collections;
import java.util.List;

public class Maze {

//    columns and rows
    private int columns = 10;
    private int rows = 10;
    public Node[][] maze;

    private void generateEmptyGraph(){
        Node[][] innerMaze = new Node[this.rows][this.columns];
        for (int row = 0; row < this.rows; row++) {
            for (int col = 0; col < this.columns; col++) {
                innerMaze[row][col] = new Node(false, row, col);
            }
        }
        this.maze = innerMaze;
    }

    private void generateNeighbours(){
        for (int row = 0; row < this.rows; row++) {
            for (int col = 0; col < this.columns; col++) {
                if(row != 0){
                    this.maze[row][col].neighbours.add(maze[row-1][col]);
                }
                if(row != this.rows - 1){
                    this.maze[row][col].neighbours.add(maze[row+1][col]);
                }
                if(col != 0){
                    this.maze[row][col].neighbours.add(maze[row][col-1]);
                }
                if(col != this.columns - 1){
                    this.maze[row][col].neighbours.add(maze[row][col+1]);
                }
            }
        }
    }

//    Not finished
    public void drawMaze() {
        for (int row = 0; row < this.rows; row++) {
            System.out.println(" ");
            for (int col = 0; col < this.columns; col++) {

                for (int i = 0; i < 3; i++) {
//                    Draw celling
                    if(row == 0 && i == 0){
                        System.out.print("---");
                    }
                    if(col == 0 || col == this.columns - 1){
                        System.out.print("|");
                    }
                    else{
                        System.out.print(" ");
                    }

                }
            }

        }
    }



    private void DFS(Node actualV){
        actualV.isVisited = true;
        Collections.shuffle(actualV.neighbours);
        for (Node neighbour: actualV.neighbours) {
            if (!(neighbour.isVisited)){
                actualV.edgesTo.add(neighbour);
                neighbour.edgesTo.add(actualV);
                DFS(neighbour);
            }
        }
    }

    Maze(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        generateEmptyGraph();
        generateNeighbours();
        DFS(maze[0][0]);
    }


}
