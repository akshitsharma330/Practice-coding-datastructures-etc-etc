import java.util.*;
public class permutationsArr {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        List<List<Integer>> permutations = new ArrayList<>();
        permute(nums);
        for()
        
    }

    
    public static List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> allPermutations= new ArrayList<>();
            List<Integer> set= new ArrayList<>();
            helper(0,nums.length,allPermutations,nums);
            return allPermutations;       
            
        }
        public static void swap(int i, int j, int[] nums){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        public static void helper(int l, int r, List<List<Integer>> allPermutations, int[] nums){
            if(l==r){
                save(nums, allPermutations);
                
                return;
            }
            for(int i=0;i<l;i++){
                swap(l,i,nums);
                helper(l+1,i,allPermutations,nums);
                swap(l,i,nums);
            }
            
        }
        public static void save(int nums[], List<List<Integer>> allPermutations){
            List<Integer> newNums=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                System.out.print(nums[i]);
                newNums.add(nums[i]);
            }
            allPermutations.add(newNums);
        }
        
    }
    
