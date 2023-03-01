public class Ratings {
    private final Console console = new Console();

    public int[] getRatings(){
        int skill = console.readInt("Enter the fighters skill rating: ");
        int strength = console.readInt("Enter the fighters strength rating: ");
        int agg = console.readInt("Enter the fighters aggression rating: ");
        int pow = console.readInt("Enter the fighters power rating: ");
        int stamina = console.readInt("Enter the fighters stamina rating: ");
        int cutRes = console.readInt("Enter the fighters cut resistance rating: ");
        int chin = console.readInt("Enter the fighters chin rating: ");
        int body = console.readInt("Enter the fighters body rating: ");
        int heart = console.readInt("Enter the fighters heart rating: ");
        int recovery = console.readInt("Enter the fighters recovery rating: ");
        int willpow = console.readInt("Enter the fighters willpower rating: ");
        int ki = console.readInt("Enter the fighters killer instinct rating: ");
        int iq = console.readInt("Enter the fighters IQ rating: ");
        int injuryRes = console.readInt("Enter the fighters injury resistance rating: ");
        int popularity = console.readInt("Enter the fighters popularity rating: ");
        int[] ratings = new int[15];
        ratings[0]=skill;
        ratings[1]=strength;
        ratings[2]=agg;
        ratings[3]=pow;
        ratings[4]=stamina;
        ratings[5]=cutRes;
        ratings[6]=chin;
        ratings[7]=body;
        ratings[8]=heart;
        ratings[9]=recovery;
        ratings[10]=willpow;
        ratings[11]=ki;
        ratings[12]=iq;
        ratings[13]=injuryRes;
        ratings[14]=popularity;
        return ratings;
    }
}
