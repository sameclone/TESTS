package serializable.quizgame;

import java.io.Serializable;

/**
 * Created by yevgeniya.zuyeva on 21.12.2016.
 */
public class QuizCard implements Serializable {
    private String question;
    private String answer;

    public QuizCard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion(){
        return question;
    }

    public String getAnswer(){
        return answer;
    }

}
