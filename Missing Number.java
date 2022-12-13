class Solution {
    //Here it is clear that arraylength number will also be present at last 
    public int missingNumber(int[] nums) {
        cycleSort(nums);
        //search for misiing number 
        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i] != i){
                return i;
            }
        }
        //You will reach here iff the array contains all the elements upto n then return the n+1 which will be arr.length
        return nums.length;
    }

    public void cycleSort(int[] arr){
        //by cycle sort algo place the element at its correct index but ignore the last element
        //that will be equal to arr.length because you will not be able to place it at its correct place  .
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if ((arr[i] < arr.length) && (arr[i] != i)){
                swap(arr , i , arr[i]); //arr[i] is its own correct index
            } else {
                i++;
            }
        }
    }
    public void swap(int[] arr , int first , int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
   
}
