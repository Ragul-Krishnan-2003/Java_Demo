package patterns;

public class Pyramid {
    public static void main(String[] args) {
        int n = 5;
        int blank = n-1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= blank; j++){
                System.out.print(" ");
            }
            blank--;
            for(int j = 1; j <= 2 * i -1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
