public class Main {
    public static void main(String[] args){

        int rows = 10;
        int columns = 10;

        Maze maze2 = new Maze(rows, columns);
//        System.out.println(maze2.maze[0][1]);
//        System.out.println(" ");
//        System.out.println(maze2.maze[0][1].edgesTo);
//        System.out.println(" ");
//        for (int i = 0; i < columns; i++) {
//            for (int j = 0; j < rows; j++) {
//                System.out.println(maze2.maze[i][j] + "             " + maze2.maze[i][j].edgesTo);
//
//            }
//            System.out.println(" ");
//
//        }

        maze2.drawMaze();
        maze2.save("Labirynt1");


    }
}
