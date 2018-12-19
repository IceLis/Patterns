package Composite;

public class TxtFile implements IFile {
  String name;

  public TxtFile(String name) {
    this.name = name;
  }

  @Override
  public void getInformation() {
    System.out.println(" TXT file " + name);
  }
}
