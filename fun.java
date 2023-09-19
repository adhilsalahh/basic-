 import java.util.*;
public class fun
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		
		char ch=scan.next().charAt(0);
		
		if(checkCharExist(str,ch)){
		    System.out.print("Character exist");
		}
		else{
		    System.out.print("Character does not exist");
		}
	}
	
	
	public static boolean checkCharExist(String str,char ch){
	    
	    // write code here
	    int n=str.length();
	    int letter_count=0;
	    for (int i=0;i<n;i++){
	        if(str.charAt(i)==ch){
	            return true;
	       }   
	    }
			return false;

	}
	
}

    

