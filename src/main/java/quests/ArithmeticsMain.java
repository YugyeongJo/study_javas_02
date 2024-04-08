package quests;
import java.util.HashMap;

public class ArithmeticsMain {
    public static void main(String[] args) {

            ArithmeticsInputOutput inputoutput = new ArithmeticsInputOutput();
            HashMap<String, Integer> inputValues = inputoutput.input();

            ArithmeticsSub arithmetics = new ArithmeticsSub();
            int result_Addition = arithmetics.Additions(inputValues);
            int result_Subtraction = arithmetics.Subtractions(inputValues);
            int result_Multiplication = arithmetics.Multiplications(inputValues);
            int result_Division = arithmetics.Divisions(inputValues);
            int result_Remainder = arithmetics.Remainders(inputValues);

            inputoutput.output(result_Addition, result_Subtraction, result_Multiplication, result_Division, result_Remainder);            

}
}