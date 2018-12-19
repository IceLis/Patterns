package Composite;

public class PngFile implements IFile {
  String name;

  public PngFile(String name) {
    this.name = name;
  }

  @Override
  public void getInformation() {
    System.out.println(" PNG file " + name);
  }
}
