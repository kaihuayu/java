/* for ¥Ú”° –«Õº∞∏*/

public class ForForstar{
    public static void main(String [] agre){
    // Õº∞∏1
        for (int i=1; i<= 5; i++){
           
            for (int j=1; j<=5; j++){
                System.out.print("*");
            }
             System.out.println();
         }

    System.out.println("---------------------------------------");

         for (int i=1; i<= 5; i++){
           
            for (int j=1; j<=i; j++){

                System.out.print("*");
            }
             System.out.println();
         }
    System.out.println("---------------------------------------");
         for (int i=1; i<= 5; i++){
           
            for (int j=1; j<=6-i; j++){

                System.out.print("*");
            }
             System.out.println();
         }
    System.out.println("---------------------------------------");
         for (int i=1; i<= 5; i++){
           
            for (int j=1; j<=5-i; j++){

                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++){

                System.out.print("*");
            }
            
             System.out.println();
         }
    }
}