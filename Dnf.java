public class Dnf {
   public static void binarySorting(int arr[], int n){
      int low=0;
      int high= n-1;
      int mid=0;
      while(mid<=high){
         if(arr[mid]==0){
            int temp= arr[mid];
            arr[mid]= arr[low];
            arr[low]= temp;
            mid++;
            low++;
         }
         if(arr[mid]==1){
            mid++;
         }
         if(arr[mid]==2){
            int temp= arr[mid];
            arr[mid]= arr[high];
            arr[high]= temp;
            high--;
         }
      }
   }
   public static void print(int arr[], int n){
      for (int i = 0; i < n; i++)
         System.out.print(arr[i] +" ");
   }
   public static void main(String[] args){
      int arr[] ={ 0,0,1,0,1,0,1,2,2};
      int n = arr.length;
      binarySorting(arr, n);
      print(arr, n);
   }
}
