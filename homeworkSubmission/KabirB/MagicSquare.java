public class MagicSquare
{
    private int[][] data;
    private int rowSum;

    public MagicSquare(int[][] d)
    {
        data=new int[d.length][d[0].length];
        for (int r=0;r<d.length;r++)
            for (int c=0;c<d[0].length;c++)
                data[r][c]=d[r][c];

        rowSum=rowSum(data[0]);
    }
    public boolean isUnique()
    {
        int n=data.length*data.length;
        boolean[] seen=new boolean[n+1];

        for (int r=0;r<data.length;r++)
        {
            for (int c=0;c<data.length;c++)
            {
                int val=data[r][c];
                if (val<1||val>n||seen[val])
                    return false;
                seen[val]=true;
            }
        }
        return true;
    }
    public boolean isMagic()
    {
        return isUnique() &&
               rowSumsEqual() &&
               columnSumsEqual() &&
               diagonalSumsEqual();
    }
    public boolean rowSumsEqual()
    {
        for (int r=0; r<data.length;r++)
            if (rowSum(data[r])!=rowSum)
                return false;
        return true;
    }
    private int rowSum(int[] row)
    {
        int sum=0;
        for (int num : row)
            sum+=num;
        return sum;
    }
    public boolean columnSumsEqual()
    {
        for (int c=0;c<data.length;c++)
            if (colSum(c)!=rowSum)
                return false;
        return true;
    }
    private int colSum(int colNum)
    {
        int sum=0;
        for (int r=0;r<data.length;r++)
            sum+=data[r][colNum];
        return sum;
    }
    public boolean diagonalSumsEqual()
    {
        int diag1 = 0;
        int diag2 = 0;

        for (int i = 0; i < data.length; i++)
        {
            diag1 += data[i][i];
            diag2 += data[i][data.length - 1 - i];
        }
        return diag1 == rowSum && diag2 == rowSum;
    }
    public String toString()
    {
        String output = "";

        for (int r = 0; r < data.length; r++)
        {
            for (int c = 0; c < data.length; c++)
                output += data[r][c] + " ";
            output += "\n";
        }

        if (isMagic())
            output += "MAGIC SQUARE\n";
        else
            output += "NOT A MAGIC SQUARE\n";

        return output;
    }
}
