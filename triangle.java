public class triangle {
    public static void main(String[] args) {

        int levels = 4;


        for (int i = 1; i <= levels; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
