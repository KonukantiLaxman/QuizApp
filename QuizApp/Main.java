import java.util.*;

public class Main {

    private static List<Question> createSampleQuestions() {
        List<Question> list = new ArrayList<>();

        list.add(new Question(
            "Which Java loop guarantees execution of the loop body at least once?",
            Arrays.asList("for loop", "while loop", "do-while loop", "enhanced for loop"),
            2
        ));

        list.add(new Question(
            "What is the main benefit of the enhanced for-loop?",
            Arrays.asList("Works with Streams only", "Simplifies iteration", "Allows modifying collection size", "Automatically parallelizes loop"),
            1
        ));

        list.add(new Question(
            "Which collection allows duplicates and maintains insertion order?",
            Arrays.asList("HashSet", "TreeSet", "ArrayList", "HashMap"),
            2
        ));

        list.add(new Question(
            "Which interface is used to iterate through a Collection?",
            Arrays.asList("Iterable", "Iterator", "ListIterator", "Enumeration"),
            1
        ));

        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Question> questions = createSampleQuestions();

        Quiz quiz = new Quiz(questions);

        System.out.print("Do you want to shuffle questions? (y/n): ");
        String shuffleChoice = scanner.nextLine().trim().toLowerCase();
        if (shuffleChoice.equals("y") || shuffleChoice.equals("yes")) {
            quiz.shuffleQuestions(System.currentTimeMillis());
            System.out.println("Questions shuffled!\n");
        }

        quiz.conduct(scanner);
        quiz.printSummary();

        scanner.close();
    }
}
