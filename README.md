# Number Guessing Game

A simple Java-based number guessing game where the user can set their own range for the guessing challenge.

## Features
- User-defined range for the guessing game
- Input validation to ensure valid range
- Feedback on whether guesses are too high or too low
- Count of attempts taken to guess the number

## How to Run

1. Compile the program:
   ```bash
   javac numGuess.java
   ```

2. Run the program:
   ```bash
   java numGuess
   ```

3. Follow the prompts:
   - Enter the minimum and maximum numbers for the range
   - Start guessing numbers within the specified range
   - Receive feedback on your guesses
   - Continue until you guess the correct number

## Example

```
Enter the minimum number: 1
Enter the maximum number: 100
Guess a number between 1 and 100:
50
Too high! Try again:
25
Too low! Try again:
37
Congratulations! You've guessed the number in 3 tries.
```

## Requirements
- Java Development Kit (JDK) installed
