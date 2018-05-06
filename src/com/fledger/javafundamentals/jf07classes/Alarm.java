package com.fledger.javafundamentals.jf07classes;

import java.util.Date;

// This is the class Alarm. It contains the definition for all data and all methods of an alarm:
class Alarm {

  // alarmDateAndTime and alarmMessage are attributes of the class Alarm.
  Date alarmDateAndTime;
  String alarmMessage;

  // goOff() is a method of the class Alarm.
  void goOff() {
    System.out.println(alarmMessage);
  }
}
