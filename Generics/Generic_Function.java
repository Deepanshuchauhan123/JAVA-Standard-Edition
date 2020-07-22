public class Generic_Function
{
    public static <D> void printArray(D[] inputArray)
    {
        for (D element : inputArray)
        {
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args)
    {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.11, 1.22, 1.33, 1.44, 1.55};
        Character[] charArray = {'D', 'E', 'E', 'P', 'A', 'N', 'S', 'H', 'U'};

        System.out.println("Array IntegerArray Container: ");
        printArray(intArray);

        System.out.println("Array DoubleArray Container: ");
        printArray(doubleArray);

        System.out.println("Array CharArray Container: ");
        printArray(charArray);
    }
}