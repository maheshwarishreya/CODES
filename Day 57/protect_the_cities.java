import java.util.*;
class protect_the_cities
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int n=sc.nextInt();
            List<Long> l1=new ArrayList<Long>();
            List<Long> l2=new ArrayList<Long>();
             for(int i=0;i<n;i++)
            {
                l1.add(sc.nextLong());
                l2.add(sc.nextLong());
            }
            long min=Collections.min(l1);
            long max=Collections.max(l1);
            long min2=Collections.min(l2);
            long max2=Collections.max(l2);
            long n1=(Math.abs(max-min));
            long n2=(Math.abs(max2-min2));
            if(n2>n1)
            {
                System.out.println(n2*n2);
            }
            else
            {
                System.out.println(n1*n1);
            }
            t--;     
        }
    }
}