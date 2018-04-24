// Java Fundamentals 06 - Arrays and Loops
package com.fledger.javafundamentals;

public class JF06_ArraysLoops {
  public static void main(String[] args) {
    // Arrays let you allocate and use an ordered collection of elements.
    int[] myArrayOfInts; // You declare an array of a type by following the type with [] before the variable name.
    // The following statement allocates space for an array of 3 ints and assign the array to the variable myArrayOfInts
    myArrayOfInts = new int[3]; // You allocate space for the array and initialize the variable with using new.
    // You can access and assign each individual element of the array using an index number between [].
    myArrayOfInts[0] = 1; // You use the index between []. the first index is always zero!
    myArrayOfInts[1] = 2; // You can use any index between 0 and the size of the array minus 1.
    myArrayOfInts[2] = 3; // The last element of the array is one short of the array size. Do not go over that limit!
    // You can declare and allocate the array in one statement:
    float[] myArrayOfFloats = new float[5];
    // You can declare, allocate, and initialize the array in a single statement:
    double[] myArrayOfDoubles = {1.1, 2.2, 3.3}; // this is a new array of doubles with three initialized elements
    // You obtain the size of the array using the length property:
    System.out.println("The size of myArrayOfDoubles is " + myArrayOfDoubles.length);

    // While loop: The while loop lets you repeat a statement (or block) while the condition is true:
    // The general format is: while (condition) statement;
    int printedNumbers = 0, fibonacci = 1, previous = 0;
    // the while loop starts by testing the condition. If it is true it executes the whole while block.
    while (printedNumbers < 10) { // if the condition is false, execution resumes with the statement after the block
      System.out.print(fibonacci + "; ");
      printedNumbers++;
      // You can declare variables inside a loop. Every time the loop is executed, the variable is recreated
      int temp = fibonacci;
      fibonacci += previous; // https://en.wikipedia.org/wiki/Fibonacci_number
      previous = temp;
      // Local scoped variables defined in the block go out of scope and are "destroyed" at the block end
    } // after the block execution, the condition at the beginning is tested again.
    System.out.println("is a Fibonacci sequence of ten numbers!");

    // Do-while loop: is similar to the While loop, but the condition is tested at the end.
    // The general format is do statement; while (condition);

    fibonacci = 1;
    previous = 0;
    do { // since there is no test at the beginning, the loop is executed at least once
      System.out.print(fibonacci + "; ");
      int temp = fibonacci;
      fibonacci += previous;
      previous = temp;
    } while (fibonacci < 200); // if the condition at the end is true, the loop starts all over again
    System.out.println("are all Fibonacci numbers under 200!");

    // For loop: it is very common to use loops with initialization, condition, and update control.
    // The for loop is a convenient construct for that. The general format is:
    // for (initialization; condition; update_control) statement;
    // it is the exact equivalent to
    // initialization; while (condition) { statement; update_control; }
    fibonacci = 1;
    previous = 0;
    for (int i = 0; i < 10; i++) { // i is initialized at the beginning of the loop and is a local variable
      System.out.print(fibonacci + "; ");
      int temp = fibonacci;
      fibonacci += previous;
      previous = temp;
    }
    System.out.println("is also a Fibonacci sequence of ten numbers!");

    // For-each loop: the most common use of a loop is to visit all elements in a collection or array
    // The for-each loop is a very convenient construct for that:
    // The general format is: for (element_variable_declaration : array) statement;
    for (double d : myArrayOfDoubles) {
      System.out.print(d + "; ");
    }
    System.out.println("These are the elements in myArrayOfDoubles");

    // The equivalent of above, with a for loop:
    for (int j = 0; j < myArrayOfDoubles.length; j++) {
      double d = myArrayOfDoubles[j];
      System.out.print(d + "; ");
    }
    System.out.println("These are the elements in myArrayOfDoubles");

    // And with a while loop
    int j = 0;
    while (j < myArrayOfDoubles.length) {
      double d = myArrayOfDoubles[j];
      System.out.print(d + "; ");
      j++;
    }
    System.out.println("These are the elements in myArrayOfDoubles");
  }
}

// previous file: src/com/fledger/javafundamentals/JF05_IfSwitchLogicalOpsRelationalOps.java -> https://goo.gl/46fxPa

