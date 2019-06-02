package suanfapaixu;
/**
 * 希尔排序
 * 
 * @author Peko.Liu
 * @version 1.0 
 * Settime：2019年6月2日  下午9:44:41
 *
 */
public class ShellSort {
	public static void main(String[] args) {
		int[] arr = { 6, 3, 8, 2, 9, 1, -2, -23, 5, -55, 56 };
		int len = 4;
		for (len = 4; len > 0; len /= 2) {
			for (int i = 1; i < arr.length; i++) {
				int j = i - len;
				int temp = arr[i];
				while (j >= 0 && arr[j] > temp) {
					arr[j + len] = arr[j];
					j -= len;
				}
				arr[j + len] = temp;
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
