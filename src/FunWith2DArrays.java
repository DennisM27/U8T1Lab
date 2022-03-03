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

    public static double average (int[][] intArray)
    {
        double sum = 0;

        for (int[] row : intArray)
        {
            for (int column : row)
            {
                sum += column;
            }
        }

        int size = intArray.length * intArray[0].length;

        return (sum / size);
    }

    public static int[] indexFound (String[][] strArray, String target)
    {
        int[] found = new int[2];

        for (int row = 0; row < strArray.length; row++)
        {
            for (int column = 0; column < strArray[0].length; column++)
            {
                String str = strArray[row][column];
                if (str.equals(target))
                {
                    found[0] = row;
                    found[1] = column;

                    return found;
                }
            }
        }

        found[0] = -1;
        found[1] = -1;

        return found;
    }
}
