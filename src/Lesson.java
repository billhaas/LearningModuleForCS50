import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by bill on 6/15/15.
 */
public class Lesson {
    private String fileName;
//    private Question question1;
//    private Question question2;
    //Question question3;

    private int arrayLength = 2;
    private Question[] questionArray = new Question[arrayLength];
    private String[] noteArray = new String[arrayLength];


//    int i;
//    public Questionfor (i = 0; i < arrayLength; i++){
//
//        Question[] questionArray.displayQuestion();
//        checkAnswer(lessonConditional.getUserAnswer());
//    }

    public Lesson (String fileName, Question question1, Question question2) //Question question2, Question question3)
    {
        this.fileName = fileName;
//        this.question1 = question1;
//        this.question2 = question2;
        this.questionArray[0] = question1;
        this.questionArray[1] = question2;
        noteArray[0] = "";
        noteArray[1] = "";

        BufferedReader reader = null;
//        /Users/bill/Documents/LearningModuleForCS50/src/conditionals.txt
        try {
            File file = new File("/Users/bill/Documents/LearningModuleForCS50/src/"+fileName);
            reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                noteArray[0] = noteArray[0] + "\n" + line;
//                System.out.println(line);
            }

            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                noteArray[1] = noteArray[1] + "\n" + line;
//                System.out.println(line);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Question[] getQuestionArray() {
        return questionArray;
    }

    public void displayFile() {
        System.out.println(noteArray[0]);
        System.out.println(noteArray[1]);
    }

    public void displayNote(int section) {
        System.out.println(noteArray[section]);
    }

    public void displayQuestion(int section){
        questionArray[section].displayQuestion();
    }

    public String getUserAnswer(){
        Scanner s = new Scanner(System.in);
        String userAnswer = s.next();
        return userAnswer;
    }

}

