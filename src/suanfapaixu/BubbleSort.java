package suanfapaixu;

import org.junit.Test;
/**
 * 冒泡排序
 *
 * @author Peko.Liu
 * @version 1.0 
 * Settime：2019年6月2日  下午5:40:00
 *
 */
public class BubbleSort {
	@Test
	public void test() {
		int[] arr = { 23, 34, 65, 98, 67, 32 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int a = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = a;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
