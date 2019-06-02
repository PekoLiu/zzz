package suanfapaixu;
/**
 *  插入排序
 * 
 * @author Peko.Liu
 * @version 1.0 
 * Settime：2019年6月2日  下午9:31:54
 *
 */
public class InsertSort {
	public static void main(String[] args) {
		int[] arr = { 45, 84, 23, 46, 51, 21, 35, 95, 83 };
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					break;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
