import java.util.*;
public class star1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        int n=scan.nextInt();
        int k=printstars(n);

        System.out.print(k);
    }
    public static int printstars(int n){
        for (int i=1;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        return -1;
    }
    
}
