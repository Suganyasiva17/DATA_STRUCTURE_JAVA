import java.util.*;
public class Main{
    public static void Insertionsort(int[] arr){
        int len=arr.length;
        int target,j;
        for(int i=1;i<len;i++){// initialize the i value from 1 to n so that we can comparev with before element
            target=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>target){// check j value not equal to -1 and decrement to check before elemnt
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=target;
        }
    }
    public static void main(String[] args){
    int array[]={5,3,1,9,8,2,4,7};
    Insertionsort(array);
    System.out.println(Arrays.toString(array));
}
}
