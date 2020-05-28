import java.util.*;
class graphintro
{
    void addme(ArrayList<ArrayList<Integer>> am,int u,int v)
    {
        am.get(u).add(v);
        am.get(v).add(u);

    }
    void printlist(ArrayList<ArrayList<Integer>> am)
    {
        for(int i=0;i<am.size();i++)
        {
            System.out.print("vertex "+(i));
            for(int j=0;j<am.get(i).size();j++)
            {
                System.out.print("-->"+am.get(i).get(j));
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        graphintro obj=new graphintro();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<ArrayList<Integer>> li=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)
        {
            li.add(new ArrayList<Integer>());
        }
        for(int i=0;i<m;i++)
        {
            int u=sc.nextInt();
            int v=sc.nextInt();
            obj.addme(li,u-1,v-1);
        }
        obj.printlist(li);
    }
}