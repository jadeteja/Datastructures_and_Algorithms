package arrays;
import java.util.*;

public class Input {
    static void main() {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<=arr.length-1; i++){
            arr[i] = sc.nextInt();
        }
        for(int i: arr){
            System.out.println(i);
        }
    }

}
