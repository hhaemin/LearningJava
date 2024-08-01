package mission;

public class Star {
    public static void main(String[] args) {
        int size = 5;

        for (int i=1; i<=size; i++){
            for (int j=size; j>i; j--){
                System.out.print(" ");
            }
            for(int k=1; k <=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=size-1; i>=1; i--){
            for (int j=size; j>i; j--){
                System.out.print(" ");
            }
            for(int k=1; k <=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
