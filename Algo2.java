public class Algo2 {
    public static void main(String[] args) {
        
        int[] nums = new int[]{-5, 2, 7, 10, 58, -7, 8, 23} ;
        int largest=0;

        for(int i=0; i< nums.length; i++){
            for(int k=0, j=1;j<nums.length;j++){
            if(nums[k]>nums[j]){
                    nums[k]=nums[k];
                    System.out.println(nums[k]);
            }else{
                nums[k]=nums[j];
                System.out.println(nums[k]);
            }
                
            }
        }
    }
    
}
