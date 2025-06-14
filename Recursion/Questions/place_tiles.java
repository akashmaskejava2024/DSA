package Questions;
public class place_tiles {
    public static int placeTiles(int n, int m){         
        if(n==m){
            return 2;
        }
        //When the length of the floor (n) is exactly equal to the size of the tile (m), there are exactly two ways to place the tiles vertically & horizontally
        if(n<m){
            return 1;
        } 
        // when one side   is smaller then only one way is left that is horizontal in axis to the bigger size.
        //Arrange vertically 
       int verticallyplaced = placeTiles(n-m, m);
       //horizontally arranged 
       int horizontallyArranged = placeTiles(n-1, m);
       return verticallyplaced + horizontallyArranged;
    }
    public static void main(String[] args) {
        System.out.println(placeTiles(4, 2));
    }
}
