import java.util.*;
class letters
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            String s=sc.next();
                List<Character> li=new ArrayList<Character>();
                for(int i=0;i<s.length()-1;i++)
                {
                    if(s.charAt(i)!=s.charAt(i+1))
                    {
                        li.add(s.charAt(i));
                    }
                }
                if(li.size()==0)
                {
                    System.out.println(s.charAt(s.length()-1));
                }
                else 
                {
                        if(s.charAt((s.length())-1)!=li.get(li.size()-1))
                            {
                                li.add(s.charAt(s.length()-1));
                            }
                            int l=li.size();
                            for(int i=0;i<l;i++)
                            {
                                System.out.print(li.get(i));
                            }
                            System.out.println();
                        
                }
            t--;
        }
    }
}