import java.util.Scanner;
public class Perfect
{
    public static void main(String[] args) 
    {
        int n, sum = 0; // initializing
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer you want to check:");
        n = s.nextInt(); 
        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i; //adding the factors
            }
        }
        if(sum == n)
        {
            System.out.println("Given number is Perfect");
        }
        else
        {
            System.out.println("Given number is not Perfect");
        }    
    }
}