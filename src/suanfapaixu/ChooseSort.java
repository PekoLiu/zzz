package suanfapaixu;

import org.junit.Test;

public class ChooseSort {
	@Test
	public void test() {
		int[] arr = { 23, 34, 65, 98, 67, 32 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int a = arr[i];
					arr[i] = arr[j];
					arr[j]=a;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
