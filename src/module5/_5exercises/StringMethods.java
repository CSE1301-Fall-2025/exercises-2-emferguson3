package module5._3return;

public class StringMethods {

    // 1️⃣ A method that takes in a String and returns that string concatenated with itself.
    // (Initially written directly, but we’ll rewrite it later to use repeatString)
    public static String doubleString(String str) {
        // rewritten version calls repeatString
        return repeatString(str, 2);
    }

    // 2️⃣ A method that takes in a String and an int n, and returns n copies concatenated together.
    // Later we’ll rewrite this using join().
    public static String repeatString(String str, int n) {
        // create an array of n copies of str
        String[] copies = new String[n];
        for (int i = 0; i < n; i++) {
            copies[i] = str;
        }
        // use join() with "" (no joiner between copies)
        return join(copies, "");
    }

    // 3️⃣ A join method: takes an array of Strings and a joiner, returns them combined with joiner in between.
    public static String join(String[] array, String joiner) {
        if (array.length == 0) return "";
        StringBuilder sb = new StringBuilder(array[0]);
        for (int i = 1; i < array.length; i++) {
            sb.append(joiner).append(array[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // Test doubleString()
        System.out.println(doubleString("hi"));         // Expected: "hihi"
        System.out.println(doubleString("abc"));        // Expected: "abcabc"

        // Test repeatString()
        System.out.println(repeatString("hi", 3));      // Expected: "hihihi"
        System.out.println(repeatString("test", 1));    // Expected: "test"

        // Test join()
        String[] words = {"Hello", "world", "!"};
        System.out.println(join(words, " "));           // Expected: "Hello world !"
        System.out.println(join(words, "-"));           // Expected: "Hello-world-!"
    }
}
