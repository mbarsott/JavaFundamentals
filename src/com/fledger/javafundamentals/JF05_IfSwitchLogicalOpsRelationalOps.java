// Java Fundamentals 05 - If, switch, logical and relational operators
package com.fledger.javafundamentals;

public class JF05_IfSwitchLogicalOpsRelationalOps {
  public static void main(String[] args) {
    // Relational operators let you compare things
    // Use Greater than, greater than of equal to, less than, less than or equal to, equal to, and not equal to
    // ( >, >=, <, <=, ==, and != ) to compare numbers, characters or booleans.
    System.out.println(5 > 4); // Prints true
    System.out.println('A' < 'C'); // Prints true because A comes before C
    System.out.println(3 <= 3); // Prints true
    System.out.println(3 != 3); // Prints false
    System.out.println('a' == 'b'); // Prints false

    // if statement: if (condition) statement;
    if ('a' == 'a')
      System.out.println("Of course 'a' is equal to 'a'!");

    // if else statements: if (condition) statement-if-true; else statement-if-false;
    if (2 > 5)
      System.out.println("this will never be printed! 2 is always less than 5!");
    else
      System.out.println("2 is less than 5");

    // you can nest is statements. It is good practice to indent your code and always use blocks of statements:
    boolean goodProgrammer = true;
    boolean javaExpert = true;
    if (goodProgrammer) {
      System.out.println("Good programmers always use {} and indent their code!"); // print this
      if (javaExpert) {
        System.out.println("Blocks and indentation help you understand the logic flow of the program"); // prints this
      }
    } else {
      System.out.println("This won't print out! You are a good programmer, aren't ya?"); // doesn't print this
    }

    // Conditional assignment: assigns different values depending on condition. condition ? valueIfTrue : valueIfFalse;
    int javaExpertiseDegree = javaExpert ? 10 : 0; // Assigns 10 to javaExpertiseDegree. Same thing as:
    if (javaExpert) {
      javaExpertiseDegree = 10;
    } else {
      javaExpertiseDegree = 0;
    }

    // Switch Statement: you can use a switch to test the same variable against multiple values
    switch (javaExpertiseDegree) {
      case 0:
        System.out.println("You know nothing, John Snow!");
        break; // the break makes execution flow to the statement following the switch block;
      case 1:
        System.out.println("So much you still need to learn!");
        break; // if you don't use a break, after it matches a value it executes all following statements in the switch
      case 2:
      case 3:  // you can use multiple values in sequence:
      case 4:  // it will execute the folloing line if javaExpertiseDegree is 2 or 3 or 4
        System.out.println("You are still a beginner");
        break;
      case 5:
      case 6:
      case 7:
      case 8:
        System.out.println("Intermediate level");
        break;
      case 9:
      case 10:
        System.out.println("So you aced your Java certification, huh?");
        break;
      default: // default needs to be the last value. If nothing matches it will match default!
        System.out.println("What's up with your degree? You can't be negative! Nor more than 10!");
        break; // this break is optional, since there are no more statements in the switch...
    }

    // Logical Operators: conditions can be combined with logical operators and, or, exclusive or (XOR), and not
    // ( &, |, ^, and ! ).
    boolean thoroughProgrammer = false;
    if (javaExpert & goodProgrammer) { // and (&) only evaluates to true if both sides are true
      System.out.println("Ask for a raise!"); // prints this, both are true
    }

    if (thoroughProgrammer | goodProgrammer) { // or ( | ) evaluates to true if any side is true
      System.out.println("You can work with quality assurance!"); // prints this, at least one side is true
    }

    if (javaExpert ^ thoroughProgrammer) { // xor ( ^ ) evaluates to true if one is true and the other is false
      System.out.println("You cheat in your code!"); // prints this, one is true, the other is false
    }

    if (!(javaExpertiseDegree == 10)) { // not ( ! ) negates the condition. Read "if not degree equals to 10"...
      System.out.println(); // doesn't print this. javaExpertiseDegree is ten!
    }

    // You can use parenthesis to change precedence and combine multiple logical expressions:
    if ((javaExpert & (!thoroughProgrammer) | (goodProgrammer & javaExpertiseDegree == 0))) {
      // (true & (! false) | ( true & false)) => (true & true | false) => true | false => true
      System.out.println("Something is wrong with your skills!"); // prints this because expression evaluates to true
    }

    // Conditional Logical Operators (short circuit operators): only evaluates second expression if necessary
    // There are two types: && (short circuit and) and || (short circuit or):
    // Right expression is not evaluated when using && and left expression is false: results false immediately
    // Right expression is not evaluated when using || and left expression is true: results true immediately
    // Other than that, they work as the regular and and or ( & and | )
    if (thoroughProgrammer && ++javaExpertiseDegree > 0) { // does not evaluate second expression. No increment either!
      System.out.println("Your Expertise Degree increased one point!");
    }
    System.out.println("Expertise level is " + javaExpertiseDegree); // Level did not change!
  }
}

// previous file: src/com/fledger/javafundamentals/JF04_ScopesConversionsBoxing.java -> https://goo.gl/4q3RCT