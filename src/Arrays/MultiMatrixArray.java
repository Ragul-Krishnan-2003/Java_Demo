package Arrays;

public class MultiMatrixArray {
    public static void main(String[] args) {
        int [] [] arr = new int [3] [3];
        arr[0] [0] = 5;
        arr[0] [1] = 10;
        arr[0] [2] = 15;
        arr[1] [0] = 20;
        arr[1] [1] = 25;
        arr[1] [2] = 30;
        arr[2] [0] = 12;
        arr[2] [1] = 13;
        arr[2] [2] = 23;

        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr[i] . length; j ++){
                System.out.println(" a ["+i+"] ["+j+"] = " + arr[i] [j]);
            }
        }
    }
}
