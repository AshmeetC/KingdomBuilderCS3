public class Board {
    Sub TR;
    Sub TL;
    Sub BR;
    Sub BL;
    public Board(Sub a, Sub b, Sub c, Sub d){
        TL = a;
        TR = b;
        BL = c;
        BR = d;
        hConnect(TL, TR);
        hConnect(BL, BR);
        vConnect(TL, BL);
        vConnect(TR, BR);
        //System.out.println(TR.getHexRay()[0][0].toString());
    }
    public Board(Sub a, Sub b){
        TL = a;
        TR = b;
        hConnect(TL, TR);
    }
    public void hConnect(Sub left, Sub right){
        Hex[][] lr = left.getHexRay();
        Hex[][] rr = right.getHexRay();
        for(int i = 0; i<10; i++){
            if(i==0){
                lr[i][9].set(1, rr[i][0]);
                rr[i][0].set(4, lr[i][9]);
                rr[i][0].set(3, lr[i+1][9]);
            }
            if(i!=0 && i!=9){
                if(i%2==0){
                    lr[i][9].set(1, rr[i][0]);
                    rr[i][0].set(4, lr[i][9]);
                    rr[i][0].set(5, lr[i-1][9]);
                    rr[i][0].set(3, lr[i+1][9]);
                }
                else{
                    rr[i][0].set(4, lr[i][9]);
                    lr[i][9].set(1, rr[i][0]);
                    lr[i][9].set(0, rr[i-1][0]);
                    lr[i][9].set(2, rr[i+1][0]);
                }
            }
            if(i==9){
                lr[i][9].set(0, rr[i-1][0]);
                lr[i][9].set(1, rr[i][0]);
                rr[i][0].set(4, lr[i][9]);
            }
        }
        //System.out.println(lr[0][0].toString());
    }
    public void vConnect(Sub top, Sub bottom){
        Hex[][] tr = top.getHexRay();
        Hex[][] br = bottom.getHexRay();
        for(int j = 0; j<10; j++){
            if(j==9){
                tr[9][j].set(3, br[0][j]);
                br[0][j].set(0, tr[9][j]);
            }
            else{
                tr[9][j].set(2, br[0][j+1]);
                tr[9][j].set(3, br[0][j]);
                br[0][j].set(0, tr[9][j]);
                if(j!=0)
                br[0][j].set(5, tr[9][j-1]);
            }
        }
    }
    public void toString(String x){
        System.out.println(TL.getHexRay()[0][0].toString());
    }
}
