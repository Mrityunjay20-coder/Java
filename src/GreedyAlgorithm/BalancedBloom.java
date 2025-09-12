package GreedyAlgorithm;
import java.util.Arrays;

public class BalancedBloom {
    public static int transformAndSum(int[] A, int n1) {
        if (A.length == 0) return 0;

        int[] sortedA = Arrays.copyOf(A, A.length);
        Arrays.sort(sortedA);

        int[] transformed = new int[A.length];

        boolean anyValid = false;

        for (int i = 0; i < A.length; i++) {
            int bloomTime = A[i];

            int left = 0;
            int right = sortedA.length - 1;

            // Binary search to find the first occurrence of bloomTime in the sorted array
            int firstIndex = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (sortedA[mid] >= bloomTime) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            firstIndex = (left < sortedA.length && sortedA[left] == bloomTime) ? left : -1;

            // Binary search to find the last occurrence of bloomTime in the sorted array
            left = 0;
            right = sortedA.length - 1;
            int lastIndex = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (sortedA[mid] <= bloomTime) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            lastIndex = (right >= 0 && sortedA[right] == bloomTime) ? right : -1;

            if (firstIndex == -1 || lastIndex == -1) {
                transformed[i] = 0;
                continue;
            }

            int countBefore = firstIndex;                       // Flowers blooming before A[i]
            int countAfter = sortedA.length - 1 - lastIndex;   // Flowers blooming after A[i]
            int sameDayCount = lastIndex - firstIndex + 1;     // Flowers blooming on same day as A[i]

            if (countBefore == countAfter && sameDayCount <= n1) {
                transformed[i] = bloomTime;
                anyValid = true;
            } else {
                transformed[i] = 0;
            }
        }

        int sum = 0;
        for (int num : transformed) {
            sum += num;
        }

        if (!anyValid) {
            sum = 0;
            for (int num : A) {
                sum += num;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] A = {73,29,37,83,77,6,2,12};
        int n1 = 8; // Maximum allowed same-day blooms
        int result = transformAndSum(A, n1);
        System.out.println("Result: " + result);
    }
}
