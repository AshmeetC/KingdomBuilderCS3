import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class GameMain {
    public static void main(String[] args) throws IOException {
        ArrayList<Sub> lkk = new ArrayList<>();
        lkk.add (new Sub("board1.txt"));
        lkk.add (new Sub("board2.txt"));
        lkk.add (new Sub("board3.txt"));
        lkk.add (new Sub("board4.txt"));
        lkk.add (new Sub("board5.txt"));
        lkk.add (new Sub("board6.txt"));
        lkk.add (new Sub("board7.txt"));
        lkk.add (new Sub("board8.txt"));
        Collections.shuffle(lkk);
        ArrayList<Sub> usedBoards = new ArrayList<>();
        for(int i =0; i<4;i++){
            usedBoards.add(lkk.remove(0));
        }
        Board test = new Board(usedBoards.get(0), usedBoards.get(1), usedBoards.get(2), usedBoards.get(3));
        test.toString();
    }
}
