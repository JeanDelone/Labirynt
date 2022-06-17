public class Main {

    public static void main(String[] args){

//        Frame frame = new Frame();

        int rows = 4;
        int columns = 4;

        Maze maze2 = new Maze(rows, columns);
        System.out.println(maze2.maze[0][1].neighbours);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(maze2.maze[i][j]);

            }
            System.out.println(" ");
            
        }

    }
}
