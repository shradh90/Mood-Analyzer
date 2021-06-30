package com.shradha.moodanalyzer;

public class MoodAnalyzer {
    private String message;

    //Default Constructor
    public MoodAnalyzer() {
    }

    //Parameterized Constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    //Handle Customized Exception using try-catch block
    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY , "Please enter proper message!");
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch(NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL , "Please enter proper message!");
        }
    }
}
