import java.util.*;
public class Factorial {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        //to check 0 or negstivre
        if(n<0){
            System.out.println("UNDEFINED");
        }
        else if (n==0){
           System.out.println("the factorial of " + n + "is :" +1); 
        }
        else{
         for(int i=1;i<=n;i++){
           fact=fact*i;
        }
        System.out.println("the factorial of " + n + "is :" +fact);
        }
    }
}
