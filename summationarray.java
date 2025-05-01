import java.util.*;
public class Main{
    public static void main(String [] args)
    {
        int sum=0;
        int[] arr = new int[5];
        System.out.println("Enter " + arr.length + " the integer value:");
        Scanner input = new Scanner(System.in);
        for (int i = 0;i<arr.length ; i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("Array:" + Arrays.toString(arr));
        for(int i = 0;i<arr.length ; i++)
        {
            sum+=arr[i];
        }
        System.out.println("The summation of Array is:" + sum);
    }
}
