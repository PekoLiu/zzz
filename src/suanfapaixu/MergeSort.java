package suanfapaixu;

import java.util.Arrays;

import org.junit.Test;
/**
 * 归并排序
 * 
 * @author Peko.Liu
 * @version 1.0 
 * Settime：2019年6月2日  下午5:40:28
 *
 */
public class MergeSort {

	@Test
	public void test() {
		int[] arr = { 23, 34, 65, 98, 67, 32, 76, 13 };
		mergeInside(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	
	//归并排序
	public static void mergeInside(int[] arr, int start, int end) {
		// 先拆分再合并
		//左侧: start~(stop+end)/2
		//右侧: (stop+start)/2+1~end
		if (start < end) {
			int mid = (start + end) / 2;
			mergeInside(arr, start, mid);// 右侧
			mergeInside(arr, mid + 1, end);// 左侧
			merge(arr, start, mid, end);// 合并
		}
	}

	// 实现合并
	public static void merge(int[] arr, int start, int mid, int end) {
		// 创建一个中间数组
		int[] temp = new int[end - start + 1];
		// 每个小块进行比较将数据放到临时数组中
		int i = start;
		int j = mid + 1;
		int k = 0;
		// 比较arr[i]和arr[j]
		while (i <= mid && j <= end) {
			if (arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k] = arr[j];
				k++;
				j++;
			}
		}
		// 右侧先结束
		while (i <= mid) {
			temp[k++] = arr[i++];
		}
		// 左侧先结束
		while (j <= end) {
			temp[k++] = arr[j++];
		}
		// 临时数组temp中的数据写到arr数组中
		for (k = 0; k < temp.length; k++) {
			arr[start + k] = temp[k];
		}
	}

}
