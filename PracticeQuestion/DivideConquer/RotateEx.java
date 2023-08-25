package programs.PracticeQuestion.DivideConquer;

public class RotateEx {
public static int search(int arr[], int tar, int si, int ei){
    if(si>ei){
        return -1;
    }
    int mid=si+(ei-si)/2;
    if(arr[mid]==tar){
        return mid;
    }
    if(arr[si]<=arr[mid]){
        if(arr[si]<=arr[mid] && tar<=arr[mid]){
        return search(arr,tar,si,mid-1);
        }else{
            return search(arr,tar,mid+1,ei);
        }
    }else{
    if(arr[mid]<=tar && tar<=arr[ei]){
        return search(arr,tar,mid+1,ei);
    }else{
        return search(arr,tar,si,mid-1);
    }
    }
}
public static void printArr(int[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int arr[]=new int[n];
    //     for(int i=0;i<n;i++){
    //      arr[i]=sc.nextInt();
    //     }
    //     int tar=sc.nextInt();
    int arr[]={4,5,6,7,0,1,2};
    int tar=7;
     int tarIdx = search(arr,tar,0,arr.length-1);
       System.out.println(tarIdx);
    //    printArr(arr);
    //    sc.close();
}
}
