import java.util.ArrayList;
import java.util.Arrays;

class Solution {

    public int count_same(int[] a, int[] b, int count) {
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int num : b) {
            numberList.add(num);
        }
        for (int i = 0; i < a.length; i++) {
            if (numberList.contains(a[i])) {
                count += 1;
            }
        }
        return count;
    }

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            int count = 0;

            int[] sub_A = Arrays.copyOfRange(A, 0, i + 1);
            int[] sub_B = Arrays.copyOfRange(B, 0, i + 1);
            ans.add(count_same(sub_A, sub_B, count));
        }

        // Convert ArrayList<Integer> to int[]
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}
