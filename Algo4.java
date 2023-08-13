public class Algo4 {
    public static void main(String[] args) {

        int[] nums = new int[]{10, 20, 30, 40, 50};

        System.out.print("[ ");
        for(int i=0,j=nums.length-1;i<nums.length;i++,j--){
            nums[i]=nums[j];
            System.out.print(nums[i]+",");
        }
        System.out.print(" ]");

        
    }
    
}
