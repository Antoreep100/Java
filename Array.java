
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        int[] numbers=new int[7];
        int [] num1={3,5,8,9,4};
        Arrays.sort(num1);
        numbers[0]=2;
        numbers[3]=8;
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(num1));
    }
}
