
import java.util.*;
class TestClass
{
   static int GCD(int a,int b)
    {
        if(a==0)
        return b;
        else 
        return GCD(b%a,a);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TestClass obj=new TestClass();
        int a=n-2;
        int flag=0;
        while(a!=0)
        {
            int res=GCD(a,n);
            if(res==1)
            {
                flag=1;
                break;
            }
            a--;
        }
        if(flag==1)
        {
            System.out.println(a);
        }
    }
}