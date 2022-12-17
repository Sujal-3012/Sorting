class Solution {
    public int firstMissingPositive(int[] nums) {
        bubble(nums);
        int i = 0;
        while ((nums[i]) < 0){
            i++;
        }
        for(int j = i+1 ; j < nums.length ; j++){
            if ((nums[j]) != (nums[j-1] + 1)){
                return (nums[j-1] + 1);
            }
        }
        return nums.length; //return nums.length when no number is missing
    }
    void bubble(int [] arr){
        boolean swapped;
        //run the steps n - 1 times
        for (int i = 0; i < arr.length ; i++) {
            swapped = false;
            //for each step max element will come at the last respective index
            for (int j = 1; j < arr.length - i ; j++) {
                //swap if the number is smaller than previous
                if (arr[j] < arr[j - 1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            //if you did not swap for a particular value of i , it means array is sorted , stop the prg .
            if (!swapped){
                break;
            }
        }
    }
}
