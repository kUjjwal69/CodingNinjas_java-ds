import java.util.*;

public class IsocellesTriangle {
  
    public static void main(String[] args) {
      
        Scanner s= new Scanner(System.in);
      
        int n = s.nextInt();
      
        int rows = 1;
     
        while(rows<=n){
          
            int spaces = 1;
          
            while(spaces<=n-rows){
              
                System.out.print(" ");
              
                spaces = spaces + 1;

            }

            int num = 1;
          
            while(num<=rows){
              
                System.out.print(num);
              
                num = num+1;
            }
          
            int decNum = rows-1;
          
            while(decNum>=1){
              
                System.out.print(decNum);
              
                decNum = decNum - 1;
            }

            System.out.println();
          
            rows = rows +1;
          
        }

    }
}
