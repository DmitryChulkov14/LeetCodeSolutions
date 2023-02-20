import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CinemaSeatAllocation {

    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int[] i : reservedSeats) {
            map.putIfAbsent(i[0], new ArrayList<>());
            map.get(i[0]).add(i[1]);
        }

        int result = 2 * (n - map.size());

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> seats = entry.getValue();

            boolean isLeftAisle = false, isRightAisle = false, isMiddle = false;

            for (int seat : seats) {
                if (seat >= 2 && seat <= 5)
                    isLeftAisle = true;
                if (seat >= 6 && seat <= 9)
                    isRightAisle = true;
                if (seat >= 4 && seat <= 7)
                    isMiddle = true;

                if (isLeftAisle && isRightAisle && isMiddle) {
                    break;
                }
            }

            if (!isLeftAisle)
                result += 1;
            if (!isRightAisle)
                result += 1;
            if (isLeftAisle && isRightAisle && !isMiddle)
                result += 1;
        }

        return result;
    }

}
