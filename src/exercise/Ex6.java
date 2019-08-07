package exercise;

public class Ex6 {
    public static void main( String[] args ) {
        int x =0, y = 10;
        try {
            x/=y;
        }
//        System.out.print("/ by 0");

        catch ( Exception e){
            System.out.print("error");

        }
    }
}
