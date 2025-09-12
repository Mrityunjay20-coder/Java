package Array;
public class minimumJumps {

    // Function to find the minimum number of jumps to reach the end of the array
    public static int minJumps(int[] arr) {
        if (arr.length <= 1) {
            return 0; // No jumps needed if the array has 0 or 1 element
        }

        int jumps = 0; // Number of jumps made
        int currentEnd = 0; // The farthest point that can be reached with the current number of jumps
        int farthest = 0; // The farthest point that can be reached with the next jump

        for (int i = 0; i < arr.length - 1; i++) {
            // Update the farthest point that can be reached
            farthest = Math.max(farthest, i + arr[i]);

            // If we have come to the end of the current jump
            if (i == currentEnd) {
                jumps++; // Increment the jump count
                currentEnd = farthest; // Update the current end to the farthest point

                // If the current end is already at or beyond the last index, we can stop
                if (currentEnd >= arr.length - 1) {
                    break;
                }
            }
        }

        return jumps;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4};
        int result = minJumps(arr);
        System.out.println("Minimum number of jumps to reach the end: " + result);
    }
}
