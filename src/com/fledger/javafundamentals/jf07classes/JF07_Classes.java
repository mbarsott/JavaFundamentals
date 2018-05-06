// Java Fundamentals 07 - Classes, methods, fields, access modifiers
package com.fledger.javafundamentals.jf07classes;

import java.util.Date;

// From now on we will have a separate package per module, as we may use multiple files for each module.
// All files for this module are inside the com.fledger.javafundamentals.jf07classes package.
// Java is an object oriented language. Objects are elements containing data, in the form of fields,
// and code, in the form of functions. In Object Oriented (OO) lingo, object fields are known as attributes
// and object functions are known as methods.
// We say that objects contain a state (given by the attributes) and a behavior (given by the methods).
// An object is a computational model of an entity, like a specific car, or a specific alarm, etc.
// A class is a definition, or a blueprint, for a type of entity, like "Car" (the idea of a car) or "Alarm" (same).
// Objects are created based on a class. For example, in Java, in the following statement:
// Alarm wakeUpAlarm = new Alarm();
// wakeUpAlarm is an object, or instance, of class Alarm. The class Alarm defines the fields and methods of all alarms.

// The following statement and block (com.fledger.javafundamentals.jf07classes.JF07_Classes) define a class:
public class JF07_Classes {
  // Everything between the { } following the class name define the content of the class.
  // As we said, a class can have data... inside a class, data members, or fields, are called fields or attributes:
  int anIntegerField;

  // A class can also have Java code within functions, also are called methods:
  void thisIsAMethod() {
    System.out.println("This is a method that returns nothing (void) and prints this message.");
  }

  // This class contains the entry point (function main) for our program (see JF01_TheBasics.java)
  public static void main(String[] args) {

    // A static method can call another static method. Static methods belong directly to the class (see BetterAlarm)
    printCurrentTime(); // prints current date and time
    // A class in java is a type, so you can declare variables of the class type (see Alarm.java in this package):
    Alarm wakeUpAlarm;
    // You can assign a value to a variable of the class type. The variable contains a reference to an object:
    wakeUpAlarm = new Alarm(); // the keyword "new", followed by a class type and (), creates a new object of that type;
    // You can access members (fields and methods) of an object by using a reference variable, dot (.), and member name:
    wakeUpAlarm.alarmMessage = "It is time to wake up... WAKE UP!!!";
    // You can have fields that are also references to other objects:
    wakeUpAlarm.alarmDateAndTime = new Date(); // sets alarmDateAndTime of WakeUpAlarm to a new Date object set to now.
    // You can access members of these fields with the dot (.) notation:
    Long currentTime = wakeUpAlarm.alarmDateAndTime.getTime(); // get the time (now) from the Date object as a long.
    Long inThreeSeconds = currentTime + 3000L; // Adds 3 thousand milliseconds (5 seconds) to the current time (now).
    wakeUpAlarm.alarmDateAndTime.setTime(inThreeSeconds);
    while (true) { // forever loop. There are better ways to wait for a timed event, but this will do for now.
      Date now = new Date(); // create a new object with the current time;
      if (now.after(wakeUpAlarm.alarmDateAndTime)) { // if current time passed the time set in the alarm
        wakeUpAlarm.goOff(); // alarm goes off and prints message on the console... this is an object behavior (method)
        break; // if you use forever, you need to break out of loop under some condition (see JF06_ArraysLoops)
      }
    }
    printCurrentTime(); // should be 3 seconds after previous printed time.

    // One of the principles of object oriented programming is encapsulation or "data hiding".
    // You can hide the object fields from external access (hide the data, or encapsulate),
    // so only methods of the object can access them. This way you ensure no one else will corrupt your object data.
    // To do so we use access modifiers in the BetterAlarm.java file (look into that file):
    BetterAlarm anotherWakeUpAlarm = new BetterAlarm();
    anotherWakeUpAlarm.setToGoOffInTheseManySeconds(1);
    anotherWakeUpAlarm.setMessage("Please, wake up. Better alarms are more polite.");
    for (; ; ) { // another way to write the forever loop
      Date now = new Date(); // create a new object with the current time;
      if (now.after(anotherWakeUpAlarm.getDateTime())) { // if current time passed the time set in the alarm
        anotherWakeUpAlarm.goOff(); // alarm goes off and prints message on the console...
        break; // get out of the "forever" loop (see JF06_ArraysLoops)
      }
    }
    printCurrentTime(); // should be one second after previous printed time.

    // BetterAlarm contains static members. You don't need to instantiate an object in order to access the static
    // member. You access it directly using the class name:
    BetterAlarm.setDefaultMessageForBetterAlarm("Better Alarm also asks you to wake up.");
    // Creates a betterAlarm object:
    BetterAlarm betterAlarm = new BetterAlarm();
    // All you need to do to prepare the alarm now is call one method.
    betterAlarm.prepareAlarm(); // This is a package private method: only classes in this package can call it.
    // This is even another way to write the code to make the alarm go off, with only two lines of code:
    for (Date now = new Date(); now.before(betterAlarm.getDateTime()); now = new Date()) ;
    betterAlarm.goOff();
    printCurrentTime(); // should be two seconds (default delay for BetterAlarm) after previous printed time.
  }

  private static void printCurrentTime() {
    Date now = new Date();
    System.out.println("The date and time now is: " + now);
  }
}
