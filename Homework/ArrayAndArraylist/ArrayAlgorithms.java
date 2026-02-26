public class ArrayAlgorithms
{
    /**
     * Find and return the minimum value in the array
     */
    public static int findMin(int[] numbers)
    {
        
        return 0;
    }

    /**
     * Find and return the maximum value in the array
     */
    public static int findMax(int[] numbers)
    {
        return 0;
    }

    /**
     * Find the sum of the array
     */
    public static int arraySum(int[] numbers)
    {
        return 0;
    }

    /**
     * Find the average of the array
     */
    public static double arrayAverage(int[] numbers)
    {
        return 0;
    }

    /**
     * Find the mode of the array of numbers
     */
    public static int mode(int[] arr) 
    {
        return Integer.MAX_VALUE;
    }

    /**
     * Determine if the array has at least one position number
     */
    public static boolean hasAtLeastOnePositive(int[] nums) 
    {
        for (int elem : nums)
        {
            if (elem>0)
            {
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if all elements of the array are negative
     * YOU DON'T NEED TO COUNT ALL OF THEM, JUST FIND ONE IS GOOD ENOUGH.
     */
    public static boolean allAreNegative(int[] nums)
    {

        return true;
    }

    /**
     * returns true if all elements of the array are 
     * in strictly increasing order; false otherwise
     */
    public static boolean isStrictlyIncreasing(int[] nums)
    {

        return true;
    }

    /**
     * Determine if the array contains duplicate elements
     */
    public static boolean containsDuplicates(String[] words)
    {
        return false;
    }

    /**
     *  Count how many four letter words are in the array.
     *  Return the count.
     */
    public static int countFourLetterWords(String[] words)
    {
        return 0;
    }

    /**
     * The first element of the array is removed, all elements from index 1 to
     * arr.length - 1 are shifted one position to the left. The first element
     * is inserted at the end.
     */
    public static void shiftLeft(int[] arr)
    {


    }

    /**
     * The last element of the array is removed, all elements from index 0 to
     * arr.length - 2 are shifted one position to the right. The last element
     * is inserted at the beginning.
     */
    public static void shiftRight(int[] arr)
    {
        int temp = arr[arr.length-1];
        for (int i=arr.length-1; i>0; i--)
        {
            arr[i] = arr[i-1];
        }

        arr[0] = temp;
    }

    /**
     * Reverse the contents of the array
     */
    public static void reverseArray(int[] arr)
    {
    }

    /**
     * Find and return the alphabetically largest word in the array
     */
    public static String findLarge(String[] words)
    {
        return "";
    }

    public static void main(String[] args)
    {
        int[] arr1 ={-1, -2, -3, 0, -5, 11};
        System.out.println(hasAtLeastOnePositive(arr1));
        shiftRight(arr1);
    }
}
