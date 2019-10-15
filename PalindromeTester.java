import java.util.Scanner;
public class PalindromeTester{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    input = input.toLowerCase();
    int length = input.length();
    System.out.println(input+" "+length);
    for (int count=0; count<length; count++){
      if (input.codePointAt(count)<97 || input.codePointAt(count)>122){
        String toRemove = input.substring(count,count+1);
        input = input.replace(toRemove,"");
        count = 0;
        length = input.length();
      }
    }
    System.out.println(input);
    boolean palindrome = false;
    char left = input.charAt(0);
    char right = input.charAt(length-1);
    int leftIndex = 0;
    int rightIndex = length-1;
    while (leftIndex>rightIndex){
      
    }
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
