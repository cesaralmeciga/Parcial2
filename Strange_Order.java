

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


/*
 * 
 */
/**
 * @version 1
 * @Name Strange Order
 * @author Cesar Almeciga
 */

public class Strange_Order {

	 public static int MCD(int a, int b){ //Searching the minimum common divider
			if(a == 0)
				return b;
			return MCD(b%a, a);
		}
	    public static void main(String args[] ) throws Exception { //main class
	    	
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	
	     	Scanner s = new Scanner(System.in);
	     	
			int n = Integer.parseInt(br.readLine());
			
			int[] ar = new int[n+1];
			
			int pos = n;
			
			while(pos!=1){
				
				while(pos!=-1 && ar[pos--] == 1);
				
				pos++;
				ar[pos]=1;
				
				System.out.print(pos+" ");
				
				for(int i = pos; i > 1; i--){
					
					if(ar[i]== 0 && MCD(pos,i)!=1){
						
						System.out.print(i+" ");
						ar[i]=1;
					}
				}
			}
			s.close();
		}
	
}
