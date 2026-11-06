package gliane_array2d;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DuplicateChecker {

    void check(int[][] a) {

        // value -> list of positions where it appears
        Map<Integer, List<String>> positions = new LinkedHashMap<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                positions
                    .computeIfAbsent(a[i][j], k -> new ArrayList<>())
                    .add("Row " + (i + 1) + " Col " + (j + 1));
            }
        }

        System.out.println("\nDUPLICATE CHECKER:");

        boolean found = false;

        for (Map.Entry<Integer, List<String>> e : positions.entrySet()) {
            if (e.getValue().size() > 1) {
                found = true;
                System.out.println("Duplicate found: " + e.getKey()
                        + " (" + String.join(", ", e.getValue()) + ")");
            }
        }

        if (!found) {
            System.out.println("No duplicates found.");
        }
    }
}
