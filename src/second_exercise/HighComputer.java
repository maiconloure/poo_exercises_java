package second_exercise;

public class HighComputer extends Computer {
  private String caseColor;
  
  public String getCaseColor() {
    return caseColor;
  }

  public void setCaseColor(String caseColor) {
    this.caseColor = caseColor;
  }

  public void playCounterStrike() {
    System.out.println("Playing Counter Strike!");
  }
}
