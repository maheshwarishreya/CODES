import java.util.*;
class Cats
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.nextInt();
            c[i]=sc.nextInt();
        }
        Arrays.sort(s);
        Arrays.sort(c);
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+s[i]*c[i];
        }
        System.out.println(sum);

    }
}