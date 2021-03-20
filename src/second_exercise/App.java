package second_exercise;

import java.util.Date;
import java.text.SimpleDateFormat;

public class App {
  public static void main(String[] args) throws Exception {

    SimpleComputer simpleComputer = new SimpleComputer();
    simpleComputer.setName("Dell");
    simpleComputer.setPrice(2000);
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date mfgDate = dateFormat.parse("11/11/2020");
    simpleComputer.setMfgDate(mfgDate);
    simpleComputer.turnOn();
    simpleComputer.turnOff();
    simpleComputer.accessInternet();

    HighComputer highComputer = new HighComputer();
    highComputer.setName("DELL XD");
    highComputer.setPrice(4000);
    highComputer.setCaseColor("Blue");
    highComputer.playCounterStrike();

    GamerComputer gamerComputer = new GamerComputer();
    gamerComputer.setName("Razer");
    gamerComputer.setPrice(5000);
    gamerComputer.setGraphicCardMemory(2000);
    Date gamerMfgDate = dateFormat.parse("22/02/2020");
    gamerComputer.setMfgDate(gamerMfgDate);
    gamerComputer.playNeedForSpeed();
  }
}
