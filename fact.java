public class fact {
    public static void main(String[] args) {
        int a=10;
        System.out.println("Factorial of "+a+" is "+factorial(a));
    }
    static int factorial(int n){
        if(n==1)
            return 1;
        else
            return n*factorial(n-1);
    }

}
