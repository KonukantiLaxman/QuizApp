import java.util.*;

public class Question {
    private String prompt;
    private List<String> options;
    private int correctIndex; // 0-based index of correct answer

    public Question(String prompt, List<String> options, int correctIndex) {
        if (options == null || options.size() < 2) {
            throw new IllegalArgumentException("Provide at least 2 options.");
        }
        this.prompt = prompt;
        this.options = new ArrayList<>(options);
        this.correctIndex = correctIndex;
    }

    public String getPrompt() { return prompt; }
    public List<String> getOptions() { return Collections.unmodifiableList(options); }
    public int getCorrectIndex() { return correctIndex; }
    public String getCorrectOption() { return options.get(correctIndex); }
}
