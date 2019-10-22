import java.util.Scanner;
public class MiniProject{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    write("Welcome to Mega Star Printer X3000");
    // the play == true is not necessary, but I needed to have some sort of
    // while loop since I'm using the break method to end it
    boolean play = true;
    while (play == true){

      // the following commented code is what I originally had to repeatedly
      // ask the user if they would like to play before I decided to make the
      // user type quit to end the program
      /*System.out.println("Would you like to print some thingies?");
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
      if (answer.equals("yes") || answer.equals("yeah")){
        System.out.println("ok!");
      } else{
        System.out.println("aight");
        break;
      }*/

      // the following code is checking the user's input. it starts as a string
      boolean integerValid = false;
      String integerInput = "";

      // while loop to have the user retry until they input a valid number
      while (integerValid == false){
        write("1 2 3 4 or 5. To quit, enter \"quit\"");
        integerInput = scan.nextLine();

        // if the input string is equal to quit, it breaks the current while
        // loop that checks number validity, but also falsifies the play
        // boolean so the program knows to use the break method a second time
        // (because the initial check is in a nested while loop)
        if (integerInput.toLowerCase().equals("quit")){
          play = false;
          break;
        }

        // checks if each inidividual digit is 1-5. if not, breaks only the
        // first while loop and the program restarts to prompt the user
        for (int i=0; i<integerInput.length(); i++){
          if (integerInput.codePointAt(i)<49 || integerInput.codePointAt(i)>53){
            write("error: must be an integer 1-5. To quit, enter \"quit\"");
            break;

          // a valid number will declare true validity and run the print loop
          } else if(i == integerInput.length()-1){
            integerValid = true;
          }
        }
      }
      if (play == false){
        break;
      }

      // runs this loop for every digit the user inputted, checking each and
      // printing the correct star pattern
      for (int i = 0; i < integerInput.length(); i++){
        if (integerInput.charAt(i) == '1'){
          print1();
        } else if (integerInput.charAt(i) == '2'){
          print2();
        } else if (integerInput.charAt(i) == '3'){
          print3();
        } else if (integerInput.charAt(i) == '4'){
          print4();
        } else if (integerInput.charAt(i) == '5'){
          print5();
        }
      }
      write("");
    }

    // when the big boy loop is broken, it says bye
    write("");
    write("Goodbye! *bedoop*");
  }

// star print functions
  static void print1(){
    for (int i = 9; i > 0; i--){
      System.out.println();
      for (int j = i; j > 0; j--){
        System.out.print("*");
      }
    }
  }
  static void print2(){
    for (int i = 0; i < 9; i++){
      System.out.println();
      int spaces = 8 - i;
      for (int j = 0; j < spaces; j++){
        System.out.print(" ");
      }
      for (int k = 0; k < 9 - spaces; k++){
        System.out.print("*");
      }
    }
  }
  static void print3(){
    for (int i = 9; i > 0; i--){
      System.out.println();
      int spaces = 9 - i;
      for (int j = 0; j < spaces; j++){
        System.out.print(" ");
      }
      for (int k = i; k > 0; k--){
        System.out.print("*");
      }
    }
  }

  // I did each half of the 4th and 5th pattern so I wouldn't have to repeat
  // unnecessary code in my method creations
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
  static void print4(){
    printIsoUp();
    printIsoDown();
  }
  static void print5(){
    printIsoDown();
    printIsoUp();
  }
  static void write(String str){
    System.out.println(str);
  }
}
