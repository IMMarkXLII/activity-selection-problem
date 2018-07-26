# activity-selection-problem

  ## We start with the activity with minimum finish time and then add to it, the activity with minimum finish time but with a start time more than the last finish time.
  
    ```

      private static void printMaxActivities(int[] start, int[] finish, int n) {
        int i = 0, j=1;
        List<Integer> activitites = new ArrayList<>();
        activitites.add(i);
        for(;j<n;j++) {
          if(start[j] >= finish[i]) {
            i=j;
            activitites.add(i);
          }
        }
        System.out.println(activitites);
      }

    ```
