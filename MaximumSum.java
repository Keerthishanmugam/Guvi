import java.io.*;
import java.util.Arrays;
public class MaximumSum {
public static void main(String args[])throws IOException
{
	int number,i,sum=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number of elements in the array");
	number=Integer.parseInt(br.readLine());
	if(number>3)
	{
		System.out.println("Enter the elements");
	int[] values=new int[number];
	for(i=0;i<number;i++)
	{
	 values[i]=Integer.parseInt(br.readLine());
	}
	Arrays.sort(values);
	for(i=number;i>number-3;i--)
	{
	sum=sum+values[i-1];
	}
	System.out.println(sum);
	}
	else
	{
		System.out.println("Enter a number greater than 3");
	}
}
}
