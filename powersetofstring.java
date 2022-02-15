public class powersetofstring {
    public static void main(String[] args) {
        String a="abc";
        powerset(a, 0, "");
    }
    static void powerset(String a, int i, String s) {
        if(i==a.length()) {
            System.out.print(s + " ");
            return;
        }
        powerset(a,i+1,s+a.charAt(i));
        powerset(a,i+1, s);

    }
}
