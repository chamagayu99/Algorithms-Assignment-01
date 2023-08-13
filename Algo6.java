import java.util.Scanner;

public class Algo6 {
    private final static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a text:");
        String sentence=scanner.nextLine().strip();

        if(sentence.isBlank()){
            System.out.println("Invalid sentence");
        }else{
            for(int i=(sentence.length()-1);i>-1;i--){
                System.out.print(sentence.charAt(i));
            }
        }

        
    }
    
}
