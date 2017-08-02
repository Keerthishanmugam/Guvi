import java.io.*;
import java.util.*;
public class LongestPalindrome {
public static void main(String args[])throws IOException
{
	String word,combination,reverse;
	int i,j;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	List<String>list=new ArrayList<String>();
	Map<Integer,String>m=new TreeMap<Integer,String>();
	System.out.println("Enter the word");
	word=br.readLine();
	
	for(i=0;i<word.length();i++)
	{
		for(j=i+1;j<word.length();j++)
		{
		
		combination=word.substring(i,j+1);
		StringBuffer b=new StringBuffer(combination);
		reverse=b.reverse().toString();
		if(combination.equals(reverse))
		{
			list.add(combination);
			m.put(combination.length(),combination);
		
		}
	  }
	}
	Map<Integer,String>sorted=new TreeMap<Integer,String>(Collections.reverseOrder());
	sorted.putAll(m);
	System.out.println(sorted.get(((TreeMap<Integer, String>) sorted).firstKey()));
}
}
