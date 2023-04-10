public class Program_2 {
    public static void main(String[] args){
       
    }

    public static int sum2d(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < 5; j++){
                Integer val = Integer.parseInt(arr[i][j]);
                if (val instanceof Integer)
                    sum += val;
            }
        }
        return sum;
    }

    /**
     *   Возможность получить исключения:
     *   - Если передать null вместо массива "NullPointerException"
     *   - Если length второго массива не равен 5 "ArrayIndexOutOfBoundsException"
     *   - Если элемент массива нельзя распарсить (содержит не цифровой символ)
     *     "NumberFormatException.forInputString"
     */
}
