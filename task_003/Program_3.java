public class Program_3 {
    public static void main(String[] args){
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,7,1};

        // int[] arr1 = {1,2};
        // int[] arr2 = {2,7,1};

        int[] arr = diffArray(arr1, arr2);
        printArray(arr);
    }

    public static int[] diffArray(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length)
            throw new RuntimeException("Array lengths are not equal");
        int[] diffArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            diffArr[i] = arr1[i] - arr2[i];
        }
        return diffArr;
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
