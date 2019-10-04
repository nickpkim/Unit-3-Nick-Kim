import java.util.Scanner;
public class DrinkAndDrive{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("how old r u?");
    int age = scan.nextInt();
    if (age>=17 && age<21)
      System.out.println("can drive, no drinking");
    else if (age>=21)
      System.out.println("can drive, drink after");
    else
      System.out.println("no driving nor drinking");
  }
}
