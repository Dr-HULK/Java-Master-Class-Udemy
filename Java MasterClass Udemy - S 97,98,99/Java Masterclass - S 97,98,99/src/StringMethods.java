public class StringMethods {
    public static void main(String[] args) {

        String birthDate = "25/11/1982";
        //2 5 / 1 1 / 1 9 8 2
        //0 1 2 3 4 5 6 7 8 9 - Index

        int startingIndex = birthDate.indexOf("1982");
        System.out.println("Starting Index = " + startingIndex);
        System.out.println("Birth Year = " + birthDate.substring(startingIndex));
        System.out.println("Birth Month = " + birthDate.substring(3,5));
        //Printing the month, here the last index won't be printed, so we added the index 5.

        String newDate = String.join("/","25","11","1982");
        System.out.println("New date = " + newDate);
        // The delimiter will be placed after each element.

        //Let's do the same exact thing with the "concat" method of the string
        //Not recommended to do this, just for Knowledge purpose.

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("New Date = " + newDate);

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("New Date = " + newDate);

        newDate = "25".concat("/").concat("11").concat("/")
                .concat("1982");
        System.out.println("New Date = " + newDate);
        //This coding style has a special name, and it's called method chaining.
        //Each call to the concat method is still a new String object being created
        // But instead of assigning that result to a variable, we chain it to another method result

        System.out.println(newDate.replace('/','-'));
        System.out.println(newDate.replace('2','0'));
        //Replacing 2 with another Character
        System.out.println(newDate.replace("2","00"));
        //Replacing every instance of 2 with a String

        System.out.println(newDate.replaceFirst("/","-"));
        //The replaceFirst method just replaces the first instance, where there's a match,
        System.out.println(newDate.replaceAll("/","---"));
        //The replaceAll method, replaced all occurrences.

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));
        //In the first Command, we will have an extra empty line.

        System.out.println("ABC\n".repeat(3).indent(8));
        //Giving 8 Spaces before every ABC.
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        //Subtracting 2 spaces from every ABC
        System.out.println("-".repeat(20));

    }
}
