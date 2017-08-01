import java.io.*;
public class printingStars {
public static void main(String args[])throws IOException
{
	int number,i;
	String s="";
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number");
	number=Integer.parseInt(br.readLine());
	
	while(number>0)
	{
		
		for(i=0;i<number;i++)
		{
			s=s+"*";
		}
		System.out.println(s+" "+s);
		number=number-1;
		s="";
	}
}
}
