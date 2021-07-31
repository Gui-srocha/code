public class MergeSort {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (args.length != 1 || n < 0) {
            System.err.println("Please, insert only one positive integer");
            System.exit(1);
        }
        StdDraw.setYscale(0, n);
        StdDraw.setXscale(0, n);
        Value[] values = new Value[n];
        for (int i = 0; i < values.length; i++) {
            int j = (int) (Math.random() * n);
            values[i] = new Value(j);
        }
        int min = values[0].getValue();
        for (int i = 0; i < values.length; i++) {
            min = Math.min(min, values[i].getValue());
        }
        int max = values[0].getValue();
        for (int i = 0; i < values.length; i++) {
            max = Math.max(max, values[i].getValue());
        }
        values[min].setSound(440);
        for (int i = 0; i < values.length; i++) {
            int x = values[i].getValue();
            int hz = (int) (440 * Math.pow(2, (x - min) / 12.0));
            values[i].setSound(hz);
        }
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledSquare(n / 2, n / 2, n / 2);
        double p = 0.5;
        for (int i = 0; i < values.length; i++) {
            StdDraw.setPenColor(StdDraw.GREEN);
            values[i].draw(p, 0);
            StdAudio.play(values[i].getSound());
            p += 1.0;
        }
        mergesort_helper(values, 0, values.length);
    }

    // A helper method that actually does the work. Meaning of the parameters:
    // arr: the array whose sub-array [low, high) we want to sort.
    // low: the lower index of the sub-array we want to sort, inclusive.
    // high: the higher index of the sub-array we want to sort, exclusive.
    public static void mergesort_helper(Value[] arr, int low, int high) {
        // Base case: the sub-array has length 0 or 1.
        // (void methods can return, they just don't return anything)
        if (high - low <= 1) {
            StdDraw.clear();
            arr[0].draw(0.5, 0);
            StdAudio.play(arr[0].getSound());
        } else {
            // Prepare for the recursive calls
            // Find the mid-point to "split" the sub-array in two "halves"
            int mid = low + (high - low) / 2;
            // Recursive calls / "Divide" phase
            // Sort the two "halves" recursively
            mergesort_helper(arr, low, mid);
            mergesort_helper(arr, mid, high);
            // "Conquer" phase: merge the sorted sub-arrays.
            merge(arr, low, high);
        }
        double x = 0.5;
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledSquare(arr.length / 2, arr.length / 2, arr.length / 2);
        for (int i = 0; i < arr.length; i++) {
            if (i < high && i > low) {
                StdDraw.setPenColor(StdDraw.YELLOW);
            } else {
                StdDraw.setPenColor(StdDraw.GREEN);
            }
            arr[i].draw(x, 0);
            StdAudio.play(arr[i].getSound());
            x += 1;
        }
    }

    // Merge two sorted subarrays [low, mid) and [mid,high) of arr (mid is
    // computed in the method). This method is separate from mergesort_helper
    // just for better code organization.
    public static void merge(Value[] arr, int low, int high) {
        int mid = low + (high - low) / 2;  // the mid-point
        // Merge the two "halves" into a new array merged
        Value[] merged = new Value[high - low];
        int low_i = low;
        int upp_i = mid;
        for (int mer_i = 0; mer_i < merged.length; mer_i++) {
            if (low_i == mid) {
                // We already put all elements from the lower half in their
                // right place, so just put all the elements from the upper half
                // in their place, and be done.
                while (upp_i < high) {
                    merged[mer_i] = arr[upp_i];
                    upp_i++;
                    mer_i++;
                }
                break;
            } else if (upp_i == high) {
                // We already put all elements from the upper half in their
                // right place, so just put all the elements from the lower half
                // in their place, and be done.
                while (low_i < mid) {
                    merged[mer_i] = arr[low_i];
                    low_i++;
                    mer_i++;
                }
                double x = 0.5;
                for (int i = 0; i < merged.length; i++) {
                    merged[i].draw(x, 0);
                }
                break;
            } else if (arr[low_i].getValue() < arr[upp_i].getValue()) { // when comparing objects, use  arr[low_i].compareTo(arr[upp_i) < 0
                merged[mer_i] = arr[low_i];
                low_i++;
            } else {
                merged[mer_i] = arr[upp_i];
                upp_i++;
            }
        }
        // Copy the elements of merged back into arr in the right place.
        for (int i = 0; i < merged.length; i++)
            arr[low + i] = merged[i];
    }
}
