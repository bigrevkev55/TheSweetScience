
public class Main {
    public static void main(String[] args) {
        Traits traits = new Traits();
        Ratings ratings = new Ratings();

        //prompt user to enter fighter traits and attributes to use as parameters for instantiation
        System.out.println("\nEnter fighter one's information");
        System.out.println("--------------------------------------");
        String[] fighter1Traits = traits.getTraits();
        int[] fighter1Ratings = ratings.getRatings();

        System.out.println("\nNow enter fighter two's information");
        System.out.println("--------------------------------------");
        String[] fighter2Traits = traits.getTraits();
        int[] fighter2Ratings = ratings.getRatings();

        //create instance of the fighter using the variables above as parameters
        var fighter1 = new Fighter(fighter1Traits,fighter1Ratings);
        var fighter2 = new Fighter(fighter2Traits,fighter2Ratings);

        //print report for each fighter
        System.out.println("\nFighter One's Report:");
        fighter1.printFighterReport();

        System.out.println("\nFighter Two's Report:");
        fighter2.printFighterReport();

    }
}