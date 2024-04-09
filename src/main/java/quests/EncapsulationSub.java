package quests;
import java.util.HashMap;

public class EncapsulationSub {
    // 변수 지정
    public int intFirst ; 
    public int intSecond ; 
    private int result_Division ; 
    private int result_Remainder ; 

    // setter
    public void setIntFirst(int intFirst){
        this.intFirst = intFirst;
    }
    public void setIntSecond(int intSecond){
        this.intSecond = intSecond;
    }
    public void setResult_Division(int result_Division){
        this.result_Division = result_Division;
    }
    public void setResult_Remainder(int result_Remainder){
        this.result_Remainder = result_Remainder;
    }

    // getter
    public int getIntFirst(){
        return intFirst;
    }
    public int getIntSecond(){
        return intSecond;
    }
    public int getResult_Division(){
        return result_Division;
    }
    public int getResult_Remainder(){
        return result_Remainder;
    }

    // Division
    public int Divisions(HashMap<String, Integer> inputValues){
        try {
            int intFirst = inputValues.get("intFirst");
            int intSecond = inputValues.get("intSecond");

            setIntFirst(intFirst);
            setIntSecond(intSecond);

            setResult_Division(intFirst/intSecond) ; 
        } catch (Exception e) {
            System.out.println("catch (Exception e) : "+e.getMessage());
        }
        return result_Division;
    }

    // Remainder
    public int Remainders(HashMap<String, Integer> inputValues){
        try {
            int intFirst = inputValues.get("intFirst");
            int intSecond = inputValues.get("intSecond");

            setIntFirst(intFirst);
            setIntSecond(intSecond);

            setResult_Remainder(intFirst % intSecond) ; 
        } catch (Exception e) {
            System.out.println("catch (Exception e) : "+e.getMessage());
        }
        return result_Remainder;
    }

}
