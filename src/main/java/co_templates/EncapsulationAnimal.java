package co_templates;

public class EncapsulationAnimal{
    int firstNum ; 
    int secondNum ;
    int result ; 

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    public void byPass(int firstNumber, int secondNumber){
        this.firstNum = firstNumber;
        this.secondNum = secondNumber;
        this.result = firstNumber + secondNumber;
        // int result = result;
        return;
    }
}
