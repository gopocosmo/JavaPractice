# JavaPractice

A Java practice project demonstrating fundamental and advanced object-oriented programming concepts, data structures, and algorithms.

## Overview

This repository contains a collection of Java examples and exercises covering key programming concepts. It's designed for learning and practicing Java development, including OOP principles, inheritance, polymorphism, abstraction, interfaces, and more.

## Features

- **Object-Oriented Programming**: Classes, objects, encapsulation, inheritance, polymorphism
- **Abstract Classes and Interfaces**: Implementation of abstract classes and interfaces
- **Data Structures**: Basic data structures like arrays, lists, and sets
- **Control Structures**: Conditional statements, loops, and alternative structures
- **Exception Handling**: Basic error handling patterns
- **Testing**: Unit tests using JUnit
- **Automation**: Selenium integration for web automation examples

## Project Structure

```
src/
├── test/
│   ├── java/
│   │   ├── Multimi.java                    # Collections and data structures
│   │   ├── Structuri_Alternative.java      # Conditional statements
│   │   ├── Structuri_repetitive.java       # Loops and iterations
│   │   ├── Variabile_metode.java           # Variables and methods
│   │   ├── Abstractizare_Interfata/        # Abstract classes and interfaces
│   │   ├── Acces_Control/                  # Access modifiers and encapsulation
│   │   ├── Clasa_Abstracta/                # Abstract classes
│   │   ├── Mostenire_Incapsulare/          # Inheritance and encapsulation
│   │   ├── Obiect/                         # Objects and classes
│   │   ├── Polimorfism/                    # Polymorphism
│   │   └── Protected/                      # Protected access modifier
```

## Prerequisites

- Java 21 (JDK 21.0.11 or later)
- Maven 3.9.15 or later
- (Optional) IDE like IntelliJ IDEA, Eclipse, or VS Code with Java extensions

## Building and Running

1. Clone the repository:
   ```bash
   git clone https://github.com/gopocosmo/JavaPractice.git
   cd JavaPractice
   ```

2. Build the project:
   ```bash
   mvn clean compile
   ```

3. Run tests:
   ```bash
   mvn test
   ```

4. Run a specific test class (example):
   ```bash
   mvn test -Dtest=Multimi
   ```

## Dependencies

- **JUnit 4.13.2**: For unit testing
- **Selenium Java 4.0.0**: For web automation examples

## Contributing

Feel free to add more examples or improve existing code. Please ensure all tests pass before submitting changes.

## License

This project is for educational purposes. See individual files for any specific licensing.
