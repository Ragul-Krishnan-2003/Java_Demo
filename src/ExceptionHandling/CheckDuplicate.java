package ExceptionHandling;
class DuplicateException extends Exception{
    DuplicateException(String s){
        super(s);
    }
}
public class CheckDuplicate {
    static void validate (int [] arr) throws DuplicateException{
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    throw new DuplicateException("The array has duplicate element" + arr[i]);
                }
            }
        }

    }
    public static void main(String[] args) {
        try{
            int[] a ={1,2,2,3};
            validate(a);
        }catch(Exception e){
           System.out.println(e);
        }
    }
}
