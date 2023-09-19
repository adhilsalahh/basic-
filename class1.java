import java.util.*;
public class class1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        footballer fl1= new footballer(18,"neymer",10000,100);
            System.out.println(fl1.age);
    } 
}
class footballer{
    int age;
    String name;
    int salary;
    int goal;

    public footballer(int a,String str,int y,int k){
        this.age=a;
        this.name=str;
        this.salary=y;
        this.goal=k;
    }

}
