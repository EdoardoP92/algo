package algo;

public class Main {

	public static void main(String[] args) {

		int[] sortedNumbers = createArray(500);
		
		System.out.println(binarySearch(500, sortedNumbers));
		System.out.println(cleanString("à\f\t"));

	}

	//Complessità logaritmica O(log n)

	/**
	    Logarithmic complexity algorithms are very fast, and their performance hardly degrades as
		you increase the problem size. These types of algorithm scale really well. Code that has a
		runtime complexity of O(log n) is usually recognizable since it systematically divides the
		input in several steps. Common examples that operate in logarithmic times are database
		indexes and binary trees. If we want to find an item in a list, we can do it much more
		efficiently if the input list is sorted in some specific order. We can then use this ordering by
		jumping to specific positions of our list and skipping over a number of elements.
	 */
	private static boolean binarySearch(int x, int[] sortedNumbers) {

		int end = sortedNumbers.length - 1;
		int start = 0;
		while (start <= end) {
			int mid = (end - start) / 2 + start;
			System.out.println("Start: "+start+" Mid: "+mid+" End: "+end);
			if (sortedNumbers[start] == x || sortedNumbers[mid] == x || sortedNumbers[end] == x) return true;
			else if (sortedNumbers[mid] > x) end = mid - 1;
			else start = mid + 1;
		}
		return false;
	}

	private static int[] createArray(int length) {
		int[] sortedNumbers = new int[length];

		for(int i = 0; i < length; i++) {
			sortedNumbers[i]=i;
		}

		return sortedNumbers;
	}
	
	private static String cleanString(String text) {
		
		// strips off all non-ASCII characters
        text = text.replaceAll("[^\\x00-\\x7F]", "x");
 
        // erases all the ASCII control characters
        text = text.replaceAll("[\\p{Cntrl}&&[^\r\n\t]]", "y");
        
        // removes non-printable characters from Unicode
        text = text.replaceAll("\\p{C}", "z");
        
		return text;
	}
}
