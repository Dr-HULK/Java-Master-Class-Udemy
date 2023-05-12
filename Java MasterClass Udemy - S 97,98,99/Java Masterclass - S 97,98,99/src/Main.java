public class Main {

    public static void main(String[] args) {

        printInformation("Hello World");
        printInformation("");
        printInformation("\t   \n");

        //       H e l l o   w o r l  d
        //Index- 1 2 3 4 5 6 7 8 9 10 11

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));
        //Note while searching for a word we are using "" instead of ''

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));
        //The first code will start searching from the first index
        //The second code will start searching from the last index to the start

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l',
                3));
        //It will Start Searching From Index number 3 for the next l

        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l',
                8));
        //It will start from the last from index 8 backwards for the next l

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        //We don't get out op because the text is similar but the case is different, one is upper and the other is lower

        if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }
        //We get the output because the text in both of the string are similar & we are ignoring the case

        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }
        if (helloWorld.contains("World")) {
            System.out.println("String contains World");
        }

        if (helloWorld.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }
    }

    public static void printInformation(String string) {

        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is Blank");
        }

        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}
