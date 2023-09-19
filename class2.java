import java.util.*;
public class class2 {
    public static void main(String[]args){
    
        cricket ck1=new cricket(24,"virat kohli",80000,50);
        cricket ck2=new cricket(39,"ms dhoni",100000,100);
        cricket ck3=new cricket(35,"rohit sharma",90000,100);
          System.out.println(ck1.name);
          System.out.println(ck1.name);
          System.out.println(ck2.name);
          

    }
}
    class cricket {
        int age;
        String name;
        int runs;
        int wickets;
         public cricket (int a,String b,int r,int w){
            this.age=a;
            this.name=b;
            this.runs=r;
            this.wickets=w;

        }
    }


    

