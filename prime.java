public class prime {
    public static void main(String[] args) {
        int a=4;
        boolean flag = false;
        for(int i=2;i*i<=a;i++)
        {
            if((a%i)==0)
            {
//                System.out.println("int if");
                flag = true;
                break;

            }

        }
        if(flag)
        {
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }
    }
}
