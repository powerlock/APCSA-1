public class MagicSquare
{
    private int[][] board;
    private int targetSum;

    public MagicSquare(int[][] values)
    {
        board = new int[values.length][values.length];

        for (int row = 0; row < values.length; row++)
        {
            for (int col = 0; col < values.length; col++)
            {
                board[row][col] = values[row][col];
            }
        }

        targetSum = 0;
        for (int col = 0; col < board.length; col++)
        {
            targetSum += board[0][col];
        }
    }

    public boolean rowsMatch()
    {
        for (int row = 0; row < board.length; row++)
        {
            int sum = 0;
            for (int col = 0; col < board.length; col++)
            {
                sum += board[row][col];
            }

            if (sum != targetSum)
                return false;
        }
        return true;
    }

    public boolean colsMatch()
    {
        for (int col = 0; col < board.length; col++)
        {
            int sum = 0;
            for (int row = 0; row < board.length; row++)
            {
                sum += board[row][col];
            }

            if (sum != targetSum)
                return false;
        }
        return true;
    }

    public boolean diagonalsMatch()
    {
        int mainDiag = 0;
        int otherDiag = 0;

        for (int i = 0; i < board.length; i++)
        {
            mainDiag += board[i][i];
            otherDiag += board[i][board.length - 1 - i];
        }

        return mainDiag == targetSum && otherDiag == targetSum;
    }

    public boolean allDifferent()
    {
        int size = board.length;
        boolean[] seen = new boolean[size * size + 1];

        for (int row = 0; row < size; row++)
        {
            for (int col = 0; col < size; col++)
            {
                int num = board[row][col];

                if (num < 1 || num > size * size)
                    return false;

                if (seen[num])
                    return false;

                seen[num] = true;
            }
        }
        return true;
    }

    public boolean isMagic()
    {
        return allDifferent() &&
               rowsMatch() &&
               colsMatch() &&
               diagonalsMatch();
    }

    public String toString()
    {
        String output = "";

        for (int row = 0; row < board.length; row++)
        {
            for (int col = 0; col < board.length; col++)
            {
                output += board[row][col] + " ";
            }
            output += "\n";
        }

        if (isMagic())
            output += "MAGIC SQUARE";
        else
            output += "NOT A MAGIC SQUARE";

        return output;
    }

    public static void main(String[] args)
    {
        int[][] example = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };

        MagicSquare test = new MagicSquare(example);
        System.out.println(test);
    }
}
