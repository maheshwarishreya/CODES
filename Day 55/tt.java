import java.util.*;
 class tt
 {
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 int arr2[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
			arr[i]=sc.nextInt();
			arr2[i]=sc.nextInt();
		 }
		 Arrays.sort(arr);
		 Arrays.sort(arr2);
		 int sum=0;
		 for(int i=0;i<n;i++)
		 {
			sum=sum+(Math.abs(arr2[i]-arr[i]));
		 }
		 System.out.println(sum);
	 }
 }