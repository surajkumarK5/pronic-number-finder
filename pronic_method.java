import java.util.Scanner;
class PronicMethod
 {
    void pronic(int n) 
    {
        boolean ispronic = false;

        for (int i = 0; i * (i + 1) <= n; i++)
         {
            if (i * (i + 1) == n) 
            {
                ispronic = true;
                break;
            }
        }

        if (ispronic) 
        {
            System.out.println(n + " is a pronic number.");
        } else 
        {
            System.out.println(n + " is not a pronic number.");
        }
    }

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        PronicMethod obj = new PronicMethod();   // Corrected object creation
        obj.pronic(n);     // Pass the number to the method
    }
}
