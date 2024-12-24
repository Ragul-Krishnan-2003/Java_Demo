package Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr ={66,12,184,2,30,36,54,99};
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n- i- 1; j++){
                if(arr[j] > arr[j + 1]){
                    //swap arr[j] and arr[j +1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array");
        for(int i = 0; i < n; i ++){
            System.out.println(arr[i] + " ");
        }
    }
}
