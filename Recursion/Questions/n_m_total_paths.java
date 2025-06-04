public class n_m_total_paths {

    public static int findpath(int n, int m, int i, int j) {

        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int downwardPaths = findpath(n, m, i + 1, j);

        int rightwordPaths = findpath(n, m, i, j + 1);

        return downwardPaths + rightwordPaths;
    }
    public static void main(String[] args) {
        int count = findpath(3, 3, 0, 0);
        System.out.println(count);

    }
}