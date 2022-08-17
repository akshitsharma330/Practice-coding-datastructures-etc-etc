public class permutaionofstring2 {
    static void permut(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String newString= str.substring(0,i)+str.substring(i+1);
            permut(newString, permutation+ch);
        }

    }
    public static void main(String[] args){
        permut("abc","");

    }
    
}
