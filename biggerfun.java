import java.util.*;
public class biggerfun {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a =scan.nextInt();
        int c= scan.nextInt();
        System.out.println(bigg(a,c));
        System.out.println(bigg(10,4));

    }
    public static int bigg(int a,int b){
        int c=b;
        if(a>b){
            return c=a;

        }
        else{
            return c;
        }


    }
    
}
