/**
 * MagicSquare.java  11/12/13
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id 0000000
 *
 * @author - I received help from ...
 *
 */

public class MagicSquare
{
    private int[][] data;
    private int rowSum; 	//initialize to one of the row sums of data

    //-----------------------------------------------------------------
    // precondition: d is a square matrix with at least one row.
    // Initializes data to a NEW COPY OF d, and the row sum
    //-----------------------------------------------------------------
    public MagicSquare(int[][] d)
    {
        // deep copy (not just reference copy)
        data = new int[d.length][d[0].length];
        for (int r = 0; r < d.length; r++)
        {
            for (int c = 0; c < d[0].length; c++)
            {
                data[r][c] = d[r][c];
            }
        }

        // store a reference row sum (use first row)
        rowSum = rowSum(data[0]);
    }

    //-----------------------------------------------------------------
    // returns true if each number in data is unique
    // and in the range of 1 to data.length * data[0].length
    // THIS METHOD IS EXTRA CREDIT.  DO IT LAST!
    //-----------------------------------------------------------------
    public boolean isUnique()
    {
        int n = data.length;
        int max = n * n;

        boolean[] seen = new boolean[max + 1]; // index 1..max

        for (int r = 0; r < n; r++)
        {
            for (int c = 0; c < n; c++)
            {
                int val = data[r][c];

                // range check
                if (val < 1 || val > max) return false;

                // uniqueness check
                if (seen[val]) return false;
                seen[val] = true;
            }
        }

        return true;
    }

    //-----------------------------------------------------------------
    // returns true if data is a magic square.  A rectangular 2D array
    // is magic iff every row, column, and diagonal sums to the same
    // number and each number is unique and in the range from
    // 1 to data.length * data[0].length
    //-----------------------------------------------------------------
    public boolean isMagic()
    {
        return isUnique() && rowSumsEqual() && columnSumsEqual() && diagonalSumsEqual();
    }

    //-----------------------------------------------------------------
    // returns true iff each individual row sum is equal to rowSum
    //-----------------------------------------------------------------
    public boolean rowSumsEqual()
    {
        for (int r = 0; r < data.length; r++)
        {
            if (rowSum(data[r]) != rowSum) return false;
        }
        return true;
    }

    private int rowSum(int[] row)
    {
        int sum = 0;
        for (int i = 0; i < row.length; i++)
        {
            sum += row[i];
        }
        return sum;
    }

    //-----------------------------------------------------------------
    // returns true iff each individual column sum is equal to rowSum
    //-----------------------------------------------------------------
    public boolean columnSumsEqual()
    {
        for (int c = 0; c < data[0].length; c++)
        {
            if (colSum(c) != rowSum) return false;
        }
        return true;
    }

    private int colSum(int colNum)
    {
        int sum = 0;
        for (int r = 0; r < data.length; r++)
        {
            sum += data[r][colNum];
        }
        return sum;
    }

    //-----------------------------------------------------------------
    // returns true iff each individual diagonal sum is equal to rowSum
    //-----------------------------------------------------------------
    public boolean diagonalSumsEqual()
    {
        int n = data.length;

        int diag1 = 0; // top-left to bottom-right
        for (int i = 0; i < n; i++)
        {
            diag1 += data[i][i];
        }

        int diag2 = 0; // top-right to bottom-left
        for (int i = 0; i < n; i++)
        {
            diag2 += data[i][n - 1 - i];
        }

        return diag1 == rowSum && diag2 == rowSum;
    }

    //-----------------------------------------------------------------
    // returns a String that contains the values in data and a message
    // stating whether or not magic is a magic square.
    // The string format must EXACTLY match the following examples.
    // There must be a single space character after each number.
    //-----------------------------------------------------------------
    public String toString()
    {
        String s = "";

        for (int r = 0; r < data.length; r++)
        {
            for (int c = 0; c < data[0].length; c++)
            {
                s += data[r][c] + " ";
            }
            s += "\n";
        }

        if (isMagic())
            s += "MAGIC SQUARE\n";
        else
            s += "NOT A MAGIC SQUARE\n";

        return s;
    }
}
