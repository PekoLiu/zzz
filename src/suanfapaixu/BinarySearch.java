package suanfapaixu;

import java.util.Arrays;
/**
 * 折半查找
 * 
 * @author Peko.Liu
 * @version 1.0 
 * Settime：2019年6月2日  下午9:45:44
 *
 */
public class BinarySearch {
	public static void main(String[] args) {
		int[] array = { 12, 21, 23, 4, 15, 17 };
		Arrays.sort(array);
		int num = 22;

		int start = 0;
		int end = array.length - 1;
		boolean flag = true;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (array[mid] == num) {
				System.out.println("找到了" + mid);
				flag = false;
				break;
			} else if (num > mid) {
				start = mid + 1;
			} else if (num < mid) {
				end = mid - 1;
			}
		}
		if (flag) {
			System.out.println("没找到");
		}
	}
}
