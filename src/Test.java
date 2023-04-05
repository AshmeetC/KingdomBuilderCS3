import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Sub first = new Sub("board1.txt");
        Sub second = new Sub("board2.txt");
        Sub third = new Sub("board3.txt");
        Sub fourth = new Sub("board4.txt");
        Board test = new Board(first, second, third, fourth);
        test.toString("");
        //System.out.println("helo");
    }
}
