class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        cycleSort(nums);
        //search the disappeared ones
        int i = 0;
        while(i < nums.length){
            if (nums[i] != (i + 1)){
                arr.add(i + 1);
                i++;
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
