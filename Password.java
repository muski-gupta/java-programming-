// import java.util.*;
import java.io.Console;

// public class Password {
//     public static void main(String [] args){
//         Scanner sc =new Scanner (System.in);
//         int attempts=3;
//       while(attempts>0){
//         String password=sc.nextLine();
//         for(int i=0;i<password.length();i++){
//             if(Character.isDigit(password.charAt(i))){
//                 System.out.println("password correct");
//             }
//         }
//         attempts--;
//       }
//          if(attempts==0){
//             System.out.println("password incroect");
//         }
//     }
// }


// import java.util.*;
// public class Password {
//     public static void main(String [] args){
//         Scanner sc =new Scanner (System.in);
//         int password=4545;
//         int attempts=3;
//       while(attempts>0){
//           int pass=sc.nextInt();
//           if(pass==password){
//             System.out.println("password correct");
//             break;
//           }
//           else{
//             System.out.println("Incrorect password");
//           }
//         attempts--; 
//       }
//          if(attempts==0){
//             System.out.println("System locked");
//         }
//     }
// }

//sir ka version 
public class Password {
    public static void main(String [] args){
       java.io.Console console=System.console();
       int attempts=3;
       if(console== null){
        System.out.println("Console is not available");
        return ;
       }
    //    System.out.println("password entered successfully" + pass);
       while(attempts>0){
     char [] password=console.readPassword("enter passowrd: ");
       int pass=Integer.parseInt(new String (password));
        if(pass==1234){
             System.out.println("correct passowerd");
        }
        else{
            System.out.println("incorrect password");
            attempts--;
            System.out.println("attempts left "+attempts);
        }

       }
       if(attempts==0){
        System.out.println("system locked");
       }
    }
}

