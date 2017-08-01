import java.io.*;
import java.util.*;
import java.lang.*;
public class DuplicateRemover{
  public static void main(String args[])throws IOException
  {  
    String ans="";
    int i=0;
    char ch;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the word");
    String s=br.readLine();
    for(i=0;i<s.length();i++)
    {
      ch=s.charAt(i);
      if (ch!=' ')
      { 
        ans=ans+ch;
        s=s.replace(ch,' ');
      }
    }
    System.out.println(ans);
  }
}
