import java.util.Scanner;
public class MiniProject{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to Mega Star Printer X3000");
    System.out.println("Would you like to print some thingies?");
    String answer = scan.nextLine().toLowerCase();
    int length = answer.length();
    for (int count=0; count<length; count++){
      if (answer.codePointAt(count)<97 || answer.codePointAt(count)>122){
        String toRemove = answer.substring(count,count+1);
        answer = answer.replace(toRemove,"");
        count = 0;
        length = answer.length();
      }
    }
    boolean play = false;
    if (answer.equals("yes") || answer.equals("yeah")){
      play = true;
      System.out.println("ok!");
    }
    boolean integerValid = false;
    String integerInput = "";
    while (integerValid == false){
      System.out.println("1 2 3 4 or 5");
      integerInput = scan.nextLine();
      for (int i=0; i<integerInput.length(); i++){
        if (integerInput.codePointAt(i)<49 || integerInput.codePointAt(i)>53){
          System.out.println("error: must be an integer 1-5");
          break;
        } else if(i == integerInput.length()-1){
          integerValid = true;
        }
      }
    }
    int integer = Integer.parseInt(integerInput);
    if (integer == 1){
      print1();
    }
    if (integer == 2){
      print2();
    }
    if (integer == 3){
      print3();
    }
    if (integer == 4){
      printIsoUp();
      printIsoDown();
    }
    if (integer == 5){
      printIsoDown();
      printIsoUp();
    }
  }
  static void print1(){
    for (int i = 10; i > 0; i--){
      System.out.println();
      for (int j = i; j > 0; j--){
        System.out.print("*");
      }
    }
  }
  static void print2(){
    for (int i = 0; i < 10; i++){
      System.out.println();
      int spaces = 9 - i;
      for (int j = 0; j < spaces; j++){
        System.out.print(" ");
      }
      for (int k = 0; k < 10 - spaces; k++){
        System.out.print("*");
      }
    }
  }
  static void print3(){
    for (int i = 10; i > 0; i--){
      System.out.println();
      int spaces = 10 - i;
      for (int j = 0; j < spaces; j++){
        System.out.print(" ");
      }
      for (int k = i; k > 0; k--){
        System.out.print("*");
      }
    }
  }
  static void printIsoUp(){
    for (int i = 0; i < 5; i++){
      System.out.println();
      int spaces = 4 - i;
      for (int j = 0; j < spaces; j++){
        System.out.print(" ");
      }
      int stars = (2 * i) + 1;
      for (int k = 0; k < stars; k++){
        System.out.print("*");
      }
      for (int l = 0; l < spaces; l++){
        System.out.print(" ");
      }
    }
  }
  static void printIsoDown(){
    for (int i = 5; i > 0; i--){
      System.out.println();
      int spaces = 5 - i;
      for (int j = 0; j < spaces; j++){
        System.out.print(" ");
      }
      int stars = (2 * i) - 1;
      for (int k = 0; k < stars; k++){
        System.out.print("*");
      }
      for (int l = 0; l < spaces; l++){
        System.out.print(" ");
      }
    }
  }
}
