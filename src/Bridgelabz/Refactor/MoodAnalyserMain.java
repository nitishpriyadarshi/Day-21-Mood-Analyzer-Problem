package Bridgelabz.Refactor;
/*
 * @author : Nitish
 * Refactor the code to take the mood message in Constructor
 */

public class MoodAnalyserMain {
    private String message;
    /**
     * create a constructor ,this is default constructor name as MoodAnalyserMain
     */
    public MoodAnalyserMain() {
    }

    public MoodAnalyserMain(String message) {
        this.message=message;
    }
    public String analyseMood() {
        if (this.message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
