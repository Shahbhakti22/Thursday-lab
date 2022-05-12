import java.util.Scanner;

public class sumevenodd {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);

        int count;
        int i=0;
        int sumodd=0;
        int sumeven=0;

        System.out.println("Enter a number:");
        int num=sc.nextInt();

        for (int i=num;i !=0; i=i)
        {
            if (i%2==0)
                sumeven=sumeven + i;
            else
                sumodd=sumodd+i;
            i= sc.nextInt();
        }
        System.out.println("even number:"+sumeven);
        System.out.println("odd number:"+sumodd);
    }
}
