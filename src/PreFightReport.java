import java.util.Locale;
import java.util.Objects;

public class PreFightReport {
    //fields
    private int adjSkill;

    private int adjStrength;
    private int adjAgg;
    private int adjPow;
    private int adjStamina;
    private int adjCutRes;
    private int adjChin;
    private int adjBody;
    private int adjHeart;
    private int adjRecovery;
    private int adjWillpower;
    private int adjKi;
    private int adjIq;
    private int adjInjuryRes;
    private int adjPopularity;

    //constructor
    public PreFightReport(int adjSkill, int adjStrength, int adjAgg, int adjPow, int adjStamina,
                          int adjCutRes, int adjChin, int adjBody, int adjHeart, int adjRecovery,
                          int adjWillpower, int adjKi, int adjIq, int adjInjuryRes, int adjPopularity) {
        this.adjSkill = getAdjSkill();
        this.adjStrength = adjStrength;
        this.adjAgg = adjAgg;
        this.adjPow = adjPow;
        this.adjStamina = adjStamina;
        this.adjCutRes = adjCutRes;
        this.adjChin = adjChin;
        this.adjBody = adjBody;
        this.adjHeart = adjHeart;
        this.adjRecovery = adjRecovery;
        this.adjWillpower = adjWillpower;
        this.adjKi = adjKi;
        this.adjIq = adjIq;
        this.adjInjuryRes = adjInjuryRes;
        this.adjPopularity = adjPopularity;
    }

    //accessors and mutators
    public int getAdjSkill(int skill, String boxingStyle, String oppBoxingStyle) {
        return setAdjSkill(skill, boxingStyle, oppBoxingStyle);
    }
    private int setAdjSkill(int skill, String boxingStyle, String oppBoxingStyle) {
        switch (boxingStyle.toLowerCase()) {
            case "boxer" -> {
                if (oppBoxingStyle.equalsIgnoreCase("puncher")) {
                    this.adjSkill = skill + 1;
                } else if (oppBoxingStyle.equalsIgnoreCase("spoiler")) {
                    this.adjSkill = skill - 1;
                } else if (oppBoxingStyle.equalsIgnoreCase("swarmer")) {
                    this.adjSkill = skill - 1;
                } else {
                    this.adjSkill = skill;
                }
            }
            case "boxer/puncher" -> {
                if (oppBoxingStyle.equalsIgnoreCase("puncher")) {
                    this.adjSkill = skill + 1;
                } else if (oppBoxingStyle.equalsIgnoreCase("swarmer")) {
                    this.adjSkill = skill + 1;
                } else {
                    this.adjSkill = skill;
                }
            }
            case "puncher" -> {
                if (oppBoxingStyle.equalsIgnoreCase("boxer") || oppBoxingStyle.equalsIgnoreCase("boxer/puncher")
                        || oppBoxingStyle.equalsIgnoreCase("spoiler")) {
                    this.adjSkill = skill - 1;
                } else if (oppBoxingStyle.equalsIgnoreCase("swarmer")) {
                    this.adjSkill = skill + 1;
                } else {
                    this.adjSkill = skill;
                }
            }
            case "spoiler" -> {
                if (oppBoxingStyle.equalsIgnoreCase("boxer") || oppBoxingStyle.equalsIgnoreCase("puncher")
                        || oppBoxingStyle.equalsIgnoreCase("spoiler")) {
                    this.adjSkill = skill + 1;
                } else {
                    this.adjSkill = skill;
                }
            }
            case "swarmer" -> {
                if (oppBoxingStyle.equalsIgnoreCase("boxer/puncher") || oppBoxingStyle.equalsIgnoreCase("puncher")
                        || oppBoxingStyle.equalsIgnoreCase("spoiler")) {
                    this.adjSkill = skill - 1;
                } else if (oppBoxingStyle.equalsIgnoreCase("boxer")) {
                    this.adjSkill = skill + 1;
                } else {
                    this.adjSkill = skill;
                }
            }
        }
        return skill;
    }
}





