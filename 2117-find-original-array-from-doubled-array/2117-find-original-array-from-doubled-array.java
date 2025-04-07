import java.util.*;

class Solution {
    public int[] findOriginalArray(int[] ch) {
        if (ch.length % 2 != 0) return new int[0];

        Arrays.sort(ch);
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : ch) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[ch.length / 2];
        int k = 0;

        for (int num : ch) {
            Integer count = map.get(num);
            if (count == null || count == 0) continue;

            int doubleNum = num * 2;

            // Special case: pairing 0 with 0
            if (num == 0) {
                if (count < 2) return new int[0]; // Not enough zeros to form a pair
                result[k++] = 0;
                map.put(0, count - 2);
                if (map.get(0) == 0) map.remove(0);
                continue;
            }

            Integer doubleCount = map.get(doubleNum);
            if (doubleCount == null || doubleCount == 0) return new int[0];

            result[k++] = num;

            map.put(num, count - 1);
            if (count - 1 == 0) map.remove(num);

            map.put(doubleNum, doubleCount - 1);
            if (doubleCount - 1 == 0) map.remove(doubleNum);
        }

        return result;
    }
}
