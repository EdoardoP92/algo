package algo;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Main {

	public static void main(String[] args) {

//		int[] sortedNumbers = createArray(Integer.MAX_VALUE - 5);
		
		String iso = "»¿“ŸÃ‡˘";
		
//		System.out.println(Charset.availableCharsets());
		try {
//			System.out.println(Charset.defaultCharset());
			byte[] latin = iso.getBytes("ISO-8859-1");
			byte[] utf8 = new String(latin, "ISO-8859-1").getBytes("UTF-8");
			String utf = new String(utf8, "UTF-8");
			System.out.println(utf);
			iso.getBytes("UTF-8");
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

//		System.out.println(binarySearch(50, sortedNumbers));

	}

	//Complessit‡ logaritmica O(log n)

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
}
