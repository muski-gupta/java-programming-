import java.util.*;
public class Swtich {
    //program 1 - days with break

    // public static void main(String[] args){
    //     int a=3;
    //     switch(a){
    //         case 1:System.out.println("monday");
    //                  break;
    //         case 2:System.out.println("monday");
    //                  break;
    //         case 3:System.out.println("monday");
    //                  break;                  
    //     }
    // }


     //program = days without break;
    //   public static void main(String[] args){
    //     int a=1;
    //     switch(a){
    //         case 1:System.out.println("monday");
    //         case 2:System.out.println("tuesday");
    //         case 3:System.out.println("wednesday");                 
    //     }
    // }


//   program 3-mathematical calc
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=(sc.next()).charAt(0);
        int a=2;
        int b=6;
        // char ch='*';
        switch(ch){
            case '+': int result=a+b;
                      System.out.println(result);
                     break;
            case '-':result=a-b;
                      System.out.println(result);
                     break;
                    
            case '*':result=a*b;
                      System.out.println(result);
                     break;  
            case '/': if(b!=0){
                  result=a/b;
                  System.err.println(result);
                  break;
                            }
                  else{
                    System.err.println("undefined");
                    }
        }
    }
} 
