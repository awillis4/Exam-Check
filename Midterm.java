/**Please create your own class YourLastName_YourFirstName_midterm
 * and implement methods in this interface */

public interface Midterm {
	
	/**Question1 
	 * mergeLinkedList
	 * merges two sorted linked lists of integers and returns the merged list
	 * requirement: your method's complexity must be less or equal to O(nlogn)
	 * @param SinglyLinkedList slist1 
	 * @param SinglyLinkedList slist2
	 * @return SinglyLinkedList mergedList */
	SinglyLinkedList<Integer> mergeLinkedList(SinglyLinkedList<Integer> slist1, SinglyLinkedList<Integer> slist2);
	
	/**Question2
	 * movingAverage 
	 * calculates the moving average of the past three numbers this method
	 * accepted
	 * @param new number in the data stream
	 * @return the moving average of the previous three numbers */
	double movingAverage(int number);
	
	/**Question3
	 * findLessElement
	 * Given an unsorted array of integers 
	 * (may contain repeated elements), and a search key, 
	 * write a program named findLessElement
	 * that finds and returns all the elements which are less than the search key
	 * requirement: your method's complexity must be less than O(nlogn)
	 * @param an unsorted array of integers 
	 * @param a search key
	 * @return an array of */
	ArrayList<Integer> findLessElement(int[] a, int key);
	
	
}
