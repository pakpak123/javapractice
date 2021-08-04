package lab02;

public class EXTRA {
    public static void main(String[] args) {
    int c = 1;
    int i;
    int j = 1;
    int k = 3;
    for (i  = 1; i <= 10 ; i++) {
    if (i % 2 == 0) {
            System.out.print(j + " ");
            j = j + 2 * c;
            c++;
        }
        if (i >= 2 && i % 2 == 0) {
            System.out.print(k + " ");
            k += 3;
        }
    }
    }
}
