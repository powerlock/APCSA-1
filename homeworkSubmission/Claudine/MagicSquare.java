public class MagicSquareLab 
{
	    private int[][] matrix;
	    private int rowSum;

	    public MagicSquareLab(int[][] m) 
	    {
	        matrix = new int[m.length][m[0].length];

	        for (int i = 0; i < m.length; i++) 
	        {
	            for (int c = 0; c < m[0].length; c++) 
	            {
	                matrix[i][c] = m[i][c];
	            }
	        }
	        rowSum = 0;
	        for (int c = 0; c < matrix[0].length; c++) 
	        {
	            rowSum += matrix[0][c];
	        }
	    }

	    public boolean isUnique() 
	    {
	        int n = matrix.length;
	        boolean[] unique = new boolean[n * n + 1];

	        for (int i = 0; i < n; i++) 
	        {
	            for (int c = 0; c < n; c++) 
	            {
	                int val = matrix[i][c];

	                if (val < 1 || val > n * n) 
	                {
	                    return false;
	                }

	                if (unique[val]) 
	                {
	                    return false;
	                }

	                unique[val] = true;
	            }
	        }
	        return true;
	    }

	    public boolean rowSumsEqual() 
	    {
	        for (int i = 0; i < matrix.length; i++) 
	        {
	            int sum = 0;
	            for (int c = 0; c < matrix[0].length; c++) 
	            {
	                sum += matrix[i][c];
	            }
	            if (sum != rowSum) 
	            {
	                return false;
	            }
	        }
	        return true;
	    }

	    public boolean columnSumsEqual() 
	    {
	        for (int i = 0; i < matrix[0].length; i++) 
	        {
	            int sum = 0;
	            for (int c = 0; c < matrix.length; c++) 
	            {
	                sum += matrix[c][i];
	            }
	            if (sum != rowSum) 
	            {
	                return false;
	            }
	        }
	        return true;
	    }

	    public boolean diagonalSumsEqual() 
	    {
	        int sum1 = 0;
	        int sum2 = 0;

	        for (int i = 0; i < matrix.length; i++) 
	        {
	            sum1 += matrix[i][i];
	            sum2 += matrix[i][matrix.length - 1 - i];
	        }

	        return sum1 == rowSum && sum2 == rowSum;
	    }

	    public boolean isMagic() 
	    {
	        return isUnique() && rowSumsEqual() && columnSumsEqual() && diagonalSumsEqual();
	    }

	    public String toString() 
	    {
	        String output = "";

	        for (int i = 0; i < matrix.length; i++) 
	        {
	            for (int c = 0; c < matrix[0].length; c++) 
	            {
	                output += matrix[i][c] + " ";
	            }
	            output += "\n";
	        }

	        if (isMagic()) 
	        {
	            output += "MAGIC SQUARE";
	        } else 
	        {
	            output += "NOT A MAGIC SQUARE";
	        }

	        return output;
	    }
}

	              
