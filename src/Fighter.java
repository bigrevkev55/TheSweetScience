public class Fighter {
    //fields
    private String lname, fname, nname, style, prefightTraits, fightTraits, agingEffects;
    private int skill, strength, agg, pow, stamina, cutRes, chin, body, heart, recovery, willpow, ki, iq, injuryRes, popularity;

    //constructor
    public Fighter(String[] stringArray, int[] intArray){
        this.lname = stringArray[0];
        this.fname = stringArray[1];
        this.nname = stringArray[2];
        this.style = stringArray[3];
        this.prefightTraits = stringArray[4];
        this.fightTraits = stringArray[5];
        this.agingEffects = stringArray[6];
        this.skill = intArray[0];
        this.strength = intArray[1];
        this.agg = intArray[2];
        this.pow = intArray[3];
        this.stamina = intArray[4];
        this.cutRes = intArray[5];
        this.chin = intArray[6];
        this.body = intArray[7];
        this.heart = intArray[8];
        this.recovery = intArray[9];
        this.willpow = intArray[10];
        this.ki = intArray[11];
        this.iq = intArray[12];
        this.injuryRes = intArray[13];
        this.popularity = intArray[14];
    }


    /*public Fighter(String lname, String fname, String nname, String style, String prefightTraits, String fightTraits, String agingEffects, int skill, int strength, int agg, int pow, int stamina, int cutRes, int chin, int body, int heart, int recovery, int willpow, int ki, int iq, int injuryRes, int popularity) {
        this.lname = lname;
        this.fname = fname;
        this.nname = nname;
        this.style = style;
        this.prefightTraits = prefightTraits;
        this.fightTraits = fightTraits;
        this.agingEffects = agingEffects;
        this.skill = skill;
        this.strength = strength;
        this.agg = agg;
        this.pow = pow;
        this.stamina = stamina;
        this.cutRes = cutRes;
        this.chin = chin;
        this.body = body;
        this.heart = heart;
        this.recovery = recovery;
        this.willpow = willpow;
        this.ki = ki;
        this.iq = iq;
        this.injuryRes = injuryRes;
        this.popularity = popularity;
    } */


    //methods

    public void printFighterReport(){
        System.out.println(("------------------------"));
        System.out.println("First Name:\t"+ getFname());
        System.out.println("Last Name:\t"+ getLname());
        System.out.println("Nickname:\t"+ getNname());
        System.out.println("Style:\t\t"+ getStyle());
        System.out.println("End of test, see 'getFighterReport' method in the 'Fighter' class to finish this report");

    }
    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getPrefightTraits() {
        return prefightTraits;
    }

    public void setPrefightTraits(String prefightTraits) {
        this.prefightTraits = prefightTraits;
    }

    public String getFightTraits() {
        return fightTraits;
    }

    public void setFightTraits(String fightTraits) {
        this.fightTraits = fightTraits;
    }

    public String getAgingEffects() {
        return agingEffects;
    }

    public void setAgingEffects(String agingEffects) {
        this.agingEffects = agingEffects;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgg() {
        return agg;
    }

    public void setAgg(int agg) {
        this.agg = agg;
    }

    public int getPow() {
        return pow;
    }

    public void setPow(int pow) {
        this.pow = pow;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getCutRes() {
        return cutRes;
    }

    public void setCutRes(int cutRes) {
        this.cutRes = cutRes;
    }

    public int getChin() {
        return chin;
    }

    public void setChin(int chin) {
        this.chin = chin;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getHeart() {
        return heart;
    }

    public void setHeart(int heart) {
        this.heart = heart;
    }

    public int getRecovery() {
        return recovery;
    }

    public void setRecovery(int recovery) {
        this.recovery = recovery;
    }

    public int getWillpow() {
        return willpow;
    }

    public void setWillpow(int willpow) {
        this.willpow = willpow;
    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getInjuryRes() {
        return injuryRes;
    }

    public void setInjuryRes(int injuryRes) {
        this.injuryRes = injuryRes;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }
}

