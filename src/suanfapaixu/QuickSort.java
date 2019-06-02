package suanfapaixu;

import java.util.Arrays;

import org.junit.Test;
/**
 * 快速排序
 * 
 * @author Peko.Liu
 * @version 1.0 
 * Settime：2019年6月2日  下午5:39:30
 *
 */
public class QuickSort {
	@Test
	public void test() {
		int[] arr = { 23, 34, 65, 98, 67, 15, 32 };
		quick1(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public void quick(int[] arr, int start, int end) {
		int l = start;
		int h = end;
		int z = arr[start];
		while (l < h) {
			while (l < h && arr[h] > z) {
				h--;
			}
			if (l < h) {
				arr[l] = arr[h];
				l++;
			}
			while (l < h && arr[l] < z) {
				l++;
			}
			if (l < h) {
				arr[h] = arr[l];
				h--;
			}
		}
		arr[l] = z;
		if (start < l - 1)
			quick(arr, start, l - 1);
		if (end > h + 1)
			quick(arr, h + 1, end);
	}

	public void quick1(int[] arr, int start, int end) {
		int l = start;
		int h = end;
		int z = arr[start];
		while (l < h) {
			while (l < h && arr[h] > z) {
				h--;
			}
			if (l < h) {
				arr[l] = arr[h];
				l++;
			}
			while (l < h && arr[l] < z) {
				l++;
			}
			if (l < h) {
				arr[h] = arr[l];
				h--;
			}
		}
		arr[l] = z;
		if (start < l - 1) {
			quick1(arr, start, l - 1);
		}
		if (h + 1 < end) {
			quick1(arr, h + 1, end);
		}
	}

}
