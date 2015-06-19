//import sun.applet.Main;
//
import java.io.BufferedReader;
import java.util.Scanner;

/**
 * Created by bill on 6/10/15.
 */
public class MainController {


    public static void main(String[] args) {

        MultipleChoiceQuestion mcq = new MultipleChoiceQuestion("The first several parts of code that you write should include in order: (answer with letter)",
                "a",
                "a) include libraries, a main function, declaring variables, print function, input function",
                "b) main, library, variables, print and input",
                "c) library, print and input, variables, main",
                "d) library, variables, print and input, library");

//        include libraries, a main function, declaring variables, print function, input function

        //public static void main(String[] args) {
        MultipleChoiceQuestion mcq2 = new MultipleChoiceQuestion("Question 2: Order the following correctly:",
                "c",
                "a) if, else, if else, print",
                "b) print, if, else",
                "c) if, print, else, if else",
                "d) else, if else, else");

        Lesson lessonConditional = new Lesson("conditionals.txt", mcq, mcq2);

        lessonConditional.displayFile();

        for (int i = 0; i < 2; i++) {
            lessonConditional.displayQuestion(i);
            // mcq.displayQuestion();
            while (!lessonConditional.getQuestionArray()[i].checkAnswer(lessonConditional.getUserAnswer())) {
                System.out.println("Answer incorrect.  Please review Section and try again.");
                lessonConditional.displayNote(i);
                //display notes that are relevant to question
                lessonConditional.displayQuestion(i);
                //display question again
                //check again
            }
            //mcq.checkAnswer(lessonConditional.getUserAnswer());
        }

        MultipleChoiceQuestion loopq1 = new MultipleChoiceQuestion("Loops Question 1: Scanf(\"%d\",&n) stands for",
                "b",
                "a) user input, variable, input",
                "b) user input, input, variable",
                "c) input, variable, user input",
                "d) variable, input, user input");

        //public static void main(String[] args) {
        MultipleChoiceQuestion loopq2 = new MultipleChoiceQuestion("Loops Question 2: The three elements of a for loop are?:",
                "d",
                "a) test, update, initialization",
                "b) update, initialization, test",
                "c) update, test, initialization",
                "d) initialization, test, update");

        Lesson lessonLoops = new Lesson("forloops.txt", loopq1, loopq2);

        lessonLoops.displayFile();

        for (int i = 0; i < 2; i++) {
            lessonLoops.displayQuestion(i);
            // mcq.displayQuestion();
            while (!lessonLoops.getQuestionArray()[i].checkAnswer(lessonLoops.getUserAnswer())) {
                System.out.println("Answer incorrect.  Please review Section and try again.");
                lessonLoops.displayNote(i);
                //display notes that are relevant to question
                lessonLoops.displayQuestion(i);
                //display question again
                //check again
            }
        }

        MultipleChoiceQuestion whileLoopsq1 = new MultipleChoiceQuestion
                ("WhileLoops Question 1: What are the two variables in this program?",
                "c",
                "a) number, print",
                "b) factorial, scanf",
                "c) nmber, factorial",
                "d) main, include");

        //public static void main(String[] args) {
        MultipleChoiceQuestion whileLoopsq2 = new MultipleChoiceQuestion
                ("WhileLoops Question 2: Describe a while loop.",
                "b",
                "a) number, factorial",
                "b) while, do something",
                "c) do something, while",
                "d) \"Factorial=%d\",factorial");

        Lesson lessonWhileLoops = new Lesson("whileloops.txt", whileLoopsq1, whileLoopsq2);

        lessonWhileLoops.displayFile();

        for (int i = 0; i < 2; i++) {
            lessonWhileLoops.displayQuestion(i);
            // mcq.displayQuestion();
            while (!lessonWhileLoops.getQuestionArray()[i].checkAnswer(lessonWhileLoops.getUserAnswer())) {
                System.out.println("Answer incorrect.  Please review Section and try again.");
                lessonLoops.displayNote(i);
                //display notes that are relevant to question
                lessonLoops.displayQuestion(i);
                //display question again
                //check again
            }
        }

        MultipleChoiceQuestion doWhileLoopsq1 = new MultipleChoiceQuestion(
                "DoWhileLoops Question 1: What is the first part of the doWhile process?:",
                "a",
                "a) Have the user enter a number",
                "b) int main",
                "c declare variables",
                "d int sum=0");

        //public static void main(String[] args) {
        MultipleChoiceQuestion doWhileLoopsq2 = new MultipleChoiceQuestion(
                "DoWhileLoops Question 2: When will your doWhile loop stop running?:",
                "a",
                "a) when num=0",
                "b) when user stops entering numbers",
                "c) when program prints the sum",
                "d) when num !=0");

        Lesson lessonDoWhileLoops = new Lesson("dowhileloops.txt", doWhileLoopsq1, doWhileLoopsq2);

        lessonDoWhileLoops.displayFile();

        for (int i = 0; i < 2; i++) {
            lessonDoWhileLoops.displayQuestion(i);
            // mcq.displayQuestion();
            while (!lessonDoWhileLoops.getQuestionArray()[i].checkAnswer(lessonLoops.getUserAnswer())) {
                System.out.println("Answer incorrect.  Please review Section and try again.");
                lessonDoWhileLoops.displayNote(i);
                //display notes that are relevant to question
                lessonDoWhileLoops.displayQuestion(i);
                //display question again
                //check again
            }
        }

        MultipleChoiceQuestion  functionsQ1 = new MultipleChoiceQuestion(
                "Functions Question 1: Describe function prototype declaration.",
                "a",
                "a) int add(int a, int b);",
                "b) scanf(\"%d %d\",&num1,&num2);",
                "c) sum=add(num1,num2);",
                "d) printf(\"sum=%d\",sum);");

        //public static void main(String[] args) {
        MultipleChoiceQuestion functionsQ2 = new MultipleChoiceQuestion(
                "Functions Question 2: What is function declarator?:",
                "d",
                "a)  int add;",
                "b) add=a+b;",
                "c) return add;",
                "d) int add(int a,int b) ");

        Lesson lessonFunctions = new Lesson("functions.txt", functionsQ1, functionsQ2);

        lessonFunctions.displayFile();

        for(int i = 0; i < 2; i++) {
            lessonFunctions.displayQuestion(i);
            // mcq.displayQuestion();
            while (!lessonFunctions.getQuestionArray()[i].checkAnswer(lessonLoops.getUserAnswer())) {
                System.out.println("Answer incorrect.  Please review Section and try again.");
                lessonFunctions.displayNote(i);
                //display notes that are relevant to question
                lessonFunctions.displayQuestion(i);
                //display question again
                //check again
            }
        }


    }
}





