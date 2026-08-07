public class Demo {
    static int x=10;
    public static void main(String [] args){

        System.out.print("Hello world");
        System.out.print("Hello world");
        System.out.print("Hello world");
        Demo2 obj = new Demo2();
        obj.display();
    }
}
class Demo2{
        void display(){
            Demo.x=10;
            System.out.println(Demo.x);
    }
}

