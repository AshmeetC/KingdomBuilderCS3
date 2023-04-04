import java.io.*;
import java.util.*;
public class Sub {
    Hex cornerTopLeft;
    Hex[][] hexRay;
    BufferedReader b1 = new BufferedReader(new FileReader("board1.txt"));
    public Sub(Hex ctl) throws FileNotFoundException {
        cornerTopLeft = ctl;
        hexRay = new Hex[10][10];
        toMatrix();
    }
    public Sub(String[][] x) throws FileNotFoundException {
        toHexRay(x);
    }
    public Sub(String usethisone) throws IOException {
        hexRay= new Hex[10][10];
        //fr = new FileReader(f);
        String[][] things = new String[10][10];
        for(int i =0; i<10; i++){
                String[] temp = b1.readLine().split(" ");
            for(int j = 0; j<10; j++){
                things[i][j]= temp[j];
            }
        }
        for(int i = 0; i<10; i++){
            for(int j =0; j<10; j++){
                System.out.print(things[i][j] + " ");
            }
            System.out.println();
        }        toHexRay(things);
        System.out.println("");
        System.out.println(hexRay[0][0].toString());
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
                    if(i%2==0){
                        hexRay[i][j].set(0, hexRay[i-1][j]);
                        hexRay[i][j].set(1, hexRay[i][j+1]);
                        hexRay[i][j].set(2, hexRay[i+1][j]);
                        hexRay[i][j].set(3, hexRay[i+1][j-1]);
                        hexRay[i][j].set(4, hexRay[i][j-1]);
                        hexRay[i][j].set(5, hexRay[i-1][j-1]);
                    }
                    else{
                        hexRay[i][j].set(0, hexRay[i-1][j+1]);
                        hexRay[i][j].set(1, hexRay[i][j+1]);
                        hexRay[i][j].set(2, hexRay[i+1][j+1]);
                        hexRay[i][j].set(3, hexRay[i+1][j]);
                        hexRay[i][j].set(4, hexRay[i][j-1]);
                        hexRay[i][j].set(5, hexRay[i-1][j]);
                    }
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
                    if(i!=0 && i!=9){
                        if(i%2==0){
                            hexRay[i][j].set(0, hexRay[i-1][j]);
                            hexRay[i][j].set(1, hexRay[i][j+1]);
                            hexRay[i][j].set(2, hexRay[i+1][j]);
                            hexRay[i][j].set(3, null);
                            hexRay[i][j].set(4, null);
                            hexRay[i][j].set(5, null);
                        }
                        else{
                            hexRay[i][j].set(0, hexRay[i-1][j+1]);
                            hexRay[i][j].set(1, hexRay[i][j+1]);
                            hexRay[i][j].set(2, hexRay[i+1][j+1]);
                            hexRay[i][j].set(3, hexRay[i+1][j]);
                            hexRay[i][j].set(4, null);
                            hexRay[i][j].set(5, hexRay[i-1][j]);
                        }
                    }
                }
                if(j==9){
                    if(i!=0 && i!=9){
                        if(i%2==0){
                            hexRay[i][j].set(0, hexRay[i-1][j]);
                            hexRay[i][j].set(1, null);
                            hexRay[i][j].set(2, hexRay[i+1][j]);
                            hexRay[i][j].set(3, hexRay[i+1][j-1]);
                            hexRay[i][j].set(4, hexRay[i][j-1]);
                            hexRay[i][j].set(5, hexRay[i-1][j-1]);
                        }
                        else{
                            hexRay[i][j].set(0, null);
                            hexRay[i][j].set(1, null);
                            hexRay[i][j].set(2, null);
                            hexRay[i][j].set(3, hexRay[i+1][j]);
                            hexRay[i][j].set(4, hexRay[i][j-1]);
                            hexRay[i][j].set(5, hexRay[i-1][j]);
                        }
                    }
                }
            }
        }
    }
}
