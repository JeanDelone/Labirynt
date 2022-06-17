public class Main {
    public static void main(String[] args){

        int rows = 6;
        int columns = 6;

        Maze maze2 = new Maze(rows, columns);
        System.out.println(maze2.maze[0][1]);
        System.out.println(" ");
        System.out.println(maze2.maze[0][1].edgesTo);
        System.out.println(" ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(maze2.maze[i][j]);

            }
            System.out.println(" ");
            
        }

    }
}
