import java.util.Scanner;
public class Multiples{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
   int multiple = scan.nextInt();
   int limit = scan.nextInt();
   for (int i = 1; i <= limit/multiple; i++){
     System.out.println(multiple*i);
   }
  }
}
