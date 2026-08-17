public class CLI {
    public static void main (String [] args){
        System.out.println("=== Deployment Health v1.0 ===");
        System.out.println("Arguments received : " + args.length);

     if(args.length == 0){
        System.out.println("Usage : java P01 <service> <port>");
        return ;
     }
     for(int i=0;i<args.length;i++){
      
        System.err.println("args [ " + i  + " ] = " + args[i]);
     }
     String service = args[0];
     int port =Integer.parseInt(args[1]);
     System.out.println(" Pinging " + service + " on port " + port + " ...Ok ");

    }
}

//print each character;java
// public class CLI {
//     public static void main (String [] args){
//         System.out.println("=== Deployment Health v1.0 ===");
//         System.out.println("Arguments received : " + args.length);

//      if(args.length == 0){
//         System.out.println("Usage : java P01 <service> <port>");
//         return ;
//      }
  
//      for(int i=0;i<args.length;i++){
//       for(int j=0;j<args[0].length();j++){
//          System.out.print(args[0].charAt(j) + " ");

//       }
//      }
//      String service = args[0];
//      int port =Integer.parseInt(args[1]);
//      System.out.println(" Pinging " + service + " on port " + port + " ...Ok ");

//     }
// }
