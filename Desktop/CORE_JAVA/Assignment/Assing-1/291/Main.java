import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("....2-D Array....");
    System.out.println("Enter Number of Rows : ");
    int r = s.nextInt();
    int arr[][] = new int[r][];
    for(int i=0; i<arr.length; i++)   {
        System.out.println("Enter Number of Columns : ");    
        int c = s.nextInt();
         arr[i] = new int[c];
        for(int j=0; j<arr[i].length; j++)   {
            System.out.println("Enter Number : ");
            arr[i][j] = s.nextInt();
        }
    }
    
    for(int x[] : arr)    {
        for(int y : x)  {
          System.out.println(y + " ");  
        }    
        System.out.println();
    }
    
    }
    
}