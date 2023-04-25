import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

class TestSelectionSrt {

	@Test
	void test() {
		testPositive();
		testNegatives();
		testMixed();
	}
	public void testPositive(){
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;

		SelectionSort temp1 = new SelectionSort();
		temp1.selectionSort(arr);

		assertEquals("Unequal Arrays", Sortedarr, arr);
		}
		public void testNegatives(){
			int[] arr = new int[5];
			arr[1] = -9;
			arr[0] = -8;
			arr[2] = -7;
			arr[3] = -10;
			arr[4] = -2;
			int[] Sortedarr = new int[5];
			Sortedarr[0] = -10;
			Sortedarr[1] = -9;
			Sortedarr[2] = -8;
			Sortedarr[3] = -7;
			Sortedarr[4] = -2;

			SelectionSort temp1 = new SelectionSort();
			temp1.selectionSort(arr);
			assertEquals("Unequal Arrays", Sortedarr, arr);
		}
		public void testMixed(){
			int[] arr = new int[5];
			arr[0] = -8;
			arr[1] = 9;
			arr[2] = -7;
			arr[3] = 10;
			arr[4] = -2;
			int[] Sortedarr = new int[5];
			Sortedarr[0] = -8;
			Sortedarr[1] = -7;
			Sortedarr[2] = -2;
			Sortedarr[3] = 9;
			Sortedarr[4] = 10;

			SelectionSort temp1 = new SelectionSort();
			temp1.selectionSort(arr);
			assertEquals("Unequal Arrays", Sortedarr, arr);
		}
}
