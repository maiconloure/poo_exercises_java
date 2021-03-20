package second_exercise;

public class GamerComputer extends Computer {
  private int graphicCardMemory;

  public int getGraphicCardMemory() {
    return graphicCardMemory;
  }

  public void setGraphicCardMemory(int graphicCardMemory) {
    this.graphicCardMemory = graphicCardMemory;
  }

  public void playNeedForSpeed() {
    System.out.println("Playing Need For Speed");
  }
}
