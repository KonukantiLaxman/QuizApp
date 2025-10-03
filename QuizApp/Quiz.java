import java.util.*;

public class Quiz {
    private List<Question> questions;
    private List<Integer> userAnswers; // stores user's chosen option index (0-based)

    public Quiz(List<Question> questions) {
        if (questions == null || questions.isEmpty()) {
            throw new IllegalArgumentException("No questions provided.");
        }
        this.questions = new ArrayList<>(questions);
        this.userAnswers = new ArrayList<>(Collections.nCopies(questions.size(), -1));
    }

    public void shuffleQuestions(long seed) {
        Random rnd = new Random(seed);
        Collections.shuffle(this.questions, rnd);
    }

    public void conduct(Scanner scanner) {
        System.out.println("Welcome to the Java Quiz!");
        System.out.println("Answer each question by entering the option number.\n");

        Iterator<Question> iter = questions.iterator();
        int qIndex = 0;

        while (iter.hasNext()) {
            Question q = iter.next();
            System.out.printf("Q%d) %s%n", qIndex + 1, q.getPrompt());

            List<String> opts = q.getOptions();
            for (int i = 0; i < opts.size(); i++) {
                System.out.printf("   %d. %s%n", i + 1, opts.get(i));
            }

            int choice = readUserChoice(scanner, opts.size());
            userAnswers.set(qIndex, choice - 1); // store 0-based
            qIndex++;
            System.out.println();
        }
    }

    private int readUserChoice(Scanner scanner, int optionCount) {
        while (true) {
            System.out.print("Your answer (1-" + optionCount + "): ");
            String line = scanner.nextLine().trim();
            try {
                int c = Integer.parseInt(line);
                if (c >= 1 && c <= optionCount) return c;
                System.out.println("Please enter a number between 1 and " + optionCount + ".");
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input. Enter a number.");
            }
        }
    }

    public int calculateScore() {
        int score = 0;
        for (int i = 0; i < questions.size(); i++) {
            if (userAnswers.get(i) == questions.get(i).getCorrectIndex()) {
                score++;
            }
        }
        return score;
    }

    public void printSummary() {
        System.out.println("------------ Quiz Summary ------------");
        int total = questions.size();
        int score = calculateScore();

        for (int i = 0; i < total; i++) {
            Question q = questions.get(i);
            int user = userAnswers.get(i);
            String userAnsText = user >= 0 ? q.getOptions().get(user) : "No answer";
            String correctText = q.getCorrectOption();
            boolean correct = user == q.getCorrectIndex();

            System.out.printf("Q%d) %s%n", i + 1, q.getPrompt());
            System.out.printf("    Your answer:   %s%n", userAnsText);
            System.out.printf("    Correct answer: %s%n", correctText);
            System.out.printf("    Result: %s%n%n", correct ? "Correct" : "Incorrect");
        }

        double percent = (score * 100.0) / total;
        System.out.printf("Final Score: %d/%d (%.1f%%)%n", score, total, percent);
        System.out.println("--------------------------------------");
    }
}
