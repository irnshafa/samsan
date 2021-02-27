import java.util.Scanner;
public class sieve{
   public static void main(String[] args){
      	Scanner input = new Scanner(System.in);
      	System.out.println("enter a number ");
      	int n = input.nextInt();
      	boolean[] bool = new boolean[n];
      	for(int i = 0; i<bool.length; i++){
             	bool[i] = true;
      	}
      	for(int i = 2; i<Math.sqrt(n); i++){
             	if(bool[i] == true){
                    	for(int j = (i*i); j<n; j = j+i){
                           	bool[j] = false;
                    	}
             	}
      	}
      	System.out.println("prime number are:");
      	for(int i = 2; i<bool.length; i++){
             	if(bool[i] == true){
                    	System.out.print(i+" ");
             	}
      	}
   }
}
