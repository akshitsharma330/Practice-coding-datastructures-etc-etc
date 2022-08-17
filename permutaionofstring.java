public class permutaionofstring {
    static void swap(StringBuilder str, int i, int j){
        char temp = str.charAt(i);
        str.setCharAt(i,str.charAt(j));
        str.setCharAt(j,temp);


    }
    static void permut(StringBuilder str, int l, int r){
        if(l==r){
            System.out.println(str);
            return;
        }
        for(int i=l;i<r;i++){
            swap(str,l,i);
            permut(str,l+1,r);
            swap(str,l,i);
        }
        
    }
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("abcd");
        permut(str,0,str.length());
        

    }
}
