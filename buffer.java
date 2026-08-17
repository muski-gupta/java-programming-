import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class buffer { 
//     public static void main(String [] args){
//         Scanner sc= new Scanner (System.in);
//         // System.out.println("enter a");
//         System.out.println("enter a");
//         int a=sc.nextInt();
//         System.out.println("enter s");
//         String s=sc.nextLine();
//         System.out.println(a);
//         System.out.println(s);
// }

public static void main(String [] args) throws IOException{
 int a,b;
 char option;
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("select your options");
 System.out.println("Welcome to the simple Caculator");
 System.out.println("choose + for addition");
 System.out.println("choose - for substraction");
 System.out.println("choose * for multiplication");
 System.out.println("choose / for division");
 System.out.println("choose e to exit");
 System.out.println("enter your options");
option=(br.readLine()).charAt(0);
  System.out.println("enter first number");
  a=Integer.parseInt(br.readLine());
 System.out.println("enter second number");
  b=Integer.parseInt(br.readLine());
 switch(option){
            case '+':int result= Math.abs(a+b);
                     System.out.println(result);
                     break;
            case '-':result= Math.abs(a-b);
                     System.out.println(result);
                     break;  
             case '*':result= a*b;
                     System.out.println(result);
                     break; 
            case '/':if(b!=0){
                result= a/b;
                     System.out.println(result);
                     break;  
                 }
                 else{
                    System.out.println("undefined");
                 }
            case 'e':
                System.exit(0);
                             
             default:
                // throw new AssertionError(); 
                System.out.println("wrong choice");       
        }
}
}
