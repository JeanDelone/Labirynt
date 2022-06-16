import java.util.ArrayList;

public class Node {

    boolean isVisited;
    int row;
    int column;

    ArrayList<Node> neighbours = new ArrayList<>();

    Node(boolean isVisited, int row, int column){
        this.isVisited = isVisited;
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return "(r=" + row +
                ", c=" + column + ")";
    }
}
