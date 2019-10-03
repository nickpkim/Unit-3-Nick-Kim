import java.util.Scanner;
public class DrinkingAge{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int age = scan.nextInt();
    if (age>=17 && age<21)
      System.out.println("can drive, no drinking");
    else if (age>=21)
      System.out.println("can drive, drink after");
    else
      System.out.println("no driving nor drinking");
  }
}
