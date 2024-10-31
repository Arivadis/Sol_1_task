import java.util.Arrays;

class SortingInsertion {

    public void sortArray(int[] nums, boolean debug) {

        // Python like solution with insertion by slicing array
        System.out.println("Arg array ->" + Arrays.toString(nums));
        if (nums.length < 2) {
            // skip sorting if array too small
            System.out.println("Array too small ->" + Arrays.toString(nums) + "\n");
            return;
        }
        int[] sorted = Arrays.copyOf(nums, nums.length);
        int temp1;
        int temp2;
        // Take entry temp vars
        for (int i = 1; i < sorted.length; i++) {
            temp1 = sorted[i - 1];
            temp2 = sorted[i];
            // assign an entry 2 vals
            if (debug) {
                System.out.println("New Temps -> temp1 " + temp1 + " temp2 " + temp2);
            }
            // ensured the previous value is sorted, if it is bigger - init finding the right loc
            if (temp2 < temp1) {
                int prevHigh = 0;
                // looking for smaller val beside
                for (int j = i - 1; j >= 0; j--) {
                    if (temp2 < sorted[j]) {
                        prevHigh = j;
                    } else {
                        // get out the loop if the current value is smaller
                        break;
                    }
                }
                // init temp array for combine parts of nums
                int[] tempArray = new int[sorted.length];
                int indx = 0;
                // part before inserting index
                int[] array1 = Arrays.copyOfRange(sorted, 0, prevHigh + 1);
                // part between inserting index and current index
                int[] array2 = Arrays.copyOfRange(sorted, prevHigh, i);
                // part after current index
                int[] array3 = Arrays.copyOfRange(sorted, i, sorted.length);
                if (debug) {
                    System.out.println("Array1" + Arrays.toString(array1));
                    System.out.println("Array2" + Arrays.toString(array2));
                    System.out.println("Array3" + Arrays.toString(array3));
                }
                // change val at insert index
                array1[array1.length - 1] = array3[0];
                // merging arrays
                System.arraycopy(array1, 0, tempArray, indx, array1.length);
                indx += array1.length;
                if (debug) {
                    System.out.println("Fin Array" + Arrays.toString(tempArray));
                }
                System.arraycopy(array2, 0, tempArray, indx, array2.length);
                indx += array2.length;
                if (debug) {
                    System.out.println("Fin Array" + Arrays.toString(tempArray));
                }
                System.arraycopy(array3, 1, tempArray, indx, array3.length - 1);
                if (debug) {
                    System.out.println("Fin Array" + Arrays.toString(tempArray));
                }
                // commit changes
                sorted = tempArray;
            }
        }
        System.out.println("Sorted Array ->" + Arrays.toString(sorted) + "\n");
    }
}