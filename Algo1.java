import java.util.Scanner;

public class Algo1{
        private final static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {


        System.out.print("Enter a number:");
        int input=scanner.nextInt();
        scanner.nextLine();

        int i=0;

        if(input>0){
            do{
                System.out.print(i+",");
                i++;
            }while(i<input+1);
        }else{
            System.out.println("invalid number");
        }
        
        
    }
}