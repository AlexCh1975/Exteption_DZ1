public class Program_4 {
    public static void main(String[] args){
        // int[] arr1 = {4, 2};
        // int[] arr2 = {2, 0};

        // int[] arr1 = {4, 2};
        // int[] arr2 = {2, 1};

        int[] arr1 = {4, 2};
        int[] arr2 = {2, 1, 5};

        printArray(divisionArray(arr1, arr2));
    }

    public static int[] divisionArray(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length)
            throw new RuntimeException("Array lengths are not equal");
        int[] arr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            if (arr2[i] == 0)
                throw new RuntimeException("Array 2 contains element zero");
            arr[i] = arr1[i] / arr2[i];
        }
        return arr;
    }

    public static void printArray(int[] array){
        StringBuilder printSB = new StringBuilder();
        for (Integer i : array) {
            // System.out.print(i + ", "); 
            printSB.append(i + ", ");
        }
        String printOut = printSB.substring(0, printSB.length() - 2);
        System.out.println(printOut);
    }
}
