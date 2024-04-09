package co_templates;

public class EncapsulationAnimal{
    public int firstNum ; 
    public int secondNum ;
    private int result ; 
    // private(접근자)을 넣는 이유 : getter(), setter()을 사용할때 class 내 변수에 접근할때 바로 접근하는 것이 아니라 function을 통해서 접근하도록 하기 위해서

    public void setResult(int number){
        this.result = number;
    }

    public int getResult(){
        return this.result;
    }

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
