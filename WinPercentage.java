import java.util.Scanner;
import java.text.DecimalFormat;
public class WinPercentage{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    DecimalFormat fmt = new DecimalFormat("0.0");
    //int totalGames = -69;
    //int totalWins = -69;
  //  String throwAway = new String();
    /*
    System.out.println("# of games played");
    while (totalGames == -69){
      if (scan.nextInt()>=1 && scan.hasNextInt()){
          totalGames = scan.nextInt();
      } else{
        throwAway = scan.next();
        System.out.println("error: must be a non-decimal integer");
      }
    }
    while (totalWins == -69){
      System.out.println("# of games won");
      if (scan.nextInt()>=1 || !scan.hasNextInt()){
          totalWins = scan.nextInt();
      } else{
        throwAway = scan.next();
        System.out.println("error: must be a non-decimal integer");
      }
    }
    */
    System.out.println("Win Percentage Calculator");
    System.out.println();
    double totalGames = 0;
    boolean valid = false;
    System.out.println("# of games played");
    while (valid == false){
      totalGames = scan.nextDouble();
      if (totalGames%1 != 0){
        System.out.println("error: must be a non-decimal integer");
      }  else if (totalGames<1){
        System.out.println("error: # of games played must be greater than zero");
      } else{
        valid = true;
      }
    }
    double totalWins = 0;
    valid = false;
    System.out.println("# of games won");
    while (valid == false){
      totalWins = scan.nextDouble();
      if (totalWins%1 != 0){
        System.out.println("error: must be a non-decimal integer");
      } else if (totalWins<0){
        System.out.println("error: # of games played must be greater than or equal to zero");
      } else{
        valid = true;
      }
    }

    while ((totalGames<1) || (totalWins<0) || (totalWins>totalGames)){
      if (totalGames<1)
        System.out.println("# of games played must be greater than zero");
      else if (totalWins<0)
        System.out.println("# of games won must be greater than or equal to zero");
      else if (totalGames<totalWins)
        System.out.println("# of games won must be less than # of games played");
      System.out.println();
      System.out.println("# of games played");
      totalGames = scan.nextInt();
      System.out.println("# of games won");
      totalWins = scan.nextInt();
    }
    double winPercentage = totalWins*100.0/totalGames;
    System.out.println();
    System.out.println("Your win percentage is: "+fmt.format(winPercentage)+"%");
  }
}
