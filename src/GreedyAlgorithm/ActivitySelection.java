package GreedyAlgorithm;
import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        // Create an array to hold activities with their start and end times
        int[][] activities = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i; // Activity index
            activities[i][1] = start[i]; // Start time
            activities[i][2] = end[i]; // End time
        }

        // Sort activities based on their end times
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // Initialize variables for activity selection
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // Select the first activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        // Iterate through the sorted activities
        for (int i = 1; i < activities.length; i++) {
            if (activities[i][1] >= lastEnd) {
                // Select the activity
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        // Output the results
        System.out.println("Max activities = " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
