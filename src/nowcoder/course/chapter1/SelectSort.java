package nowcoder.course.chapter1;

import nowcoder.course.Common;

public class SelectSort {

    /**
     * 选择排序
     * @param arr
     */
    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            Common.swap(arr, i, minIndex);
        }
    }
}
