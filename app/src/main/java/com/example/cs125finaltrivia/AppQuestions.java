package com.example.cs125finaltrivia;

public class AppQuestions {

    private String mQuestions [] = {
            "What is the largest planet?",
            "Who is the President of the United States",
            "When is the last day of class",
            "When is the final project due?"
    };

    private String mChoices [][] = {
            {"Jupiter", "Earth", "Sun", "Pluto"},
            {"Hilary Clinton", "Donald Trump", "Barack Obama", "Bernie Sanders"},
            {"Thursday", "Wednesday", "first day of break", "June 3rd"},
            {"Monday", "Wednesday", "Friday", "Tuesday"}
    };

    private String mCorrectAnswers[] = {"Jupiter", "Donald Trump", "Wednesday", "Tuesday"};


    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }



    public int getLength(){
        return mQuestions.length;
    }

}
