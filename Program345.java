import java.util.*;
public class Program345 {

    //table
    // public static void main(String [] args){
    //     Scanner sc =new Scanner(System.in);
    //     int n=sc.nextInt();
    //     // int table=1;
    //     for(int i=1;i<=10;i++){
    //        int  table=n*i;
    //        System.out.println(n + "*" + i + "=" + table);
    //     } 
    // }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n;
        int sum=0;
        while(n>0){
            int d=n%10;
            sum=sum*10+d;
            // sum+=d;
            n=n/10;
        }
        if(a==sum){
      System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
       
    }
}
