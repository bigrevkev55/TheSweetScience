import java.util.Scanner;

public class Console {
    //fields
    private Scanner scanner = new Scanner(System.in);

    //methods
    public  String readString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public  int readInt(String prompt){
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public  boolean readBool(String prompt){
        System.out.print(prompt);
        return scanner.nextBoolean();
    }

}
