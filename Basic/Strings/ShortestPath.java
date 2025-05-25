package Basic.Strings;


public class ShortestPath {
    public static void main(String[] args) {
        String path = "WENSWENSSNSSSEEE";
        double d = Shortestpath(path);
       System.out.println(d);
    }
    private static double Shortestpath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            switch (dir) {
                case 'N': y++; break;
                case 'S': y--; break;
                case 'W': x--;  break;
                case 'E': x++; break;
            }
        }
        return  Math.sqrt((x*x) + (y*y));
    }
}
