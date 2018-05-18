import java.io.*;
import java.util.*;
class Vote {  
public static void main(String[] args)throws IOException {  
    int age,ch,i; 
    
    String name;
 	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        party p=new party();
for(i=1;i<=10;i++)
  {
 System.out.println("Enter person "+i+" age and name");
	age=Integer.parseInt(r.readLine());
	name=r.readLine(); 
	if(age>18)
	{
        	System.out.print("hi "+name+" eligible for voting "+age);
                System.out.println("\nEnter your choice\t1.BJP\t2.DMK\t3.ADMK\t4.CON");
                ch=Integer.parseInt(r.readLine());
		
		p.voting(ch);
    	}		
	else
  		System.out.println("not Eligible");
      
   }
p.result();

}  
}  
class party
{
     int b,d,a,c,n;
	void voting(int ch)
	{
	switch(ch)
	{
		case 1:
			System.out.println("BJP");
			b++;
			break;
		case 2:
			System.out.println("DMK");
			d++;
			break;
		case 3:
			System.out.println("ADMK");
			a++;
			break;
		case 4:
			System.out.println("CON");
			c++;
			break;
		default:
			System.out.println("not valid vote");
			n++;
			break;
	
	}
}
        void result()
{
	System.out.println("\nVoting Result\nBJP:\t"+b+"\nDMK:\t"+d+"\nADMK:\t"+a+"\nCON:\t"+c);
	System.out.println("\n"+n+" Members not voted");

}
}
