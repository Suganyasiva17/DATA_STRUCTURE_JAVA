// Java Program for BinarySearch using recursion
class Main{
    public static int BinarySearch(int[] arr,int right,int left,int item){
        int mid;
        if(right>=left){
            mid=(right+left)/2;
        if(arr[mid]==item){
            return mid+1;
        }
        else if(arr[mid]>item){
            return BinarySearch(arr,mid-1,left,item);
        }
        else if (arr[mid]<item){
          return BinarySearch(arr,right,mid+1,item);
        }
        }
            return -1;
        
    }
    public static void main(String[] args){
        int a[]={7,23,34,43,67,89};
        System.out.println(BinarySearch(a,6,0,7));
    }
}
