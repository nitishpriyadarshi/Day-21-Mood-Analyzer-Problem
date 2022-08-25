package Bridgelabz.Sadmood;
/*
 * @author : Nitish
 * Given “I am in Sad Mood” message Should Return SAD
 */
public class MoodAnalysrMain {
    /**
     * create a constructor ,this is default constructor name as MoodAnalyserMain
     */
    public MoodAnalyserMain() {
    }

    public String analyseMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}


