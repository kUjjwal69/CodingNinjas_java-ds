// Approach 1
import java.util.*;
class solution{
  public static void main(String[]args){
    Scanner s = new Scanner(Ssytem.in);
    int n = s.nextInt();
    int r = s.nextInt();
    
    int factN = 1;
    for(int i = 1;i<=n;i++){
      factN *=i;
    }
    int factR = 1;
    for(int i = 1;i<=r;i++){
      factR*=i;
    }
    int factNR =1;
    for(int i =1;i<=n-r;i++){
      factNr*=i;
    }
    int result = factN/factR*factNR;
    System.out.println(result);
  }
}

//Approach 2



int n=10,r=6;
    int factn=1,factr=1,factnr=1;
    for(int i=2;i<=n;i++)
    {
        factn*=i;
        if(i<=r)
            factr*=i;
        if(i<=n-r)
            factnr*=i;
    }
    int ncr=factn/(factr*factnr);
    System.out.print(ncr);
}
// approach 3 using methods


import java.util.Scanner;
public class NcR {
    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int ncr(int n,int r){
        int factN=factorial(n);
        int factR=factorial(r);
        int factNR=factorial(n-r);
        int result=factN/(factR*factNR);
        return result;
    }
    public static void main(String args[]) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int r=s.nextInt();
     
     int result=ncr(n,r);
     System.out.println(result);
    }
}
    
