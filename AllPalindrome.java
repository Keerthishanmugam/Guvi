import java.io.*;
import java.util.*;
public class AllPalindrome {
public static void main(String args[])throws IOException
{
	String word,combination,reverse;
	int i,j;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	List<String>list=new ArrayList<String>();
	System.out.println("Enter the word");
	word=br.readLine();
	
	for(i=0;i<word.length();i++)
	{
		for(j=i+1;j<word.length()-i;j++)
		{
		
		combination=word.substring(i,j+1);
		StringBuffer b=new StringBuffer(combination);
		reverse=b.reverse().toString();
		if(combination.equals(reverse))
		{
			list.add(combination);
		
		}
	  }
	}
	for(String str:list)
	{
		System.out.println(str);
	}
}
}
