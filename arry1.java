import java.util.*;
public class arry1 {
    public static void main(String[] arg){
        Scanner scan =new Scanner (System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr [i]=scan.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
    
}
