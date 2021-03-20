package second_exercise;

import java.util.Date;

public class Computer {
  private String name;
  private double price;
  private Date mfgDate;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Date getMfgDate() {
    return mfgDate;
  }

  public void setMfgDate(Date mfgDate) {
    this.mfgDate = mfgDate;
  }

  public void turnOn() {
    System.out.println("Computer starts!");
  }

  public void turnOff() {
    System.out.println("Computer off");
  }

  public void accessInternet() {
    System.out.println("Computer online!");
  }
}
