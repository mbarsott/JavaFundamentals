// Java Fundamentals 02 - Packages

// Packages determine the folder structure of your projects. By convention they are all lowercase.
// They are used to organize your source code and create scope to avoid name collisions.
// If you use a package, it should be the first statement of your  source file.
// To keep names unique, package names usually start with the web domain name inverted
// ex.: www.fledger.com -> "com.fledger"
// following the inverted domain name, you choose the package hierarchy to organize your code
// The folder structure should reflect the package hierarchy, from the root of the source code.
// ex.: "com.fledger.javafundamentals" -> src/com/fledger/javafundamentals (if src is the root of source code)
package com.fledger.javafundamentals;

// Import statements let you use code from other classes or packages

// The following statement lets you use the class Date from the package "java.util":
import java.util.Date;

// The following statement lets you use any class from the "java.text" package (including "DateFormat"):
import java.text.*;

// Fully qualified class names include the name of the package where the class resides.
// The fully qualified name of this class is "com.fledger.javafundamentals.JF02_Packages"
public class JF02_Packages {

  // You already know what an entry point is:
  public static void main(String[] args) {
    // You can create new objects from a class using the new keyword.
    // This creates a new object variable called "now" from the class "Date" (that contains date and time).
    // This object will contain the the current date and time, because this class was programmed to do that.
    Date now = new Date();
    // Some functions can create and return objects too.
    // This statement creates a DateFormat object to format a "Date" with the long time format.
    DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.LONG);
    // This writes the current time using the long time format.
    System.out.println("Now it is " + dateFormat.format(now));
  }

    /*
      To compile and run this program:
      1. From the command line, on the source root folder, execute the command:
      javac com/fledger/javafundamentals/JF02_Packages.java
      Obs.: it will create a "JF02_Packages.class" file in that folder (javafundamentals)
      2. From the command line, execute the command (still from the source folder)
      java com.fledger.javafundamentals.JF02_Packages
      Notice that you compile (javac) a file (with .java extension),
      and you run (java) a class (using its fully qualified name)
      Result: you should see "Now it is " followed by the current time on the screen.
      By the way, it is about time for you to use an IDE. I recommend Eclipse or IntelliJ Idea CE, both free!
    */
}

// previous file: src/JF01_TheBasics.java -> https://goo.gl/rJN5Aj
// next file: src/com/fledger/javafundamentals/JF03_xxx.java ->
