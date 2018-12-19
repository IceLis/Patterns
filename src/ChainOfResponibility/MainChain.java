package ChainOfResponibility;

public class MainChain {
  public static void main(String[] args) {
    Product product=new Product("Car");
    Section sectionA = new Section();
    Section sectionB = new Section();
    Section sectionC = new Section();
   SectionChain sectionChain=new SectionChain("some chain");
   sectionChain.addSection(sectionC,"construct");
   sectionChain.addSection(sectionB,"color");
   sectionChain.addSection(sectionA,"sell");


   /* sectionC.name="construct";
    sectionC.state=0;
    sectionC.next=sectionB;
    sectionC.prev=null;

    sectionB.name="Color";
    sectionB.state=1;
    sectionB.next=sectionA;
    sectionB.prev=sectionC;

    sectionA.name="Sell";
    sectionA.state=2;
    sectionA.prev=sectionB;
    sectionA.next=null;*/

    sectionB.action(product);
    product.getState();


  }

}
