class Solution {
    //According to ex. ->ignore negatives and start checking from 1
    //This gives us the hint to apply cyclic sort as you are checking 
    //1 , then 2 , then 3.....
    //But here random numbers are present so how to apply cyclic sort 
    //ignore the negative numbers as. given in qus , and also ignore 
    //numbers greater than length of array as you will not be able to
    //place them on correct index .
    //After sorting , index must have index + 1 as their value , it means
    //start checking form index 0 , the first index you get which does'nt have 
    //index + 1 as value , return index + 1 , it is the first missing positive 
    //number 
    //Dom't worry about negative numbers , they will come at end after 
    //sorting .
    //It is same as the qus - missing no.
    public int firstMissingPositive(int[] arr) {
        int i = 0;
        //iff the element <= arr.length , then only we can place it at correct index otherwise ignore it 
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[correct] != arr[i]){
                swap(arr , i , correct);
            } else {
                i++;
            }
        }

        //search for first positive number 
        for (int j = 0 ; j < arr.length ; j++){
            //we will start checking from 1 according to a example
            if (arr[j] != j + 1){
                return j+1;
            }
        }
        return arr.length + 1; //if all the elements from 1-n are present    
    }

    void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
