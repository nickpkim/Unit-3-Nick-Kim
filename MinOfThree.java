import java.util.Scanner;
public class MinOfThree{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("I require three numbers of the whole:");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();
    if (num1<=num2 && num1<=num3){
      int minNum = num1;
    } else if (num2<=num1 && num2<=num3){
      int minNum = num2;
    } else if (num3<=num2 && num3<=num1){
      int minNum = num3;
    }
    System.out.println("The smallest numeral of the whole provided is "+".");
  }
}
