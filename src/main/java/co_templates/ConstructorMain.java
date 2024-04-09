package co_templates;


public class ConstructorMain {
    public static void main(String[] args) {
        ConstructorAnimal animal = new ConstructorAnimal();
        animal.animalSound();

        ConstructorAnimal animalWithParams = new ConstructorAnimal(2, 3);
    } 
}
