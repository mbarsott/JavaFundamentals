package com.fledger.javafundamentals.jf07classes;

import java.util.Date;

// This is the class BetterAlarm. It is better because it encapsulates the attributes, by making them private.
// Notice that this class uses the public access modifier. This means any class can import and use it.
public class BetterAlarm {

  // The private access modifiers mean these attributes are only visible within the class
  private Date dateAndTimeToGoOff;
  private String message;

  // The public access modifiers mean these methods are visible to any class that uses (imports) the BetterAlarm class.
  public void setToGoOffInTheseManySeconds(int i) {
    dateAndTimeToGoOff = new Date();
    dateAndTimeToGoOff.setTime(dateAndTimeToGoOff.getTime() + i * 1000L);
  }

  // If no access modifier is used, the member is package private: it is visible anywhere in the same package.
  int defaultDelayToGoOff = 2;

  // The next two methods below are visible anywhere in the com.fledger.javafundamentals.jf07classes package:
  void setDefaultDelayToGoOff(int i) {
    defaultDelayToGoOff = i;
  }

  void prepareAlarm() {
    setMessage(defaultMessageForBetterAlarm);
    setToGoOffInTheseManySeconds(defaultDelayToGoOff);
  }

  // There is one additional access modifier: protected. We will talk about protected when we see inheritance.

  // Since private attributes are not visible outside this class, only methods defined by you can change them.
  // This guarantees that only your code will mess with the attribute, usually through a setter.
  // This is a setter, or mutator, method. It is used to set a value in a private attribute.
  public void setMessage(String s) {
    message = s;
  }

  // This is a getter, or accessor, method. It is used to get the value of a private attribute.
  public Date getDateTime() {
    return dateAndTimeToGoOff;
  }

  // This is a regular public method. Can be called by any code that uses this class.
  public void goOff() {
    System.out.println(message);
  }

  // Class and Instance variables (or attributes)
  // If a member has the static keyword, it is a class member. It means it belongs to the class.
  // Class members can be used from classes or instances (objects). Instance members cannot be used from the class.
  private static String defaultMessageForBetterAlarm;

  // The following is a static member, or a class method. It cannot access any instance member.
  static void setDefaultMessageForBetterAlarm(String s) {
    defaultMessageForBetterAlarm = s;
    // The compiler would not allow the following statement because setMessage is not static (it is an instance member)
    // setMessage(defaultMessageForBetterAlarm);
  }

}
