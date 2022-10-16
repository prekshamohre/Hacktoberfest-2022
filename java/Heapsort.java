
public class Main
{
    static void heapify(int[] arr,int n, int i){
        int l=2*i+1;
        int r=2*i+2;
        int largest=i;
        
        if(l<n&&arr[l]>arr[largest]){
            largest=l;
        }
        
        if(r<n&&arr[r]>arr[largest]){
            largest=r;
        }
        
        if(i>largest){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,n,largest);
        }
        
    }
    
    static void buildHeap(int[] arr,int n){
        for(int i=n/2;i>0;i--){
            heapify(arr,n,i);
             for ( i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
             }
            heapify(arr, i, 0);
        }
    }
    
     static void printArray(int[] arr, int n){
        
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
            System.out.println();}
    }
	public static void main(String[] args) {
	    int[] arr={12,45,78,43,10,24};
	    int n=arr.length;
	     Main ob = new Main();
        ob.buildHeap(arr,n);
		printArray(arr,n);
	}
}
