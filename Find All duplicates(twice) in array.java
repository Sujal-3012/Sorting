class Solution {
    //It is totally same as find missing numbers from array([1,n]) , only change is here we are recording the numbers which are at the place of missing 
    //numbers as they are repitition , and here we require list of repeated numbers .
    public List<Integer> findDuplicates(int[] nums) {
        cycleSort(nums);
        List<Integer> arr = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            if (nums[i] != (i + 1)){
                arr.add(nums[i]); //add wrong element in array
                //Becasue all elements at incorrect index are repitition
                i++; //move forward
            }else{
                i++;
            }
        }
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
