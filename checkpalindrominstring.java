public class checkpalindrominstring {
    public static void main(String[] args) {
        String str = "madamn";
        boolean result = check(str,0,str.length()-1);
        if(result){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
    static boolean check(String str, int l, int r) {
        if(l==r || l>r)
        {
             return true;
        }
        if(str.charAt(l)!=str.charAt(r))
        {
            return false;
        }
        return check(str,l+1,r-1);

    }
}
