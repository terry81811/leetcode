package leetcode;

public class E_88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = m-1;
        int second = n-1;
        int count = m+n-1;
        while(first >= 0 && second >= 0) {
            if(nums1[first] > nums2[second]) {
                nums1[count] = nums1[first];
                first--;
                count--;
            }else {
                nums1[count] = nums2[second];
                second--;
                count--;
            }
        }
        if(second >= 0) {
            for(int i=second; i>=0; i--) {
                nums1[count] = nums2[i];
                count--;
            }
        } 
    }
}

//iterate from backwards, to avoid swapping