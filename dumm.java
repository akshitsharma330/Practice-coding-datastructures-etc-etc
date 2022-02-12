public class dumm {
    public static void main(String[] args) {
        int res = 4;
        int n = 1;
        while ((res & n) == 0) {
            n = n << 1;
        }
        System.out.println(n);

    }
}