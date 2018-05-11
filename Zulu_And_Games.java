import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @version 1
 * @Name Zulu andGames
 * @author Cesar Almeciga
 */

public class Zulu_And_Games {
	
	public int valor1;
	public int valor2;
	
	public Zulu_And_Games next;
	public Zulu_And_Games(){}
	
	public Zulu_And_Games(int V1, int V2)
	{//beginning constructor
		
		this.valor1 = V1;
		this.valor2 = V2;
			
	}//end Initialization
	
	public String toString() {//method print list
		
		return "Menor: " + this.valor1 + " Mayor: " + this.valor2+ "\n";
		
	}
	
	public Zulu_And_Games head = null;
	
	public boolean isEmpty() {//Method Check if empty
		
		return head == null ? true : false;
		
	}//end method
	
	public void enqueue(Zulu_And_Games newNode) {//Method insert at end of the list
		
		if(isEmpty()) {
			
			head = newNode;	
			
		}else{
			
		Zulu_And_Games temp = head;
		
		while(temp.next != null) {
			
			temp = temp.next;
		}
		temp.next = newNode;	
	}
}//end method
	
	public void printList() throws IOException {//Method that prints the contents of the list
		
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		Zulu_And_Games temp = head;
		while(temp != null) {
			
			bw.write(temp.toString());
			temp = temp.next;
		}
		
		bw.write("\n");
		bw.flush();
		
	}//end method

	public static void main(String[] args) throws NumberFormatException, IOException { //main class
		
		Zulu_And_Games ZG = new Zulu_And_Games();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int level = Integer.parseInt(br.readLine());
		
		String NivelesBajos = br.readLine();
		String NivelesAltos = br.readLine();
		
		String[] lowLevel = NivelesBajos.split(" ");
		String[] hightLevel = NivelesAltos.split(" ");
		
		for (int i = 0; i < level; i++) {
			
			ZG.enqueue(new Zulu_And_Games(Integer.parseInt(lowLevel[i]),Integer.parseInt(hightLevel[i])));
			
		}
		
		
		
		int C = 0;
		
		Zulu_And_Games temp = ZG.head;
		Zulu_And_Games temp2 = temp.next;
		
		for (int i = 0; i < level - 1; i++) {
			
			for (int j = i; j < level - 1; j++) {
				
				if(((temp.valor1 >= temp2.valor1)&&(temp.valor1 <= temp2.valor2)) || 
						((temp.valor2 >= temp2.valor1)&&(temp.valor2 <= temp2.valor2))) {	
				}else {
					
					if(temp.valor2 < temp2.valor2) {
						
						C += temp2.valor2;
						
						
					}else {
						
						C += temp.valor2;
						
					}
				}
				temp2 = temp2.next;
			}
			
			temp = temp.next;
			temp2 = temp.next;
			
		}
		
		System.out.println(C);
	}
}
