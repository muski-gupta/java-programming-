import java.util.Scanner;

public class Typecasting {
    public static void main(String [] args){

    byte b1,b2;
    short s1,s2;
    b1=120;
    s1=129;
    b2=(byte)s1;
    s2=b1;
    System.out.println("value of byte b1: "+b1+ " and short s1 :" + s1 );
    System.out.println("after casting value of byte b2: "+b2+ " and short s1 :" + s2 );
    int n;
    float f ;
    double d;
    n=26567;
    f=n;
    d=n;
    System.out.println("value of n : " + n + " f:"+f+"d:"+d);
    f=145.56f;
    n=(int)f;
    d=f;
    System.out.println("value of n : " + n + " f:"+f+"d:"+d);
    d=123.456;
    n=(int)d;
    f=(float)d;
     System.out.println("value of n : " + n + " f:"+f+"d:"+d);
     System.out.println((2+3.5)-15*2+5/2);
    }
}



