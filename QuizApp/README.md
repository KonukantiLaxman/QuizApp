## 📘 Java Quiz Application
## 📌 Overview

This is a simple console-based Quiz Application built in Java.
It presents multiple-choice questions (MCQs) related to Java concepts like loops, collections, and OOP basics.

The user can:

Answer one question at a time

Validate input (ensures only valid choices are accepted)

Shuffle questions (optional)

View a detailed summary of their answers at the end

Get their final score & percentage

## ✨ Features

📑 Predefined quiz questions (Java topics: loops, collections, iterators, etc.)

🎯 One question displayed at a time with 4 options

✅ Input validation (accepts only numbers within range)

🔀 Option to shuffle questions using Collections.shuffle()

📊 Final summary report:

Correct answers

User’s chosen answers

Final score & percentage

## 🛠️ Project Structure
QuizApp/
│
├── Main.java        // Entry point, creates quiz and runs it
├── Quiz.java        // Manages quiz logic, scoring, summary
└── Question.java    // Represents a single question

## ▶️ How to Compile & Run

Open terminal (or Git Bash) in the project folder.

1. Compile all files:

javac *.java


2.Run the main class:

java Main


## Output:

![alt text](<Screenshot 2025-10-03 150513.png>)

![alt text](<Screenshot 2025-10-03 150529.png>)

## 💻 Example Usage
Do you want to shuffle questions? (y/n): y
Questions shuffled!

Q1) Which Java loop guarantees execution of the loop body at least once?
   1. for loop
   2. while loop
   3. do-while loop
   4. enhanced for loop
Your answer (1-4): 3

Q2) Which collection allows duplicates and maintains insertion order?
   1. HashSet
   2. TreeSet
   3. ArrayList
   4. HashMap
Your answer (1-4): 3

------------ Quiz Summary ------------
Q1) Which Java loop guarantees execution of the loop body at least once?
    Your answer: do-while loop
    Correct answer: do-while loop
    Result: Correct

Q2) Which collection allows duplicates and maintains insertion order?
    Your answer: ArrayList
    Correct answer: ArrayList
    Result: Correct

## Final Score: 2/2 (100.0%)
--------------------------------------

## 🧩 OOP Concepts Used

1.Encapsulation

Question class hides its data (prompt, options, correct answer) behind getters.

2.Abstraction

Question abstracts a real-world quiz question.

Quiz abstracts quiz management (asking, scoring, summary).

3.Composition

Quiz has a list of Question objects.

4.Polymorphism (demonstrated indirectly)

Enhanced for-loops & Iterators (Iterable interface) allow us to iterate different collection types uniformly.

5.Exception Handling

Input validation with try-catch for invalid number inputs.

6.Collections Framework

ArrayList to store questions and answers.

Collections.shuffle() to randomize questions.

## 📝 Assumptions

-Each question has only one correct answer.

-Options are not shuffled (only questions are shuffled).

-Console-based interface (no GUI).

## ✅ This project is beginner-friendly and can be extended with more features like:

*Timer per question

*File-based question bank

*GUI version (Swing/JavaFX)