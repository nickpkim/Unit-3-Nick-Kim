import java.util.Scanner;
public class Temperature{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("what's the temp?");
    int temp = scan.nextInt();
    if (temp>83)
      System.out.println("hot");
    else if (temp>=68)
      System.out.println("ideal");
    else if (temp>=45)
      System.out.println("cool");
    else
      System.out.println("cold");
  }
}
