import java.util.Scanner;
/*
 * 
 */
/**
 * @version 1
 * @Name Army parade
 * @author Cesar Almeciga
 */

public class Army
{
	public static void main(String[] args)//main class
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int arr[][]=new int[k][2];
		for(int i=0;i<k;i++)
		{
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		int max = n > m ? n : m;
		long mod=(long)(2*Math.pow(10,9)+33);
		
		long diff=(n*m-k)%mod;
		long answer=(max*diff)%mod;
		System.out.println(answer);
	}
}
