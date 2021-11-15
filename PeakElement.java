class PeakElement{
	public int peakElement(int[] arr, int n){
		return binarySearch(arr,0 ,n-1,n);
	}
	public static int binarySearch(int[] arr, int low, int high, int n){
		int mid=(low+high)>>1;
		
		//if mid is last or first index with the first element greater the next. Also, check if mid element is greater than mid-1 and mid +1
		if((mid==0 || arr[mid-1]<=arr[mid])&&(mid==n-1||arr[mid+1]<=arr[mid]))
			return mid;

		//if the mid is other than 0, then check if mid element is less than prev 
		//if so recurse for lower half
		else if (mid>0 && arr[mid]> arr[mid])
			return binarySearch(arr,low,mid-1,n);
		//else recurse for the upper half\
		else 
			return binarySearch(arr,mid+1,high,n); 
	}
}
