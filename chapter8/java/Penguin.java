package chapter8.java;

public class Penguin extends Bird {
  public final boolean hasFeathers() { // DOES NOT COMPILE - has final
    return false; 
  }
  
  public final static void flyAway() {} // DOES NOT COMPILE - has final
}
  