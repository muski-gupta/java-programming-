import java.util.*;
public class Autocalc {

public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int num1,num2;
    System.out.println("enter number 1");
    num1=sc.nextInt();
     System.out.println("enter number 2");
    num2=sc.nextInt();
    System.out.println("sum of num1 and nums is:" + (num1+num2));
    System.out.println("sub of num1 and nums is:" + (num1-num2));
    System.out.println("mul of num1 and nums is:" + (num1*num2));
    System.out.println("div of num1 and nums is:" + (num1/num2));
}


    
  
    // public static void main(String [] args){
    //     Scanner sc=new Scanner(System.in);
    //  int a=sc.nextInt();
    //  int b=sc.nextInt();
    //  char op=sc.next().charAt(0);
    //  System.out.println(calc(a,b,op));
    // }
    // public static int calc(int a,int b,char op){
    //     int ans;
    //     if(op == '+'){
    //         ans=a+b;
    //     }
    //     else if(op == '-'){
    //         ans=a-b;
    //     }
    //     else if (op =='*') {
    //         ans=a*b;
    //     }
    //     else{
    //         ans=a/b;
    //     }
    //     return ans;
    // }
}
