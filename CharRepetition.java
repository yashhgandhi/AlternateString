import java.util.*;
import java.lang.*;
public class CharRepetition {
public static void main(String args[])
{
	int count=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	Vector<Character> v = new Vector<Character>();
	String s = sc.nextLine();
	for(int i=0;i<s.length()-1;i++)
	{
		int x = Math.abs(s.charAt(i)-s.charAt(i+1));
		if(x==1)
		{
			v.addElement(s.charAt(i));
			v.addElement(s.charAt(i+1));
			
		}
	}
	if(v.size()==0)
	{
		System.out.println(0);
	}
	//System.out.println("before "+v.size());
//	v.remove(0);
//	System.out.println("after "+v.size());
	else
	{
		for(int j=0;j<v.size()-1;j++)
		{
			if(v.get(j)==v.get(j+1))
			{
				v.remove(j-1);
				v.remove(j);
				v.remove(j+1);
				v.remove(j+2);
			}
		}
	}

}
}
