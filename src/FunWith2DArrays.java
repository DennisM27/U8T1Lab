public class FunWith2DArrays {
    public static int totalElements(int[][] intArray)
    {
        int rows = intArray.length;
        int columns = intArray[0].length;
        return rows * columns;
    }

    public static void fourCorners(String[][] strArray)
    {
        int rows = strArray.length;
        int columns = strArray[0].length;
        System.out.println(strArray[0][0]);
        System.out.println(strArray[0][columns - 1]);
        System.out.println(strArray[rows - 1][0]);
        System.out.println(strArray[rows - 1][columns - 1]);
    }
}
