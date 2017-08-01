import java.io.*;
public class DoubleString {
public static void main(String args[])throws IOException
{
	String word,first,second;
	int l;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the word");
	word=br.readLine();
	l=word.length();
	if(l%2==0)
	{
	  first=word.substring(0,l/2);
	  second=word.substring(l/2,l);
	}
	else
	{
		 first=word.substring(0,l/2);
		  second=word.substring(l/2+1,l);	
	}
	
	if(first.equalsIgnoreCase(second))
	{
		System.out.println("It is a Double String");
	}
	else
	{
		System.out.println("Not Double String");
	}
}
}
