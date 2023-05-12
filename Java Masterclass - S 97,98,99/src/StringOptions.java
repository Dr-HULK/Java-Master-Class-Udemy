public class StringOptions {
    public static void main(String[] args) {
        String helloWorld = "Hello" + " World";
        helloWorld.concat("and GoodBye");


        //StringBuilder helloWorldBuilder = "Hello" + " World";
        // The above code won't work because we  can't assign
        //a String literal to a StringBuilder variable.
        // We will have to use one of the constructors

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInfo(helloWorld);
        printInfo(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(57));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInfo(emptyStart);
        printInfo(emptyStart32);


        StringBuilder builderPlus = new StringBuilder("Hello" + " World" );
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);
        //We are deleting the character at index 16 and inserting a new Character at index 16

        builderPlus.replace(16,17, "G");
        System.out.println(builderPlus);
        //Replacing the "G" with "g"
        //Ending index we use with this method, is used as an exclusive index,

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
        //Reversing the StringBuilder and making the length to 7 after reversing
    }
    public static void printInfo(String string){
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInfo(StringBuilder builder){
        System.out.println("StringBuilder = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("Capacity = " + builder.capacity());
    }
}
