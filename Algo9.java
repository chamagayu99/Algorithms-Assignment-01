import java.util.Scanner;

public class Algo9 {
    private final static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {

        do{
            System.out.print("Enter a word:");
            String word=scanner.next();
            if(!scanner.nextLine().trim().isEmpty()) continue;

            System.out.println(word);
        }while(true);
        

    }
    
}
