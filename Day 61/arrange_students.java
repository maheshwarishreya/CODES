import java.util.*;
class arrange_students
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int n=sc.nextInt();
            int b[]=new int[n];
            int g[]=new int[n];
            for(int i=0;i<n;i++)
            {
              b[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                g[i]=sc.nextInt();
            }
            int arr[]=new int[n*2];
            Arrays.sort(b);
            Arrays.sort(g);
            for(int i=0;i<n*2;i++)
            {
                
                if(i<=(n-1))
                {
                    arr[i]=b[i];
                }
                else
                {
                    arr[i]=g[i-n];
                }
            }
            Arrays.sort(arr);
            int arr2[]=new int[n*2];
            int arr3[]=new int[n*2];
            int c1=0;
            int c2=0;
            for(int i=0;i<n;i++)
            {
                arr2[c1++]=b[i];
                arr2[c1++]=g[i];
                arr3[c2++]=g[i];
                arr3[c2++]=b[i];    
            }
            if(Arrays.equals(arr,arr2)==true || Arrays.equals(arr,arr3)==true)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            t--;
        }
    }
}