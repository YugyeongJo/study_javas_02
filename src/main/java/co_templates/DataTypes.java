public class DataTypes {
    public static void main(String[] args){
        // Numbers
        int intFirst = 3;
        // type을 다르게 넣으면 error 남
        // intFirst = 5.2
        // Cannot evaluate because of compilation error(s): Type mismatch: cannot convert from double to int.
        // intFirst = "5.2"
        // Cannot evaluate because of compilation error(s): Type mismatch: cannot convert from String to int.
        System.out.println("Numbers int First : "+intFirst);

        boolean boolFirst = true;
        // type을 다르게 넣으면 error남
        // boolFirst = 3
        // Cannot evaluate because of compilation error(s): Type mismatch: cannot convert from int to boolean.
        // boolFirst = false
        // false
        System.out.println("Boolean bool First : "+boolFirst);

        String stringFirst = "Hello DataTypes!";
        System.out.println("String str First : "+stringFirst);

        float floatFirst = 2 / 3;
        System.out.println("float First : "+floatFirst);

        return ;
    }
}