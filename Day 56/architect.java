import java.util.*;
import java.io.*;
public class architect {
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int w=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
        Arrays.sort(a);
        int max=1;
        int sum=0,j=n-1;
        
        for(int i=n-1;i>0;i--)
        {
            
            while(j>=0)
            {
                sum+=a[i]-a[j];
                if(sum>w)
                {
                    int temp=i-j;
                    if(temp>max)
                        max=temp;
                    sum-=a[i]-a[j];
                    sum-=(temp-1)*(a[i]-a[i-1]);
                    break;
                }
                j--;
                
            }
            if(j==-1 && sum<=w)
            {
                max=Math.max(max,i+1);
            }
        }
        System.out.println(max);
	
		
}
}