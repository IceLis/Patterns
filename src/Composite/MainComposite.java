package Composite;

public class MainComposite {
  public static void main(String[] args) {
    IFile file=new TxtFile("1 txt");
    IFile file2=new TxtFile("2 txt");
    IFile file3=new PngFile("3 png");
    IFile file4=new TxtFile("4 txt");
    IFile file5=new PngFile("5 png");
    IFile file6=new TxtFile("6 txt");
    IFile file7=new TxtFile("7 txt");
    IFile file8=new TxtFile("extra ) txt");
    IFile file9=new TxtFile("extra ) png");


    Folder folder1=new Folder("TXT folder");
    Folder folder2=new Folder("PNG folder");
    Folder folder3=new Folder("ALL TOTAL folder");

    folder1.AddFile(file);
    folder1.AddFile(file2);
    folder1.AddFile(file4);
    folder1.AddFile(file6);
    folder1.AddFile(file7);

    folder2.AddFile(file3);
    folder2.AddFile(file5);


    folder3.AddFile(file9);
    folder3.AddFile(folder1);
    folder3.AddFile(folder2);
    folder3.AddFile(file8);

    folder3.getInformation();

  }
}
