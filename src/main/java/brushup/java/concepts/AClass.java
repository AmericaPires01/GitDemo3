package brushup.java.concepts;

public class AClass {

    public static void main(String[] args){

        // Prints a message
        System.out.println("Good morning!");

        // Add  2 numbers 2 and 3
        int a = 2;
        int b = 3;
        int sum = a+b;
        System.out.println("Sum = " + sum);

        //GitDemo3 changes
        System.out.println("GitDemo3 added this print line");

        //GitJava Changes
        System.out.println("GitJava(Project owner) added this print statement. GitJava is the oe who created GitDemo3 repository in GitHub, so anyone can lone it to collaborate.");



        // Assume we want to validate pages heather, header will be the same for every page, instead of repeating the same code many times for different page class
        // we can just create a class for header or just a method in a class the contain features common for lost of page and call this method for each class needed
        // in this example here.

        BClass bClass = new BClass();
        bClass.validateHeader();
        bClass.getString();
        bClass.getNumber();

    }
}
