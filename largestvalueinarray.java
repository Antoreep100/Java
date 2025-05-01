import java.util.*;
public class Main{
    public static void main(String[] args)
    {
     int max = 0;
       //Random rand = new Random();
        int [] myList = new int[5];
        Scanner input = new Scanner(System.in);
         System.out.println("Enter " + myList.length +" integer value: ");
       
       
 
        for (int i =0;i<myList.length;i++)
        {
  
    myList[i] = input.nextInt();
        }
         System.out.println("Array: " + Arrays.toString(myList));
            for (int i = 0; i < myList.length; i++){
                
            
         if(myList[i] > max)
         {
             max=myList[i];
         }
            }
         System.out.println("The maximum number is: " + max);
    }
}
