public class Maze {

//    columns and rows
    private int columns = 10;
    private int rows = 10;
    public Node[][] maze;

    private void generateEmptyGraph(){
        Node[][] innerMaze = new Node[this.rows][this.columns];
        for (int row = 0; row < this.rows; row++) {
            for (int column = 0; column < this.columns; column++) {
                innerMaze[row][column] = new Node(false, row, column);
            }
        }
        this.maze = innerMaze;
    }

    Maze(int width, int height){
        this.rows = width;
        this.columns = height;
        generateEmptyGraph();
    }


}
