class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = findpivot(nums);

        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1); // this was my main mistake i wrote this condition after checking =trgt which casued -1== 0 . array outof box exception
        }
        if (nums[pivot] == target) {
            return true; // here i tried to return the element; first
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);

        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    public static boolean binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return true;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }

    public static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) { // case 1
                return mid;
            } else if (mid > start && arr[mid - 1] > arr[mid]) { // case 2
                return mid-1;
            }

            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // check whetheer start is the pivot;
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                // check if end is the pivot element ;
                if (end > start &&  arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left is sorted array the pivot could be in the right side..
            else if((arr[start] < arr[mid]) || (arr[end] < arr[mid]) && (arr[start] == arr[mid])){
                start = mid+1;
            }
            else {
                end = mid-1; // pivot is in left side ;
            }
        }
        return -1;
    }
}