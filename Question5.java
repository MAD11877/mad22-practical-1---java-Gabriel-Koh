import java.util.Scanner;
import java.util.Arrays;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int len = in.nextInt();
    int[] list = new int[len];
    for (int i = 0;
    i < len;
    i++){
      int temp = in.nextInt();
      list[i] = temp;
    }
    
    Arrays.sort(list);
    
    int count1 = 0;
    int count2 = 0;
    int tempvar =0;
    int mode =0;
    
    for (int x = 0;
     x < len; 
     x++){
            tempvar = list[x];
            count1 = 1;
        
        for (int y = x + 1; 
        y < len; 
        y++){
            if (tempvar == list[y]) count1++;
        }
        
        if (count1 > count2)
        {
                mode = tempvar;
                count2 = count1;
        }
        
        else if(count1 == count2)
        {
            mode = Math.min(mode, tempvar);
        }
    }
    System.out.println(mode);
    in.close();
  }
}
