import java.util.Scanner;
public class DrinkingAge{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("how old r u?");
    int age = scan.nextInt();
    if (age>=21)
      System.out.println("waste urself");
    else
      System.out.println("no drinking 4 u");
  }
}
