public class Problem15 {
//    Write a metghod that takes in an array containing the numbers 1-10 shuffled and returns them sorted
//    Don't use any built-in sort function
    public static int[] sortArray(int[] nums) {
        int[] nums2 = new int[10];
        for (int num : nums) {
            nums2[num - 1]++;
        }
        int index = 0;
        for (int j = 0; j < 10; j++) {
            for(int k = 0; k < nums2[j]; k++) {
                nums[index] = j + 1;
                index++;
            }
        }
        return nums;
    }
}

