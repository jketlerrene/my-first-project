/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
*/



class Solution {

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public int removeElement(int[] nums, int val) {
        int boundary = nums.length - 1;
        int i = 0;
        while (i <= boundary) {
            if (nums[i] == val) {
                swap(nums, i, boundary);
                boundary -= 1;
            } else {
                i += 1;
            }
        }
        return i;
    }
}
