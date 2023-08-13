import java.util.Scanner;

public class Algo5 {
            private final static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Enter a text:");
        String text=scanner.nextLine().strip();

        if(text.isBlank()){
            System.out.println("Invalid Text");
        }else{
            for(int i=(text.length()-1);i>-1;i--){
                System.out.print(text.charAt(i));
            }
        }



    }
    
}
