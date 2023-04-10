public class Program_1 {
    public static void main(String[] args){
        // int[] arr1 = null;
        // printArray(arr);

        // int[] arr2 = {1,2,3,4};
        // System.out.println(sum(arr1)); 

        String[][] arr3 = {{"1","4","a"},{"9","3","2"}};
        System.out.println(sumMatrix(arr3));
    }

    // Передавая null получаем "NullPointerException"
    public static void printArray(int[] array){
        StringBuilder printSB = new StringBuilder();
        for (Integer i : array) {
            // System.out.print(i + ", "); 
            printSB.append(i + ", ");
        }
        String printOut = printSB.substring(0, printSB.length() - 2);
        System.out.println(printOut);
    }

    // Если передаем массив Length != 5 
    // получаем "ArrayIndexOutOfBoundsException"
    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < 5; i++){
            sum += arr[i];
        }
        return sum;
    }

    // Если массив будет содержать элементы, которые нельзя распарсить
    // получим исключение "NumberFormatException.forInputString"
    public static int sumMatrix(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                int value = Integer.parseInt(arr[i][j]);
                sum += value;
            }
        }
        return sum;
    }
}