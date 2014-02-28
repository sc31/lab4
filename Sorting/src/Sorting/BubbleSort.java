package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] array) {
	
        /**
         * TODO
         * Implement bubble sort
         */
    	int length;
    	int temp;
    	int counter;
    	int index;
    	
    	length = array.length;
    	
        for(counter=0; counter<length-1; counter++) { //Loop 
            for(index=0; index<length-1-counter; index++) { // -1 counter for element
                if(array[index] > array[index+1]) { //Test for swap
                    temp = array[index]; // swap the two elements:
                    array[index] = array[index+1];
                    array[index+1] = temp;
                } // if not swap, loop
            }
        }
        return array;
    }

}
