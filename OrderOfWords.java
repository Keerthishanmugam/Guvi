import java.io.*;
public class OrderOfWords {
public static void main(String args[])throws IOException
{
	String word;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the line");
	word=br.readLine();
	String[] words=word.split(" ");
	if(words.length<2||words.length>2)
	{
		System.out.println("Enter the line with two words");
	}
	else
	{
   System.out.println(words[1]+" "+words[0]);
	}
}
}
