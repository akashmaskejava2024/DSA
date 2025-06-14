package Questions;
import java.util.ArrayList;

public class subsets_n_naturalno {

    public static void findSubset(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }
        // get added to the subset
        subset.add(n);
        findSubset(n - 1, subset);
        // do not get added
        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);
    }

    // try to memorize the tree structure of formation of the subsequences


    private static void printSubset(ArrayList<Integer> subset) {
        for(int i= 0; i<subset.size(); i++){
            System.out.print(subset.get(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int n = 3;
        ArrayList<Integer> arr = new ArrayList<>();
        findSubset(n, arr);
    }
}
