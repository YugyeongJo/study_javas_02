package quests;
import java.util.HashMap;

public class ArithmeticsSub {

    // Addition
    public int Additions(HashMap<String, Integer> inputValues){ 
        int result_Addition = 0;
        try {
            int intFirst = inputValues.get("intFirst");
            int intSecond = inputValues.get("intSecond");
            result_Addition = intFirst + intSecond ; 
        } catch (Exception e) {
            System.out.println("catch (Exception e) : "+e.getMessage());
        }
        return result_Addition;
    }

    // Subtraction
    public int Subtractions(HashMap<String, Integer> inputValues){
        int result_Subtraction = 0;
        try {
            int intFirst = inputValues.get("intFirst");
            int intSecond = inputValues.get("intSecond");
            result_Subtraction = intFirst - intSecond ; 
        } catch (Exception e) {
            System.out.println("catch (Exception e) : "+e.getMessage());
        }
        return result_Subtraction;
    }

    // Multiplication
    public int Multiplications(HashMap<String, Integer> inputValues){
        int result_Multiplication = 0;
        try {
            int intFirst = inputValues.get("intFirst");
            int intSecond = inputValues.get("intSecond");
            result_Multiplication = intFirst * intSecond ; 
        } catch (Exception e) {
            System.out.println("catch (Exception e) : "+e.getMessage());
        }
        return result_Multiplication;
    }

    // Division
    public int Divisions(HashMap<String, Integer> inputValues){
        int result_Division = 0;
        try {
            int intFirst = inputValues.get("intFirst");
            int intSecond = inputValues.get("intSecond");
            result_Division = intFirst / intSecond ; 
        } catch (Exception e) {
            System.out.println("catch (Exception e) : "+e.getMessage());
        }
        return result_Division;
    }

    // Remainder
    public int Remainders(HashMap<String, Integer> inputValues){
        int result_Remainder = 0;
        try {
            int intFirst = inputValues.get("intFirst");
            int intSecond = inputValues.get("intSecond");
            result_Remainder = intFirst % intSecond ; 
        } catch (Exception e) {
            System.out.println("catch (Exception e) : "+e.getMessage());
        }
        return result_Remainder;
    }

}
