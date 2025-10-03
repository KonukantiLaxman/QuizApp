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


## 📝 Assumptions

-Each question has only one correct answer.

-Options are not shuffled (only questions are shuffled).

-Console-based interface (no GUI).

## ✅ This project is beginner-friendly and can be extended with more features like:

*Timer per question

*File-based question bank

*GUI version (Swing/JavaFX)
