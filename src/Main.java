import java.util.Arrays;

public class Main {
    public static void main (String[] args)
    {
        //Problem 1
        String[][] seating = {{"Abby", "Don", "George", "Kim"}, {"Brian", "Elenor", "Harry", "Lenny"}, {"Cathy", "Fred", "Jill", "Matt"}};
        seating[1][2] = "Paul";
        String temp = seating[0][0];
        seating[0][0] = seating[2][3];
        seating[2][3] = temp;
        String[] temporary = seating[0];
        seating[0] = seating[1];
        seating[1] = temporary;
        System.out.println(Arrays.deepToString(seating));
        System.out.println(seating[0][2] + seating[2][0]);

        //Problem 2
        int[][] intArr1 = new int[2][3];
        int[][] intArr2 = new int[3][2];
        intArr1[0][0] = 1;
        intArr1[0][1] = 2;
        intArr1[0][2] = 3;
        intArr1[1][0] = 4;
        intArr1[1][1] = 5;
        intArr1[1][2] = 6;
        System.out.println(Arrays.deepToString(intArr1));
        intArr2[0][0] = 1;
        intArr2[0][1] = 4;
        intArr2[1][0] = 2;
        intArr2[1][1] = 5;
        intArr2[2][0] = 3;
        intArr2[2][1] = 6;
        System.out.println(Arrays.deepToString(intArr2));
        System.out.println(intArr1[0][2] + intArr2[2][0]);

        // TEST CODE FOR average
        int[][] testArr1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(FunWith2DArrays.average(testArr1));
        int[][] testArr2 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(FunWith2DArrays.average(testArr2));
        int[][] testArr3 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(FunWith2DArrays.average(testArr3));
        int[][] testArr4 = {{4}, {7}, {8}, {2}};
        System.out.println(FunWith2DArrays.average(testArr4));
        int[][] testArr5 = {{4}};
        System.out.println(FunWith2DArrays.average(testArr5));

    }
}
