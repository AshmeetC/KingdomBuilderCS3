public class Board {
    Sub TR;
    Sub TL;
    Sub BR;
    Sub BL;
    public Board(Sub a, Sub b, Sub c, Sub d){
        TR = a;
        TL = b;
        BR = c;
        BL = d;
        connect();
    }
    public void connect(){
        Hex[][] trRay = TR.getHexRay();
        Hex[][] tlRay = TL.getHexRay();
        Hex[][] brRay = BR.getHexRay();
        Hex[][] blRay = BL.getHexRay();
        //connect tl to the other boards it borders
    }
}
