package ChainOfResponibility;

import java.util.ArrayList;
import java.util.List;

public class SectionChain {
  String name;
  List<Section> sectionsList;

  public SectionChain() {
  }

  public SectionChain(String name) {
    this.name = name;
    this.sectionsList = new ArrayList<>();
  }

  void addSection(Section section, String name) {
    section.name = name;
    section.state = this.sectionsList.size();

    if (this.sectionsList.size() > 0) {
      this.sectionsList.add(section);
      this.sectionsList.get(this.sectionsList.size() - 1).prev =
              this.sectionsList.get(this.sectionsList.size() - 2);
      this.sectionsList.get(this.sectionsList.size() - 2).next =
              this.sectionsList.get(this.sectionsList.size() - 1);
      this.sectionsList.get(this.sectionsList.size() - 1).next = null;
    } else {
      this.sectionsList.add(section);
      this.sectionsList.get(this.sectionsList.size() - 1).next = null;
    }
  }


}
