public class Algo3 {
    public static void main(String[] args) {
        
        int[] nums = {10, 20, 30, 40, 50};
        int[] newArray=new int[nums.length];
        int j=nums.length-1;

        for(int i=0;i<nums.length;i++){
            newArray[j]=nums[i];
            j=--j;
        }

        nums=newArray;

        System.out.print("[");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
        System.out.print("] \n");
    }
    
}
