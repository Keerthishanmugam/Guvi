import java.io.*;
import java.util.*;
public class LongestString {
public static void main(String args[])throws IOException
{
	String word,str="";
	int i;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the word");
	word=br.readLine();
	List<Character>list=new ArrayList<Character>();
	for(i=0;i<word.length();i++)
	{
		list.add(word.charAt(i));
	}
	Collections.sort(list);
	Collections.reverse(list);
	for(char a:list)
	{
		str=str+a;
	}
	
		System.out.println(str);
}
}
