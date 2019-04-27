import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class BubbleSortTest {
	int[] testArray = new int[]{3,2,5,4,1};
	int[] result = new int[]{1,2,3,4,5};
 	@Test
	public void TestBubbleSort() {
 		BubbleSort.BubbleSort(testArray);
 		assertArrayEquals(result,testArray);
	}
}