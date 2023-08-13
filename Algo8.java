public class Algo8 {
    public static void main(String[] args) {
        
        int[] numA = new int[]{5, 7, -2, 3, 4, 6, -8};
        int[] numB = new int[]{7, 8, -8, 2, 1, -9, 6};
        int[] array1=new int[7];
        int count=0;

        for(int i=0;i<numA.length;i++){
            for(int j=0;j<numB.length;j++){
                if(numA[i]==numB[j]){
                    array1[count]=numA[i];
                    System.out.print(array1[count]+",");
                    count++;
                }
            }
        }

        System.out.println();

        for(int i=0;i<numA.length;i++){
            if(numA[i]!=numB[i]){
                System.out.print(numA[i]+",");
                System.out.print(numB[i]+",");
            }
        }

        System.out.println();

        for(int i=0;i<numA.length;i++){
           System.out.print(numA[i]-numB[i]+",");
        }

        System.out.println();

        for(int i=0;i<numA.length;i++){
           System.out.print(numB[i]-numA[i]+",");
        }

        System.out.println();

        for(int i=0;i<numA.length;i++){
           System.out.print(numA[i]*numB[i]+",");
        }

    }
    
}
