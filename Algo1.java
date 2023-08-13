import java.util.Scanner;

public class Algo1{
        private final static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {


        System.out.print("Enter a number:");
        int input=scanner.nextInt();
        scanner.nextLine();

        int i=0;
        int j=1;
        int newi=0;
        boolean flag=true;

        System.out.print(0+","+1+",");

        if(input>0){
            do{
                newi=i+j;

                if(newi<input){
                    i=j;
                    j=newi;
                    System.out.print(newi+",");
                }else{
                    flag=false;
                }
            }while(flag);
        }else{
            System.out.println("invalid number");
        }
        
        
    }
}