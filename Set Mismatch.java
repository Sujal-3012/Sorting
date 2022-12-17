class Solution {
    //only one number is duplicated implies first index having incorrect number is your ans for repitition . 
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        cycleSort(nums);
        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i] != (i + 1)){
                arr[0] = nums[i];
                arr[1] = i+1;
                return arr;
            }
        }
        arr[0] = -1;
        arr[1] = -1;
        return arr;
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
