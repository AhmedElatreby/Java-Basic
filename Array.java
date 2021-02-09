public class Array {
    public static void main(String[] args) {
        System.out.println("Welcome to our array ");

        int[][] test = {{20, 15, 7},
                        {25, 33, 88},
                        {100, 852, 968}
        };

        System.out.println(test[1][1]);
        System.out.println("---------------------------------");

        // using for loop in array
        for (int i = 0; i < 3; i++) {
            System.out.println(test[i][i]);

        System.out.println("---------------------------------");

        // using for loop in array with 2D
        for (int j = 0; j < 3; j++) {
            for (int j2 = 0; j2 < 3; j2++) {
                System.out.println(test[j][j2]);
                
            }
            
        }
            
        }
    }
    
}
