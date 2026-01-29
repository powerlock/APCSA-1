package MyFirstProgram;

public class MagicSquare
{
    private int[][] data;
    private int rowSum;

    public MagicSquare(int[][] d)
    {
        data = new int[d.length][d[0].length];

        // copy the array (not just the reference)
        for (int r = 0; r < d.length; r++)
        {
            for (int c = 0; c < d[0].length; c++)
            {
                data[r][c] = d[r][c];
            }
        }

        // store the sum of the first row
        rowSum = rowSum(data[0]);
    }

    public boolean isUnique()
    {
        int max = data.length * data[0].length;
        boolean[] used = new boolean[max + 1];

        for (int r = 0; r < data.length; r++)
        {
            for (int c = 0; c < data[0].length; c++)
            {
                int num = data[r][c];

                if (num < 1 || num > max || used[num])
                    return false;

                used[num] = true;
            }
        }
        return true;
    }

    public boolean isMagic()
    {
        // small redundancy here but readable
        if (!rowSumsEqual()) return false;
        if (!columnSumsEqual()) return false;
        if (!diagonalSumsEqual()) return false;
        return isUnique();
    }

    public boolean rowSumsEqual()
    {
        for (int r = 0; r < data.length; r++)
        {
            if (rowSum(data[r]) != rowSum)
                return false;
        }
        return true;
    }

    private int rowSum(int[] row)
    {
        int total = 0;
        for (int i = 0; i < row.length; i++)
        {
            total += row[i];
        }
        return total;
    }

    public boolean columnSumsEqual()
    {
        for (int c = 0; c < data[0].length; c++)
        {
            if (colSum(c) != rowSum)
                return false;
        }
        return true;
    }

    private int colSum(int col)
    {
        int total = 0;
        for (int r = 0; r < data.length; r++)
        {
            total += data[r][col];
        }
        return total;
    }

    public boolean diagonalSumsEqual()
    {
        int d1 = 0;
        int d2 = 0;

        for (int i = 0; i < data.length; i++)
        {
            d1 += data[i][i];
            d2 += data[i][data.length - 1 - i];
        }

        return d1 == rowSum && d2 == rowSum;
    }

    public String toString()
    {
        String out = "";   // not the most efficient, but very student-like

        for (int r = 0; r < data.length; r++)
        {
            for (int c = 0; c < data[0].length; c++)
            {
                out += data[r][c] + " ";
            }
            out += "\n";
        }

        if (isMagic())
            out += "MAGIC SQUARE";
        else
            out += "NOT A MAGIC SQUARE";

        return out;
    }
}

