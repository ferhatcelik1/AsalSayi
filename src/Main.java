public class Main {

    public static void main(String[] args) {
        int f;

        int j;

        for (f = 2; f <= 100; f++) {
            int counter = 0;

            for (j = 1; j <= f; j++) {

                if (f % j == 0) {
                    counter++;
                }
            }
            if (counter <= 2) {
                System.out.println(f);
            }
        }
    }
}
