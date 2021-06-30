package com.shradha.moodanalyzer;

public class MoodAnalyzerTest {
    @Test
    public void testMoodAnalysis_whenMoodIsSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a sad message");
        String mood = null;
        try {
            mood = moodAnalyzer.analyseMood();
            Assert.assertEquals("SAD" , mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    /**
     * Purpose : Analyse mood by passing the message in the constructor
     * Input message: This is a happy message
     * @return : HAPPY
     */

    @Test
    public void testMoodAnalysis_whenMoodIsHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a happy message");
        String mood = null;
        try {
            mood = moodAnalyzer.analyseMood();
            Assert.assertEquals("HAPPY" , mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    /**
     * Purpose : Custom Exception if User Provides Invalid Mood
     * Input message: null
     * @return : custom exception message is null
     */

    @Test
    public void testMoodAnalysis_whenMoodIsNull_ShouldThrowException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    /**
     * Purpose : Custom Exception if User Provides Invalid Mood
     * Input message: empty
     * @return : custom exception message is empty
     */

    @Test
    public void testMoodAnalysis_whenMoodIsEmpty_ShouldThrowException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY , e.type);
        }
    }
}
