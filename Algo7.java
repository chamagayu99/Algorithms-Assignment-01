import java.util.Scanner;

public class Algo7 {
    private final static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a text:");
        String sentence=scanner.nextLine().strip();
        int count=0;

        if(sentence.isBlank()){
            System.out.println("Invalid sentence");
        }else{
            loop:
            for(int i=0;i<sentence.length();i++){
                if(sentence.charAt(i)!=' ')
                count=++count;
                else{
                    continue loop;
                }
            }
        }
        
    }
    
}
