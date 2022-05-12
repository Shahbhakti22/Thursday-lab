import java.util.Scanner;
public class counteven {
        public static void main (String args[])
        {
            Scanner sc=new Scanner(System.in);

            int num;
            int countpositive=0;
            int countnegative=0;
            int countzero=0;

            char choice;

            do
            {
                System.out.println("enter the number");
                num=sc.nextInt();
                if (num>0)
                {
                    countpositive++;
                }
                else if (num<0)
                {
                    countnegative++;
                }
                else
                {
                    countzero++;
                }
                System.out.println("Do you want to continue y/n?");

                choice=sc.next().charAt(0);

            }while (choice=='y'||choice=='Y');
            System.out.println("positive number:"+countpositive);
            System.out.println("negative number:"+countnegative);
            System.out.println("zero number:"+countzero);
        }
    }


