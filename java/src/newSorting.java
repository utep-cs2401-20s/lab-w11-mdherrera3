public class newSorting {
    public void newSorting(int [] array, int size){

        //rather than calling a new sort jut go through the method
        if(array.length <= size){
            int start = 0;
            int end = array.length - 1;
            quickSort(array, start,end);
        }
        else{
            int mid = array.length/2;
            int[] leftHalf = new int[mid];
            int[] rightHalf = new int [array.length - mid];
            //populate left half and right half arrays
            for (int i = 0; i < leftHalf.length; i++) {
                leftHalf[i] = array[i];
            }
            for (int i = 0; i < rightHalf.length; i++) {
                rightHalf[i] = array[mid + i];
            }
            newSorting(leftHalf,size);
            newSorting(rightHalf,size);
            mergeSortedHalves(array,leftHalf,rightHalf);
        }

    }

    public void quickSort(int[] array, int start, int end){

        if (start < end && start >= 0) {
            int index = part(array, start, end);
            //left
            quickSort(array,start,(index - 1));
            //right
            quickSort(array,(start + 1), end);
        }
    }
    public int part(int []array, int start, int end) {
        int pivot = array[start];
        // going through the list
        for (int i = start; i < end + 1; i++) {
            //goes through and sees where to find the position of the array
            // and where to place the pivot
            if (array[i] < pivot) {
                int temp = pivot;
                pivot = array[i];
                array[i] = temp;
                start++;
            } else if(array[i] > pivot){
                int temp = pivot;
                pivot = array[start];
                array[start] = temp;
                start++;
            }
        }
        return end;
    }
    //may need helper method for this
    public void mergeSortedHalves(int[] array, int[] left, int[] right){
        int leftPoint = 0;
        int rightPoint =  0;

        for(int i = 0; leftPoint < left.length || rightPoint < right.length; i++) {

            if (leftPoint == left.length) {
                array[i] = right[rightPoint];
                rightPoint++;
                continue;
            }
            if (rightPoint == right.length) {
                array[i] = left[leftPoint];
                leftPoint++;
                continue;
            }
            if (left[leftPoint] < right[rightPoint]) {
                array[i] = left[leftPoint];
                leftPoint++;
            } else if (left[leftPoint] == right[rightPoint]) {
                array[i] = left[leftPoint];
                leftPoint++;
            } else {
                array[i] = right[rightPoint];
                rightPoint++;
            }
        }
    }
}

