import java.util.*;
public class testing {
    boolean isprime(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
            if(count==2)
            {
                return true;
            }
            else 
            {
                return false;
            }
       
    }
    public static void main(String args[])
    {
        testing obj=new testing();
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int x=sc.nextInt();
   int i=s.indexOf(':');
   int h=Integer.parseInt(s.substring(0,i));
   int m=Integer.parseInt(s.substring(i+1));

   if((h+m)%x==0)
   {
       System.out.println("0");
   }
   else if(obj.isprime(h+m)==true)
   {  
       if(x>(h+m))
       {
           System.out.println("-1");
       } 
   }
   
   else
   {
       int count=0;
       while(x<(h+m))
       {
           m++;
           count++;
           if(m==60)
           {
               m=0;
               h++;
           }
           if((h+m)%x==0)
           { 
               System.out.println(count);
               break;
           }
           
       }
   }

}
    
}