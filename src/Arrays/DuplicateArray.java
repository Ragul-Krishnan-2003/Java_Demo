package Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int [] a = {2,3,2,5,8,3,2};
        int count;
        System.out.println("Duplicate | count");
        for(int i = 0; i < a.length; i ++){
            count = 1;
            for(int j = i+1; j < a.length; j++){
                if(a[i] == a[j] && a[i] != -1){
                    count ++;
                    a[j] = -1;
                }
            }
            if(count > 1){
                System.out.println(a[i] + " " + count);
            }
        }
    }
}
