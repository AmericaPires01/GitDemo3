package brushup.java.concepts;

public class BClass {

    public void validateHeader(){
        System.out.println("Header's link validated");
    }

    public String getString(){

        String text = "Great love";

        System.out.println("Return Text: " + text);
        return text; /// I have to return String
    }


    public int getNumber(){

        int number = 2;
        System.out.println("Return Number: " + number);
        return number ; /// I have to return integer
    }

}
