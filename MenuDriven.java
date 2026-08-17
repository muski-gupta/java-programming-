 import java.util.*;
public class MenuDriven {
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        // System.out.println("enter a");
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        System.out.println("we are doing mathematical operations");
        System.out.println("choose + for addition");
        System.out.println("choose - for substraction");
        System.out.println("choose * for multiplication");
        System.out.println("choose / for division");
        System.out.println("enter your options");
        char ch=(sc.next()).charAt(0);
        switch(ch){
            case '+':int result= a+b;
                     System.out.println(result);
                     break;
            case '-':result= a+b;
                     System.out.println(result);
                     break;  
             case '*':result= a*b;
                     System.out.println(result);
                     break; 
            case '/':result= a/b;
                     System.out.println(result);
                     break;                
                     
        }

    }
}


// import java.util.*;
// // import java.io.BufferedReader;
// // import java.io.IOException;
// public class MenuDriven{
//     public stati
    
// }