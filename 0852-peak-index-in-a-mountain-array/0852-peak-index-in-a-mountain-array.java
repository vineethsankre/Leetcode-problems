class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid + 1]){
                //You are in dec part
                //It may be ans, but look left
                end = mid;
            } else{
                //You are in asc part
                start = mid + 1;

            }
        }
        //In the end, s == e and pointing to the largest num because of the 2 checks above
        // s and e are always trying to find the max element above two checks
        //Hence, when they are pointing to just one ele, that is the max one coz that is what checks say
        //At every point of time for start and end, they have the best possible answer till that time
        // And if we are saying that only one item is remaining, hence cuz of above line that is the best possible answer
        return start; //coz start and end both are equal
    }
}