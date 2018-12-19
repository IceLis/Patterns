package Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IFile{
  String name;
  List<IFile> fileList;

  public Folder(String name) {
    this.name = name;
    this.fileList = new ArrayList<IFile>();
  }

  void AddFile(IFile iFile) {
    this.fileList.add(iFile);
  }


  @Override
  public void getInformation() {
    System.out.println( " \f folder:"  + this.name);

//    for (IFile soutAll:fileList) {
//      soutAll.getInformation();
//    }

    for (int i = 0; i <this.fileList.size(); i++) {
      System.out.println(this.fileList.get(i).getClass());
      this.fileList.get(i).getInformation();

    }

  }
}
