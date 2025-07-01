🎯 Java Number Guessing Game

This is a simple and fun console-based Number Guessing Game built in Java as part of my Java Programming Internship at Codmetric.

The game challenges the user to guess a randomly generated number between 1 and 100, giving hints and tracking attempts along the way.

📌 Project Overview

The program uses Math.random() to generate a number and takes user input using Scanner. It provides feedback like "Too low", "Too high", or "Correct!" until the user guesses the right number. Input validation ensures only numeric values are accepted, and the total number of attempts is displayed at the end.

🛠️ Features

Random number generation

Real-time user input

Input validation (only numbers allowed)

Hint feedback system

Attempt counter

💡 How It Works

A number is randomly generated between 1 and 100.

The user enters a guess.

The program responds:

"Too low" if the guess is smaller

"Too high" if the guess is larger

"Correct!" when guessed right

The total number of guesses is displayed.

🔍 Sample Output

Guess a number between 1 and 100  
Enter guess: 25  
Too low  
Enter guess: 70  
Too high  
Enter guess: 44  
Correct!  
Tries: 3

📄 Code Snapshot

int num = (int)(Math.random() * 100) + 1;
while (true) {
    System.out.print("Enter guess: ");
    if (!sc.hasNextInt()) {
        System.out.println("Invalid input.");
        sc.next();
        continue;
    }
    guess = sc.nextInt();
    tries++;
    if (guess < num)
        System.out.println("Too low");
    else if (guess > num)
        System.out.println("Too high");
    else {
        System.out.println("Correct!");
        break;
    }
}
System.out.println("Tries: " + tries);

📦 Technologies Used

Java (JDK 8+)

Scanner for user input

Math.random() for number generation

if-else, while loop, and input validation

🚀 How to Run

Copy the code to a file named GuessGame.java

Open terminal or command prompt

Compile the code:

javac GuessGame.java

Run the program:

java GuessGame

👨‍💻 Author

Tenith RajJava Programming Intern at CodmetricConnect with me on LinkedInCheck out my other projects on GitHub

📌 Tags

#Java #Internship #Codmetric #MiniProject #GuessingGame #ConsoleApp #JavaBasics #LearningByDoing

