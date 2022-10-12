import java.util.Scanner;
public class printAllPairs {
    public static void printAllPairs(int[]arr){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                System.out.println("(" + arr[i] + "," + arr[j] + ")");
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,4,7,6,8};
        printAllPairs(arr);
    }
}
