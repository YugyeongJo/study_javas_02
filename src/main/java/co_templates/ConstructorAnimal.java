package co_templates;

public class ConstructorAnimal{
    public int firstNum ; 
    public int secondNum ;

    public ConstructorAnimal(){
        System.out.println("ConstructorAnimal()");
    }
    
    public ConstructorAnimal(int firstNumber, int secondNumber){
        System.out.println("ConstructorAnimal(int firstNumber, int secondNumber)");
        this.firstNum = firstNumber;
        this.secondNum = secondNumber;
        System.out.println(firstNum);
        System.out.println(secondNum);
    }

    public void animalSound() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'animalSound'");
    }

}
