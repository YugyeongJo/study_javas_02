package co_templates;

public class PolymorphismPig extends PolymorphismAnimal{
  // 상속된 method를 수정하는 것 : Overriding
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}
