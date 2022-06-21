public class Main {
    public static void main(String[] args){

        int rows = 10;
        int columns = 10;

        Maze maze2 = new Maze(rows, columns);

        maze2.drawMaze();
        maze2.remakeMaze();
        maze2.drawMaze();
        maze2.save("Labirynt1");


    }
}
