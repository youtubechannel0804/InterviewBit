package Binarysearch;

import java.util.ArrayList;
import java.util.List;

public class SortedInsertPosition {

	public static void main(String[] args) {
		int ar[] = { 1, 3, 5, 6 };
		System.out.println(searchInsert(ar, 7));
	}

	public static int searchInsert(int[] nums, int target) {

		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			// System.out.println(left +"::"+ mid + "::" + right);
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}

		return left;
	}

}
