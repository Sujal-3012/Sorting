class Solution {
    public int findDuplicate(int[] nums) {
        cycleSort(nums);
        //By observation -> the repeated number comes at last after sorting .
        return nums[nums.length - 1];
    }
    public static void cycleSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if ((arr[i] != i + 1) && (arr[correct] != arr[i])){
                //skip swap if the correct index already has req number . 
                swap(arr , i , correct);
            } else {
                i++;
            }
        }
    }
    public static void swap(int[] arr , int first , int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
}
