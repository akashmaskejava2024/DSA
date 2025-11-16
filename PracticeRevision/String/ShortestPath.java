package PracticeRevision.String;

public class ShortestPath {
    public static void main(String[] args) {

        String dir = "WENSWENSSNSSSEEE";
        int path = findShortestPath(dir);

        System.out.println(path);
    }

    private static int findShortestPath(String dir) {

        int x = 0;
        int y = 0;

        for (char c : dir.toCharArray()) {

            switch (c) {
                case 'N':
                    y++;
                    break;

                case 'S':
                    y--;
                    break;

                case 'E':
                    x++;
                    break;

                case 'W':
                    x--;
                    break;

            }

        }

        return (int) Math.sqrt(x * x + y * y);

    }

}
