import java.util.*;
public class Sub {
    Hex cornerTopLeft;
    Hex[][] hexRay;
    public Sub(Hex ctl){
        cornerTopLeft = ctl;
        hexRay = new Hex[10][10];
        toMatrix();
    }
    public Sub(String[][] x){
        toHexRay(x);
    }
    public void toMatrix(){
        //   turns the hexagon graph into a matrix
    }
    public void toHexRay(String[][] x){
        //   takes an input matrix and turns it into a hexagon graph
        for(int i =0; i<10; i++){
            for(int j =0; j<10; j++){
                hexRay[i][j]= new Hex(x[i][j]);
            }
        }
        for(int i =0; i<10; i++){
            for(int j =0; j<10; j++){
                if(i!=0 && j!=0 && i!=9 && j!=9){
                    hexRay[i][j].set(0, hexRay[i-1][j+1]);
                    hexRay[i][j].set(1, hexRay[i][j+1]);
                    hexRay[i][j].set(2, hexRay[i+1][j]);
                    hexRay[i][j].set(3, hexRay[i+1][j-1]);
                    hexRay[i][j].set(4, hexRay[i][j-1]);
                    hexRay[i][j].set(5, hexRay[i-1][j]);
                }
                if(i==0){
                    if(j==0){
                        hexRay[i][j].set(0, null);
                        hexRay[i][j].set(1, hexRay[i][j+1]);
                        hexRay[i][j].set(2, hexRay[i+1][j]);
                        hexRay[i][j].set(3, null);
                        hexRay[i][j].set(4, null);
                        hexRay[i][j].set(5, null);
                    }
                    else if(j==9){
                        hexRay[i][j].set(0, null);
                        hexRay[i][j].set(1, null);
                        hexRay[i][j].set(2, hexRay[i+1][j]);
                        hexRay[i][j].set(3, hexRay[i+1][j-1]);
                        hexRay[i][j].set(4, hexRay[i][j-1]);
                        hexRay[i][j].set(5, null);
                    }
                    else{
                        hexRay[i][j].set(0, null);
                        hexRay[i][j].set(1, hexRay[i][j+1]);
                        hexRay[i][j].set(2, hexRay[i+1][j]);
                        hexRay[i][j].set(3, hexRay[i+1][j-1]);
                        hexRay[i][j].set(4, hexRay[i][j-1]);
                        hexRay[i][j].set(5, null);
                    }
                }
                if(i==9){
                    if(j==0){
                        hexRay[i][j].set(0, hexRay[i-1][j+1]);
                        hexRay[i][j].set(1, hexRay[i][j+1]);
                        hexRay[i][j].set(2, null);
                        hexRay[i][j].set(3, null);
                        hexRay[i][j].set(4, null);
                        hexRay[i][j].set(5, hexRay[i-1][j]);
                    }
                    else if(j==9){
                        hexRay[i][j].set(0, null);
                        hexRay[i][j].set(1, null);
                        hexRay[i][j].set(2, null);
                        hexRay[i][j].set(3, null);
                        hexRay[i][j].set(4, hexRay[i][j-1]);
                        hexRay[i][j].set(5, hexRay[i-1][j]);
                    }
                    else{
                        hexRay[i][j].set(0, hexRay[i-1][j+1]);
                        hexRay[i][j].set(1, hexRay[i][j+1]);
                        hexRay[i][j].set(2, null);
                        hexRay[i][j].set(3, null);
                        hexRay[i][j].set(4, hexRay[i][j-1]);
                        hexRay[i][j].set(5, hexRay[i-1][j]);
                    }
                }
                if(j==0){
                    //if(i==0 || i==9) break;
                    if(i%2==0){
                        hexRay[i][j].set(0, hexRay[i-1][j+1]);
                        hexRay[i][j].set(1, hexRay[i][j+1]);
                        hexRay[i][j].set(2, hexRay[i+1][j]);
                        hexRay[i][j].set(3, null);
                        hexRay[i][j].set(4, null);
                        hexRay[i][j].set(5, null);
                    }
                    else{
                        hexRay[i][j].set(0, hexRay[i-1][j+1]);
                        hexRay[i][j].set(1, hexRay[i][j+1]);
                        hexRay[i][j].set(2, hexRay[i+1][j]);
                        hexRay[i][j].set(3, hexRay[i+1][j-1]);
                        hexRay[i][j].set(4, null);
                        hexRay[i][j].set(5, hexRay[i-1][j]);
                    }
                }
                if(j==9){
                    //if(i==0 || i==9) break;
                    if(i%2==0){
                        hexRay[i][j].set(0, hexRay[i-1][j+1]);
                        hexRay[i][j].set(1, null);
                        hexRay[i][j].set(2, hexRay[i+1][j]);
                        hexRay[i][j].set(3, hexRay[i+1][j-1]);
                        hexRay[i][j].set(4, hexRay[i][j-1]);
                        hexRay[i][j].set(5, hexRay[i-1][j]);
                    }
                    else{
                        hexRay[i][j].set(0, null);
                        hexRay[i][j].set(1, null);
                        hexRay[i][j].set(2, null);
                        hexRay[i][j].set(3, hexRay[i+1][j-1]);
                        hexRay[i][j].set(4, hexRay[i][j-1]);
                        hexRay[i][j].set(5, hexRay[i-1][j]);
                    }
                }
            }
        }
    }
}
