/**
 * @author ashish.adhikari
 */
package algos;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashish.adhikari
 *
 */
public class ActivitySelectionProblem {
	public static void main(String[] args) {
		int s[] = { 1, 3, 0, 5, 8, 5 };
		int f[] = { 2, 4, 6, 7, 9, 9 };
		int n = s.length;

		printMaxActivities(s, f, n);
	}

	/**
	 * @param s
	 * @param f
	 * @param n
	 */
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
}
