import java.util.*;
public class Main{
    public static void main(String [] args)
    {
        int sum2=0;
        int max =0;
        int sum=0;
        int[][] arr = new int[3][4];
        System.out.println("Enter " + arr.length + " the integer value:");
        Scanner input = new Scanner(System.in);
        for (int i = 0;i<arr.length ; i++){
        for (int j = 0;j<arr[i].length ; j++)
        {
            arr[i][j]=input.nextInt();
        }
        }
        
        for(int i = 0;i< arr.length;i++){
            
        
        System.out.println("Array:" + Arrays.toString(arr[i]));
        }
        for(int i = 0;i<arr.length ; i++){
        for (int j = 0;j<arr[i].length ; j++)
        {
            sum+=arr[i][j];
        }
        }
        System.out.println("The summation of Array is:" + sum);
         for(int i = 0; i < arr.length ; i++){
          for (int j = 0;j<arr[i].length ; j++)
        {
            if(arr[i][j]> max)
            {
                max=arr[i][j];
            }
        }
        }
         System.out.println("The max of Array is:" +max);
         
          
        for (int j = 0;j<arr[1].length ; j++)
        {
            sum2+=arr[1][j];
        }
        
        System.out.println("The summation of 2nd row Array is:" + sum2);
    }
}
