/**
 * Created by aime1 on 9/9/18.
 */
public class HelloWorld {
    public static void main(String[] args){
        //System.out.println("Hello World");
        for(int row = 0; row < 6; row++){
            for(int col = 0; col < 30; col ++){
                if(col >= 0 && col < 10) {
                    System.out.print("b");
                } else if(col >= 10 && col < 20){
                    System.out.print("w");
                } else {
                    System.out.print("r");
                }
            }
            System.out.println();// jump to next row
        }
    }
}
