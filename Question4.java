import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    String star = "*";
    for(int i = a;
    i >0;
    i--) {
      String temp = "";
      int tempnum = i;
      for(int x = tempnum;
      x>0;
      x--){
        temp+=star;
      }
      System.out.println(temp);
    }
    in.close();
    
  }
}
