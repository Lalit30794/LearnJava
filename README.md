Here's a template for a `README.md` file for your Java tutorials on GitHub:

---

# Java Tutorials

Welcome to the **Java Tutorials** repository! This collection of tutorials is designed to guide you through the basics of Java programming, from the very fundamentals to more advanced topics. Whether you're a beginner looking to learn Java or an experienced programmer seeking to deepen your understanding, this repository has something for you.

## Table of Contents

- [Java Tutorials](#java-tutorials)
  - [Table of Contents](#table-of-contents)
  - [Introduction](#introduction)
  - [Setup \& Installation](#setup--installation)
  - [Java Basics](#java-basics)
    - [Example: Hello World Program](#example-hello-world-program)
  - [Control Statements](#control-statements)
  - [Object-Oriented Programming (OOP)](#object-oriented-programming-oop)
  - [Advanced Topics](#advanced-topics)
  - [Project Examples](#project-examples)
  - [Contributing](#contributing)
    - [Core Java Tutorial (Step by Step: Basic to Advanced)](#core-java-tutorial-step-by-step-basic-to-advanced)
    - [Table of Contents:](#table-of-contents-1)
    - [1. **Introduction to Java**](#1-introduction-to-java)
    - [2. **Setting up Java Development Environment**](#2-setting-up-java-development-environment)
    - [3. **Java Basics**](#3-java-basics)
      - [3.1 **Data Types and Variables**](#31-data-types-and-variables)
      - [3.2 **Operators in Java**](#32-operators-in-java)
      - [3.3 **Input and Output**](#33-input-and-output)
    - [4. **Control Flow Statements**](#4-control-flow-statements)
      - [4.1 **If-Else Statements**](#41-if-else-statements)
      - [4.2 **Switch Statements**](#42-switch-statements)
      - [4.3 **Loops**](#43-loops)
    - [5. **Object-Oriented Programming (OOP)**](#5-object-oriented-programming-oop)
      - [5.1 **Classes and Objects**](#51-classes-and-objects)
      - [5.2 **Encapsulation**](#52-encapsulation)
      - [5.3 **Inheritance**](#53-inheritance)
      - [5.4 **Polymorphism**](#54-polymorphism)
      - [5.5 **Abstraction**](#55-abstraction)
    - [6. **Advanced Java Concepts**](#6-advanced-java-concepts)
      - [6.1 **Static Keyword**](#61-static-keyword)
      - [6.2 **Final Keyword**](#62-final-keyword)
    - [7. **Exception Handling**](#7-exception-handling)
    - [8. **Multithreading**](#8-multithreading)
    - [9. **Collections Framework**](#9-collections-framework)
      - [9.1 **List**](#91-list)
      - [9.2 **Map**](#92-map)
    - [10. **File Handling**](#10-file-handling)
    - [11. **Java 8 Features**](#11-java-8-features)
      - [11.1 **Lambda Expressions**](#111-lambda-expressions)
      - [11.2 **Stream API**](#112-stream-api)

## Introduction

Java is a powerful, platform-independent, object-oriented programming language widely used for building various applications. In these tutorials, you'll learn:
- Fundamental Java syntax
- Core concepts such as loops, conditionals, and data types
- Object-Oriented Programming (OOP) concepts like inheritance, polymorphism, and encapsulation
- Exception handling, file I/O, and more

## Setup & Installation

Before you begin writing Java code, make sure your development environment is properly set up:

1. **Download JDK (Java Development Kit)**: 
   - [Download the latest JDK](https://www.oracle.com/java/technologies/javase-downloads.html) and follow the installation instructions.

2. **Set up IDE**:
   - Use an Integrated Development Environment (IDE) like [IntelliJ IDEA](https://www.jetbrains.com/idea/), [Eclipse](https://www.eclipse.org/), or [NetBeans](https://netbeans.apache.org/) to write and run your Java programs.

3. **Verify Installation**:
   - Open your terminal or command prompt and run:
     ```bash
     java -version
     ```
   - You should see the installed Java version printed on the screen.

## Java Basics

The basics of Java include:
- **Data Types & Variables**: Integer, Float, Boolean, String
- **Operators**: Arithmetic, Relational, Logical
- **Control Flow**: If-else, Switch, For loop, While loop
- **Methods**: Defining and calling methods, method parameters, and return types

Check out the detailed examples and exercises in the `basics/` folder.

### Example: Hello World Program
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

[Click here to see more examples on Java Basics](basics/)

## Control Statements

Java control statements allow you to control the flow of your code:
- **If-else statements**
- **Switch-case**
- **For, While, and Do-While loops**

Go through the control statements [here](control_statements/).

## Object-Oriented Programming (OOP)

Java is a fully object-oriented programming language. These tutorials cover:
- **Classes and Objects**
- **Encapsulation**
- **Inheritance**
- **Polymorphism**
- **Abstraction**

Explore OOP concepts [here](oop/).

## Advanced Topics

The advanced section covers:
- **Exception Handling**
- **File I/O**
- **Multithreading**
- **Java Collections Framework**

Learn more about these advanced topics [here](advanced_topics/).

## Project Examples

Practice what you've learned by building real-world Java applications. Some example projects include:
- Simple Banking Application
- Library Management System
- Todo List Application

Check out the projects folder [here](projects/).

## Contributing

Contributions are welcome! If you'd like to improve or add new tutorials, please follow these steps:

1. Fork the repository
2. Create a new branch (`git checkout -b feature/new-tutorial`)
3. Commit your changes (`git commit -m 'Add new tutorial'`)
4. Push to the branch (`git push origin feature/new-tutorial`)
5. Open a Pull Request


### Core Java Tutorial (Step by Step: Basic to Advanced)

This tutorial will guide you through **Core Java** topics step by step, starting from the basic concepts, and progressing to advanced features. The goal is to give you a strong foundation in Java programming.

---

### Table of Contents:
1. [Introduction to Java](#1-introduction-to-java)
2. [Setting up Java Development Environment](#2-setting-up-java-development-environment)
3. [Java Basics](#3-java-basics)
4. [Control Flow Statements](#4-control-flow-statements)
5. [Object-Oriented Programming (OOP)](#5-object-oriented-programming-oop)
6. [Advanced Java Concepts](#6-advanced-java-concepts)
7. [Exception Handling](#7-exception-handling)
8. [Multithreading](#8-multithreading)
9. [Collections Framework](#9-collections-framework)
10. [File Handling](#10-file-handling)
11. [Java 8 Features](#11-java-8-features)

---

### 1. **Introduction to Java**

- **Java Overview**: Java is a platform-independent, object-oriented programming language created by Sun Microsystems in 1995. Java is widely used for web applications, mobile apps, and enterprise solutions.
  
- **Key Features**:
  - Object-Oriented
  - Platform-Independent (Write Once, Run Anywhere)
  - Simple and Secure
  - Multithreaded

---

### 2. **Setting up Java Development Environment**

- **Step 1**: Download and install the **Java Development Kit (JDK)** from [Oracle's website](https://www.oracle.com/java/technologies/javase-downloads.html).

- **Step 2**: Set up environment variables.
  - Add JDK's `bin` directory to the system path.

- **Step 3**: Install an Integrated Development Environment (IDE) like:
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/)
  - [Eclipse](https://www.eclipse.org/)

---

### 3. **Java Basics**

#### 3.1 **Data Types and Variables**
- Primitive Types: `int`, `byte`, `short`, `long`, `float`, `double`, `char`, `boolean`.
- Non-Primitive Types: Strings, Arrays, Objects.

```java
int number = 10;
float price = 99.99f;
char letter = 'A';
boolean isJavaFun = true;
```

#### 3.2 **Operators in Java**
- Arithmetic Operators: `+`, `-`, `*`, `/`, `%`
- Relational Operators: `==`, `!=`, `>`, `<`, `>=`, `<=`
- Logical Operators: `&&`, `||`, `!`

#### 3.3 **Input and Output**
- Use `System.out.println()` for output.
- Use `Scanner` class for input.

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
System.out.println("Enter your name:");
String name = scanner.nextLine();
System.out.println("Hello, " + name);
```

---

### 4. **Control Flow Statements**

#### 4.1 **If-Else Statements**
```java
int age = 18;
if (age >= 18) {
    System.out.println("You are eligible to vote.");
} else {
    System.out.println("You are not eligible to vote.");
}
```

#### 4.2 **Switch Statements**
```java
int day = 2;
switch (day) {
    case 1:
        System.out.println("Sunday");
        break;
    case 2:
        System.out.println("Monday");
        break;
    default:
        System.out.println("Other day");
}
```

#### 4.3 **Loops**  
- For Loop
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```
- While Loop
```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```
- Do-While Loop
```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

---

### 5. **Object-Oriented Programming (OOP)**

#### 5.1 **Classes and Objects**
A class is a blueprint for creating objects.

```java
class Car {
    String model;
    int year;
    
    void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "Honda";
        myCar.year = 2020;
        myCar.displayInfo();
    }
}
```

#### 5.2 **Encapsulation**
Encapsulation means restricting access to certain details and showing only essential information.

```java
class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

#### 5.3 **Inheritance**
Inheritance allows one class to inherit the properties and methods of another class.

```java
class Animal {
    void eat() {
        System.out.println("This animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}
```

#### 5.4 **Polymorphism**
Polymorphism allows one interface to be used for a general class of actions.

```java
class Animal {
    void sound() {
        System.out.println("This is an animal sound.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}
```

#### 5.5 **Abstraction**
Abstract classes and interfaces allow you to hide implementation details.

```java
abstract class Animal {
    abstract void sound();
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}
```

---

### 6. **Advanced Java Concepts**

#### 6.1 **Static Keyword**
- Static methods/variables belong to the class, not the instance.

```java
class MyClass {
    static int count = 0;
    MyClass() {
        count++;
    }
}
```

#### 6.2 **Final Keyword**
- Used to declare constants or prevent inheritance.

---

### 7. **Exception Handling**

Exception handling is used to handle runtime errors, so the normal flow of the application is maintained.

```java
try {
    int division = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero.");
} finally {
    System.out.println("This will always execute.");
}
```

---

### 8. **Multithreading**

Multithreading allows concurrent execution of two or more parts of a program.

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
```

---

### 9. **Collections Framework**

Java Collections Framework provides various data structures and algorithms to manipulate groups of objects.

#### 9.1 **List**
```java
import java.util.ArrayList;
ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
System.out.println(list);
```

#### 9.2 **Map**
```java
import java.util.HashMap;
HashMap<Integer, String> map = new HashMap<>();
map.put(1, "One");
map.put(2, "Two");
System.out.println(map);
```

---

### 10. **File Handling**

Java provides the `File`, `FileReader`, `FileWriter` classes for file handling.

```java
import java.io.FileWriter;

FileWriter writer = new FileWriter("output.txt");
writer.write("Hello, File Handling!");
writer.close();
```

---

### 11. **Java 8 Features**

Java 8 introduced new features such as **Lambda Expressions**, **Stream API**, **Default Methods** in interfaces, and more.

#### 11.1 **Lambda Expressions**
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
numbers.forEach(n -> System.out.println(n));
```

#### 11.2 **Stream API**
```java
List<String> names = Arrays.asList("John", "Jane", "Tom");
names.stream().filter(n -> n.startsWith("J")).forEach(System.out::println);
```
