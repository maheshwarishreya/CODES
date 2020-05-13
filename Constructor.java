
 class Constructor{
	int id;
	String name;
	double marks;
	Constructor(int ii,String st,double m)
	{
		id=ii;
	    name=st;
	}	
	marks=m;
 void display()
 {
	 System.out.println(id+"  "+name+" "+marks);
 }
 public static void main(String args[])
 {
	 Constructor ob=new Constructor(10,"shreya",20.9);
	 ob.display();
 }
}
 