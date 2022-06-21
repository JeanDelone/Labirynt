import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;

public class Maze implements AMaze {

    //    columns and rows
    private int columns = 10;
    private int rows = 10;
    public Node[][] maze;

//    Generate empty graph without connections between them
    private void generateEmptyGraph(){
        Node[][] innerMaze = new Node[this.rows][this.columns];
        for (int row = 0; row < this.rows; row++) {
            for (int col = 0; col < this.columns; col++) {
                innerMaze[row][col] = new Node(false, row, col);
            }
        }
        this.maze = innerMaze;
    }

//    Simply generates connections with neighbours in maze graph
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

    //    Draw maze in console
    public void drawMaze() {
        for(int i=0;i<rows;i++) {
            System.out.print("@@");
        }
        System.out.println();
        for(int c=0;c<columns;c++) {
            if(c == 0){
                System.out.print("$");
            }

            else{
                System.out.print("@");
            }
            for(int r=0;r<rows-1;r++) {
                System.out.print(".");
                if(maze[r][c].edgesTo.contains(maze[r+1][c])) {
                    System.out.print(".");
                }
                else {
                    System.out.print("@");
                }
            }
            System.out.print(".");
            if(c == columns - 1){
                System.out.println("#");
            }
            else{
                System.out.println("@");
            }
            System.out.print("@");
            for(int r=0;r<rows;r++) {
                if(c == columns - 1) {
                    System.out.print("@@");
                } else if(maze[r][c].edgesTo.contains(maze[r][c+1])) {
                    System.out.print(".");
                }else {
                    System.out.print("@");
                }
                System.out.print("@");
            }
            System.out.println();
        }

    }

//    Just remake maze if user doesn't like current one :)
    public void remakeMaze(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns ; j++) {
                maze[i][j].edgesTo.clear();
                maze[i][j].isVisited = false;
            }
        }
        DFS(maze[0][0]);
    }

//    Maze maker, using DFS graph traversal method
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

//    save maze to a file given by user in Labirynty/ directory
    public void save(String name){
        try{
            FileWriter writer = new FileWriter("Labirynty/" + name);
            for(int i=0;i<rows;i++) {
                writer.append("@@");
            }
            writer.append("\n");
            for(int c=0;c<columns;c++) {
                if( c == 0){
                    writer.append("$");
                }
                else{
                    writer.append("@");
                }
                for(int r=0;r<rows-1;r++) {

                    writer.append(".");
                    if(maze[r][c].edgesTo.contains(maze[r+1][c])) {

                        writer.append(".");
                    }else {

                        writer.append(".");
                    }
                }
                writer.append(".");
                writer.append("\n@");
                writer.append("@");
                for(int r=0;r<rows;r++) {
                    if(c == columns - 1) {

                        writer.append("@@");
                    } else if(maze[r][c].edgesTo.contains(maze[r][c+1])) {

                        writer.append(".");
                    }else {

                        writer.append("@");
                    }
                    writer.append("@");
                }
                writer.append("\n");
            }
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
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
