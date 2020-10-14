package binarysearch;

public class BinarySearch {
	
	public int binarySearch(int vector[], int left, int right, int element) {
		
		if(right >= left) {
			int mid = left + (right - left) / 2;
			
			if(vector[mid] == element) {
				return mid;
			}
			
			if(vector[mid] > element) {
				return binarySearch(vector, left, mid - 1, element);
			}
			
			return binarySearch(vector, mid + 1, right, element);
		}
		
		return -1;
	}
	
}
