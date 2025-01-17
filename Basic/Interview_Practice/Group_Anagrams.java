package Basic.Interview_Practice;

import java.util.HashMap;

public class Group_Anagrams {
    public static void main(String[] args) {

        String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };

        String[][] groupedStrings = groupAnagrams(arr);
        printArray(groupedStrings);

    }

    private static void printArray(String[][] groupedStrings) {
        System.out.print("[ ");
        for (int i = 0; i < groupedStrings.length; i++) {
            System.out.print("[ ");
            if (groupedStrings[i] != null && groupedStrings[i].length > 0 && groupedStrings[i][0] != null) {

                for (int j = 0; j < groupedStrings[i].length; j++) {

                    if (groupedStrings[i][j] != null) {
                        System.out.print(groupedStrings[i][j] + ", ");
                    }
                }
            }
            System.out.print(" ], ");

        }
        System.out.print(" ] ");

    }

    private static String[][] groupAnagrams(String[] arr) {

        String[][] groupedStrings = new String[arr.length][arr.length];

        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            String str = sortString(arr[i]);
            if (map.get(str) != null) {
                int no = map.get(str);
                if (map2.get(no) != null) {
                    groupedStrings[no][map2.get(no)] = arr[i];
                    map2.put(no, map2.getOrDefault(no, 0) + 1);

                } else {
                    map2.put(no, 0);
                    groupedStrings[no][map2.get(no)] = arr[i];
                    map2.put(no, map2.getOrDefault(no, 0) + 1);
                }
            } else {
                map.put(str, count++);
                int no = map.get(str);
                if (map2.get(no) != null) {
                    groupedStrings[no][map2.get(no)] = arr[i];
                    map2.put(no, map2.getOrDefault(no, 0) + 1);

                } else {
                    map2.put(no, 0);
                    groupedStrings[no][map2.get(no)] = arr[i];
                    map2.put(no, map2.getOrDefault(no, 0) + 1);
                }
            }

        }

        String[][] newGroupStrings = new String[count][arr.length];
        for (int i = 0; i < count; i++) {
            if (groupedStrings[i] != null && groupedStrings[i].length > 0 && groupedStrings[i][0] != null) {

                for (int j = 0; j < groupedStrings[i].length; j++) {

                    if (groupedStrings[i][j] != null) {
                          newGroupStrings[i][j] = groupedStrings[i][j];
                    }
                }
            }

        }
        return newGroupStrings;

    }

    private static String sortString(String str) {

        char[] arr = new char[str.length()];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            arr[count++] = str.charAt(i);
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        String sortedString = "";
        for (char a : arr) {
            sortedString += a;
        }

        return sortedString;

    }
}
