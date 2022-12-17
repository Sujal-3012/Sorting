class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        cycleSort(nums);
        //search the disappeared ones
        int i = 0;
        while(i < nums.length){
            if (nums[i] != (i + 1)){
                arr.add(i + 1); //add the missing elemnt 
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
            //here last element can also be placed
            //don't do sorting f the required element is already there at the required index 
            //array has 1-n elements implies element should be at (element-1) index .
            //ex. {3 , 2 , 3 , 4 , 8 , 2 , 7}
            //Is 3 at correct index -> no -> swap with index 2 (3-1) , but 3 is already at index 2 ->skip this . 
            if ((arr[i] != i + 1) && (arr[correct] != arr[i])){
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
