import java.util.Scanner;
public class PalindromeTester{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    boolean run = true;
    while (run == true){
      System.out.println();
      System.out.println("Would you like to check a palindrome? (y/n)");
      if (scan.nextLine().equals("y")){
        run = true;
      } else if (scan.nextLine().equals("n")){
        run = false;
        break;
      }
      System.out.println("What is your palindrome?");
      String input = scan.nextLine();
      input = input.toLowerCase();
      int length = input.length();
      for (int count=0; count<length; count++){
        if (input.codePointAt(count)<97 || input.codePointAt(count)>122){
          String toRemove = input.substring(count,count+1);
          input = input.replace(toRemove,"");
          count = 0;
          length = input.length();
        }
      }
      boolean palindrome = false;
      int leftIndex = 0;
      int rightIndex = length-1;
      while (leftIndex<rightIndex){
        String left = input.charAt(leftIndex) + "";
        String right = input.charAt(rightIndex) + "";
        if (left.compareTo(right) == 0){
          palindrome = true;
        } else{
          palindrome = false;
          break;
        }
        leftIndex++;
        rightIndex--;
      }
      if (palindrome == false){
        System.out.println("Not a palindrome");
      } else if (palindrome == true){
        System.out.println("A palindrome!");
      }
    }
    System.out.println();
    System.out.println("Goodbye! *boodwap*");

    /*
    if (input.length()%2 != 0){
      char mid = input.charAt((int)(input.length()/2));
      input = input.replace(Character.toString(mid),"");
    }
    input = input.substring(0,input.length()/2);
    System.out.print(input);
    */
  }
}
