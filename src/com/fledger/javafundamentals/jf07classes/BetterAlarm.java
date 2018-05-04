package com.fledger.javafundamentals.jf07classes;

import java.util.Date;

public class BetterAlarm {
  private Date dateAndTimeToGoOff;
  private String message;

  public void setToGoOffInTheseManySeconds(int i) {
    dateAndTimeToGoOff = new Date();
    dateAndTimeToGoOff.setTime(dateAndTimeToGoOff.getTime() + i * 1000L);
  }

  public void setMessage(String s) {
    message = s;
  }

  public Date getDateTime() {
    return dateAndTimeToGoOff;
  }

  public void goOff() {
    System.out.println(message);
  }
}
