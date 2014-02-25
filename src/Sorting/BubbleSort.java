package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param array		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
    public static int[] bubbleSort(int array[])
    {
    	for (int i = array.length - 1; i >= 0; i--){
    		for (int j = 0; j < i; j++){
    			if (array[j] > array[j+1]){
    				int tmp = array[j];
    				array[j] = array[j+1];
    				array[j+1] = tmp;
    			}
    		}
    	}

        return array;
    }
}
