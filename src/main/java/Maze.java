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

    private void generateNeighbours(){
        for (int row = 0; row < this.rows; row++) {
            for (int col = 0; col < this.columns; col++) {
                if(row != 0){
                    this.maze[row][col].neighbours.add(new Node(false, row - 1, col));
                }
                if(row != this.rows - 1){
                    this.maze[row][col].neighbours.add(new Node(false, row + 1, col));
                }
                if(col != 0){
                    this.maze[row][col].neighbours.add(new Node(false, row, col - 1));
                }
                if(col != this.columns - 1){
                    this.maze[row][col].neighbours.add(new Node(false, row, col + 1));
                }
            }
        }
    }

    private void DFS(Node actualV){
        actualV.isVisited = true;
        for (Node neighbour: actualV.neighbours) {
            if (!(neighbour.isVisited)){
                actualV.edgesTo.add(neighbour);
                DFS(neighbour);
            }
        }
    }

    Maze(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        generateEmptyGraph();
        generateNeighbours();
    }


}
