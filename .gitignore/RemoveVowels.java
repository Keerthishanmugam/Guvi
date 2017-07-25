import java.io.*;
public class RemoveVowels {
public static void main(String args[])throws IOException
{
	String word;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the word");
	word=br.readLine();
	StringBuffer b=new StringBuffer(word);
	word=b.reverse().toString();
	word=word.replaceAll("[aeiou]", "");
	System.out.println(word);
}
}
