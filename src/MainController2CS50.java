/**
 * Created by bill on 6/22/15.
 */
public class MainController2CS50 {


    public static void main(String[] args) {

        MultipleChoiceQuestion cs50q1 = new MultipleChoiceQuestion("Question 1: %d is simply syntax for: (answer with letter)",
                "a",
                "a) printing an integer",
                "b) printing a decimel",
                "c) percent of d",
                "d) something else");

//        include libraries, a main function, declaring variables, print function, input function

        //public static void main(String[] args) {
        MultipleChoiceQuestion cs50q2 = new MultipleChoiceQuestion("Question 2: stuff inside the parentheses, arguments, are:",
                "c",
                "a) what we print",
                "b) comments to help us",
                "c) what we pass in to functions",
                "d) something else");

        Lesson lessonCS50Lecture = new Lesson("cs50Lecture.txt", cs50q1, cs50q2);

        lessonCS50Lecture.displayFile();

        for (int i = 0; i < 2; i++) {
            lessonCS50Lecture.displayQuestion(i);
            // mcq.displayQuestion();
            while (!lessonCS50Lecture.getQuestionArray()[i].checkAnswer(lessonCS50Lecture.getUserAnswer())) {
                lessonCS50Lecture.displayNote(i);
                //display notes that are relevant to question
                System.out.println("\nAnswer incorrect.  Please review Section above and try again.");
                lessonCS50Lecture.displayQuestion(i);
                //display question again
                //check again
            }
            //mcq.checkAnswer(lessonConditional.getUserAnswer());
        }

        MultipleChoiceQuestion pset1 = new MultipleChoiceQuestion
                ("Pset1 Question 1: The commands for changing your directory in the terminal, and seeing what files are in a directory," +
                        "are, respectively:",
                        "c",
                        "a) cd, fd",
                        "b) fd, cd",
                        "c) cd, ls",
                        "d) cd, sd");

        //public static void main(String[] args) {
        MultipleChoiceQuestion pset2 = new MultipleChoiceQuestion
                ("Pset1 Question 2: When you run your program and get an error message, before asking an instructor you should:",
                        "d",
                        "a) read the error message closely",
                        "b) pay particular attention to the red in the error message",
                        "c) try to understand what the error message is saying",
                        "d) all the above");

        Lesson lessonPset1 = new Lesson("cs50Pset1.txt", pset1, pset2);

        lessonPset1.displayFile();

        for (int i = 0; i < 2; i++) {
            lessonPset1.displayQuestion(i);
            // mcq.displayQuestion();
            while (!lessonPset1.getQuestionArray()[i].checkAnswer(lessonPset1.getUserAnswer())) {
                lessonPset1.displayNote(i);
                //display notes that are relevant to question
                System.out.println("\nAnswer incorrect.  Please review Section above and try again.");
                lessonPset1.displayQuestion(i);
                //display question again
                //check again
            }
        }

    }
}
