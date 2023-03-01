import java.util.Scanner;
public class Traits {
    private Console console = new Console();

    public String[] getTraits(){
        String lname = console.readString("Enter the fighters last name: ");
        String fname = console.readString("Enter the fighters first name: ");
        String nname = console.readString("Enter the fighters nickname name: ");
        String style = console.readString("Enter the fighters fighting style: ");
        String prefightTraits = console.readString("Enter the fighters prefight traits: ");
        String fightTraits = console.readString("Enter the fighters fight traits: ");
        String agingEffects = console.readString("Enter the fighters aging effects: ");
        String[] traits = new String[7];
        traits[0]=lname;
        traits[1]=fname;
        traits[2]=nname;
        traits[3]=style;
        traits[4]=prefightTraits;
        traits[5]=fightTraits;
        traits[6]=agingEffects;
        return traits;
    }
}
