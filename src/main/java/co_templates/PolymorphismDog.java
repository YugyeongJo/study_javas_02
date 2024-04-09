package co_templates;

public class PolymorphismDog extends PolymorphismAnimal{
    // 상속된 method를 수정하는 것 : Overriding
    /* 
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
  */
  public int speed(int kmeter) {
    int result = (int) (kmeter * 100);
    return result;
  }
}
