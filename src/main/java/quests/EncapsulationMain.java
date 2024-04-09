package quests;
import java.util.HashMap;

public class EncapsulationMain {
    public static void main(String[] args) {

            EncapsulationInputOutput inputoutput = new EncapsulationInputOutput();
            HashMap<String, Integer> inputValues = inputoutput.input();

            EncapsulationSub encapsulation = new EncapsulationSub();
            int result_Division = encapsulation.Divisions(inputValues);
            int result_Remainder = encapsulation.Remainders(inputValues);

            inputoutput.output(result_Division, result_Remainder);            

}
}