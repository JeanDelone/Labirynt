public interface AMaze {

//    Self-explanatory, recreate currently existing maze
    void remakeMaze();

//    Saves generated maze to a file that user's type name in
//    It will be saved in Labirynty/ directory
    void save(String name);

//    Draws current maze in a console.
//    "." represents possible routs user can go through
//    "@" represents walls3
//    "$" represents start of the maze
//    "€" represents end of the maze
    void drawMaze();

}
