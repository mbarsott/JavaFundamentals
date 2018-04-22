// Java Fundamentals 03 - Variables, Types, and Operators
package com.fledger.javafundamentals;

import java.util.Date;

public class JF03_VarsTypesOperators {

  public static void main(String[] args) {
    // Literals are explicit data values we use in our programs. For example: 888 is a literal in the next line:
    System.out.println(888); // prints 888

    // Variables are places in your program where you can store data.
    // Java is "strongly typed" language, so every variable has a type and it cannot be changed
    // This is a declaration of an integer (int) variable named "i":
    int i;
    // You can assign values to a variable with the assignment operator ( = ):
    i = 5;
    // You can declare and assign variables in one statement:
    int j = 10;
    // Variables names can contain letters, numbers, $, and _. The first character cannot be a number.
    // By convention, java developers use "camel case" for variable names: first word in lower case;
    // following words in lowercase starting with uppercase. This is camel case:
    int thisIsAnotherIntegerVariable = 4;

    // You can use print and println (prints and goes to next line) to print literals and values of variables:
    System.out.print("The value of i is "); // this type of literal is called a string literal. See strings below.
    System.out.println(i); // prints 5
    // You can change the value of a variable by assigning a new value:
    i = 15;
    System.out.print("Now, the value of i is ");
    System.out.println(i); // prints 15
    // You can use variables to create mathematical expressions, just like algebra (* is multiplication)
    System.out.println((i + j) * thisIsAnotherIntegerVariable); // prints 100
    // You can assign expressions to variables:
    int k = (i + j) * thisIsAnotherIntegerVariable;
    System.out.println(k); // also prints 100

    // Primitive data types: fundamental for the language, in four categories:
    // Integers, Characters, Floating Points, and Booleans
    // Integer types:
    byte myByte = 36;           // uses 8 bits, values range from -128 to 127
    short myShort = 17000;      // uses 16 bits, from -32768 to 32767
    int myInt = 1000000;        // 32 bits, -2147483648 to 2147483647
    long myLong = 1000000000L;  // 64 bits -9223372036854775808 to 9223372036854775807 (notice the L in the literal)
    // Character type (holds one character)
    char myChar = 'C';          // literals should be between single quotes
    char myOtherChar = '\u00A5';// Yen sign: ¥ literals for unicode characters start with \ and u, then two hex numbers
    // Floating Point Types (allow for fractional parts in a number)
    float myFloat = 3.141516f;  // 32 bits, from 1.4x10E-45 to 3.4x10E38 (notice the f in the literal)
    double myDouble = 3.141516; // 64 bits, from 4.9x10E-324 to 1.7x10E308 (optionally you can use d in the literal)
    // Boolean type (holds only true of false)
    boolean myBoolean = true;   // you can use the true or false literals

    // When you declare primitive data type variables, space is allocated for the value and the variable access
    // the value stored in that space directly: primitive data types are stored by value! See the example
    int myFirstInt = 1; // space for one int is allocated an 10 is stored there
    int mySecondInt = 2; // space for another int is allocated, receives value from myFirstInt (10)
    System.out.println("Primitive types are stored by value: myFirstInt and mySecondInt");
    System.out.println(myFirstInt);  // prints 1
    System.out.println(mySecondInt); // prints 2
    myFirstInt = mySecondInt; // gets the value from mySecondInt (2) and assigns to myFirstInt;
    System.out.println("mySecondInt was assigned to myFirstInt:");
    System.out.println(myFirstInt);  // prints 2
    System.out.println(mySecondInt); // prints 2
    myFirstInt = 1; // stores 1 in the space reserved for myFirstInt. mySecondInt is untouched.
    System.out.println("Changing myFirstInt value back to 1 does not affect mySecondInt:");
    System.out.println(myFirstInt);  // prints 0
    System.out.println(mySecondInt); // prints 10
    // When you declare non primitive data type variables (objects), space is allocated for the value and the
    // variable receives a reference to that space: objects are stored by reference: See the example
    Date now = new Date(); // creates a Date object variable, that contains current date and time... by reference!
    Date oneHourAgo = new Date(now.getTime() - 60 /*minutes*/ * 60 /*seconds*/ * 1000 /*milis*/);
    System.out.println("Objects are stored by reference: now and oneHourAgo");
    System.out.println(now);
    System.out.println(oneHourAgo);
    now = oneHourAgo; // now and oneHourAgo both reference the same Date object
    System.out.println("oneHourAgo was assigned to now");
    System.out.println(now);
    System.out.println(oneHourAgo);
    now.setTime(now.getTime() + 60 * 60 * 1000); // advances the object time by one hour.
    //Since both variables (now and oneHourAgo) reference the same object, both variables are one hour ahead:
    System.out.println("now was fast forwarded one hour, but oneHourAgo references the same object");
    System.out.println(now);
    System.out.println(oneHourAgo);

    // Basic Arithmetic Operators can be used with integer and floating point types
    // Add (+), Subtract (-), Multiply (*), Divide (/), and Modulus or Remainder (%)
    System.out.println(1 + 4 + 5 - 10); // prints 0
    System.out.println(3 * 10 / 6); // prints 5
    System.out.println(17 % 3); // prints 2 -> 17 divided by 3 is 5 with a remainder of 2
    System.out.println(1.0 + 4.0 + 5.0 - 10.0); // prints 0.0
    System.out.println(10.0 / 3.0); // prints 3.3333333...
    System.out.println(17.0 % 3.0); // prints 2.0
    // Prefix and Postfix operators (++ and --) increment (++) or decrement (--) a numeric variable
    // Prefix increment (++variable) increments and returns the result
    i = 10;
    double x = 3.141516;
    System.out.println(++i); // Increments the value of i to 11 and prints 11
    System.out.println(++x); // prints 4.141516
    // Postfix decrement (variable--) returns the original value and then decrements the value of the variable
    System.out.println(i--); // still prints 11, but the value of i is 10 after the statement
    System.out.println(x--); // prints 4.141516
    System.out.println(i); // prints 10
    System.out.println(x); // prints 3.141516
    // Compound Assignment Operators: combines an arithmetic operator with the assignment operator
    // += adds and assign, -= subtract and assigns, /= divides and assign, and so on:
    i += 5; // i = i + 5 (15)
    i -= 3; // i = i - 3 (12)
    i *= 2; // i = i * 2 (24)
    i /= 6; // i = i / 6 (4)
    i %= 3; // i = i % 3 (1)
    System.out.println(i); // prints 1

    // Operator precedence
    // 1. Prefix (++x); 2. Postfix (x++); 3. Multiplicative (*, /, %); 4. Additive (+, -)
    // Same precedence is evaluated left to right
    // Parenthesis can be used to determine the order of evaluation. Parenthesis are evaluated from inside out.
    System.out.println(++i + 2 * 5 % i++); // => (++i) + ((2 * 5) % (i++)) => (2 + (10 % 2)) => 2 + 0
    i = 1; // i was 3 after previous statement, lets reset it to 1
    System.out.println((++i) + ((2 * 5) % (i++))); // Just checking if parenthesis also work the same
  }
}

// previous file: src/com/fledger/javafundamentals/JF02_Packages.java -> https://goo.gl/DnMZgs
// next file: src/com/fledger/javafundamentals/JF04_ScopesConversionsBoxing.java ->

