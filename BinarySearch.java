public class BinarySearch {
	public static int binarySearch(int[] array, int target, int low, int high) {
	     if (low <= high) {
		int mid = (low + high) / 2;
	     
	        if (array[mid] == target) {
		    return mid;
		} else if (array[mid] < target) {
		   return binarySearch(array, target, mid + 1, high);
		} else {
		   return binarySearch(array, target, low,  mid - 1);
		}
	}


	return -1;
}

  public static void main(String[] args) {
	int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
	int target = 23;
	int result = binarySearch(array, target, 0, array.length - 1);
	if (result == -1) {
	    System.out.println("Element not found");
	} else {
	   System.out.println("Element found at index: " + result);
	}
    }
}