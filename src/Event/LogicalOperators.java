package Event;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = false;

        if(!a || b){
            System.out.println(1);
        }else if(!a || (!b&&c)){
            System.out.println(2);
        }else if(!a || b || (!b && a)){
            System.out.println(3);
        }else{
            System.out.println(4);
        }
    }
}
