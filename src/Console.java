import java.util.Scanner;

public class Console {
    //fields
    private final Scanner SCANNER = new Scanner(System.in);

    //methods
    public  String readString(String prompt){
        System.out.print(prompt);
        return SCANNER.nextLine();
    }

    public  int readInt(String prompt){
        System.out.print(prompt);
        return SCANNER.nextInt();
    }

    public  boolean readBool(String prompt){
        System.out.print(prompt);
        return SCANNER.nextBoolean();
    }

}
