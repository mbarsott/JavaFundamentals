// Packages determine the folder structure of your projects.
// They are used to organize your source code and create scope to avoid name collisions.
// If you use a package, it should be the first statement of your  source file.
// To keep names unique, package names usually start with the domain name inverted
// ex.: fledger.com -> com.fledger
// after the domain name you determine the package hierarchy to organize your code
// The folder structure should reflect the package structure, from the root of source code.
// ex.: com.fledger.javafundamentals => src/com/fledger/javafundamentals (if src is the root of source code)
package com.fledger.javafundamentals;

// Imports let you use code from other classes or packages

// The following statement lets you use the class Date from the package java.util:
import java.util.Date;

// The following statement lets you use any class from the java.text package (including DateFormat):
import java.text.*;

// The fully qualified name of this class is com.fledger.javafundamentals.JF02_Packages
public class JF02_Packages {

    // You already know what an entry point is:
    public static void main(String[] args) {
      // Creates an object now from the class Date (contains date and time). It is initialized to the current time.
      Date now = new Date();
      // Creates an object to format a Date with the long time format.
      DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.LONG);
      // Writes the current time using the long time format.
      System.out.println("Now it is " + dateFormat.format(now));
    }

    /*
      To compile and run this program:
      1. From the command line, on the source root folder, execute the command:
      javac com/fledger/javafundamentals/JF02_Packages.java
      Obs.: it will create JF02_Packages.class in that folder (javafundamentals)
      2. From the command line, execute the command
      java com.fledger.javafundamentals.JF02_Packages
      Notice that you compile (javac) a file (with .java extension)
      and run (java) a class (with fully qualified name)
      Result: you should see "Now it is " and the current time, long format, on the screen.
      By the way, it is about time for you to use an IDE. I recommend Eclipse or IntelliJ Idea Community!
    */
}
