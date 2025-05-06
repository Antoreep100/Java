import java.util.*;
public class Main {
public static void main (String[] args) 
    {
       int[] value =new int[5] ;
       Scanner input =new Scanner(System.in);
       System.out.println("Enter the number");
       for(int i =0;i<value.length;i++)
       {
           value[i]=input.nextInt();
       }
       System.out.println("You Entered:");  
       for(int values :value)
       {
          System.out.print(values + " ");  
       }
    }
}
