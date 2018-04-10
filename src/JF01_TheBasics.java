// The Basics - Comments, classes, and entry points

// This is a comment line. Everything after the // is ignored by the Java compiler (until the end of the line).

/*
    This is a comment block. Everything between "whack asterisk" and "asterisk whack"is ignored...
    even if it spans multiple lines...
    or if it is on the line of the comment delimiter. */

/**
 * This is a Javadoc comment. It is a special type of block comment.
 * It starts with "whack asterisk asterisk" and is used to generate documentation automatically.
 * from your Java source code. Javadoc is the name of the tool that generates the documentation.
 * Read more @ https://en.wikipedia.org/wiki/Javadoc
 */

// This is a class. Usually classes are written one class per file, on a file with the same name
// as the class plus the extension ".java".
public class JF01_TheBasics {

  // This a program entry point. If a method (function of a class) has this exact signature:
  // public static void main(String[] args)
  // it can be where your program starts running, the entry point.
  public static void main(String[] args) {

    // This is a statement and it prints the string "Hello Java Fundamentals" on the console (System.out).
    System.out.println("Hello Java Fundamentals!");

    // Statements end with a semicolon. Spaces (or tabs, or new line characters) do not matter for the compiler.

  }

  /*
    To compile and run this program:
    1. Download and install the Java JDK: http://www.oracle.com/technetwork/java/javase/downloads/index.html
    recommendation: start out with the latest Java 8 JDK (Java 1.8)
    2. From the command line, on the directory where this file is, execute the command: javac "JF01_TheBasics.java
    Obs.: if you list the contents of the folder you should see the file JF01_TheBasics.class (the compiled class)
    3. From the command line, execute the command "java JF01_TheBasics""
    Result: you should see the string "Hello Java Fundamentals!" on the screen.
  */
}

// Next Source code: JF02_Packages.java
// This file will be under com/fledger/javafundamentals