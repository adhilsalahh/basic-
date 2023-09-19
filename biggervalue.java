import java.util.*;
public class biggervalue {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();

       System.out.print( bigger(a,b));

       System.out.println(bigger(4, 10));
    }
    public static int bigger(int a,int b){
        //int c=b
        if (a>b){  
            return a;
            //return c=a
        }
        else{                   // { return c}
            return b;
            
        }

    }
    
}
