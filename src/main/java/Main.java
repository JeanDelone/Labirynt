public class Main {

    public static void main(String[] args){

//        Frame frame = new Frame();

        int rows = 5;
        int columns = 3;

        Maze maze2 = new Maze(rows, columns);
        System.out.println(maze2.maze[0][0].neighbours);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(maze2.maze[i][j]);

            }
            System.out.println(" ");
            
        }

    }
}
