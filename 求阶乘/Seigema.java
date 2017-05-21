import java.util.Scanner;
public class Seigema{
     public static int fact(int x){
         int result = 1;
         while(x>0){
                result *=x;
                x--;
            }
           return result;
}
public static void main(String[] arg){
Scanner input= new Scanner(System.in);
//int number = input.NextInt();
      System.out.println(fact(8));
}
 }