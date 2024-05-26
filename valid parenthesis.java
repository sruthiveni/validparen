package mmmmm;
import java.util.*;
public class Validparanthesis {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		while(true)
		{
			if(s1.contains("()"))
				s1=s1.replace("()","");
			else if(s1.contains("{}"))
				s1=s1.replace("{}","");
			else if(s1.contains("[]"))
				s1=s1.replace("[]","");
			else 
				break;
		}
		if(s1.isEmpty())
		{
			System.out.print("valid");
		}
		else
		{
			System.out.print("Invalid");
		}
		
	}
}
