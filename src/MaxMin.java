import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static int Max(int [] array)
    {
        Arrays.sort(array);
        return array[array.length-1];
    }
    public static int Min(int [] array)
    {
        Arrays.sort(array);
        if(array[0]<0) {
            for(int i = 0; i < array.length; i++)
            {
                if(array[i]>=0)
                {
                    return array[i];
                }
            }
        }

        return array[0];
    }

    public static void main(String[] args) {
        System.out.println("Enter the size : ");
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int[] Array=new int[size];
        System.out.println("Enter the Elements : ");
        for(int i=0;i<size;i++)
        {
            Array[i]=scan.nextInt();
        }
        System.out.println("The Maximum Element is  : "+Max(Array));
        System.out.println("The Minimum Element is  : "+Min(Array));
    }
}
