package strings;

public class Strings {
    
    public static void main(String[] args) {
        
        String s1 = "Hello";
        String s2 = "Hello";
        String string1 = new String("Hello");
        String string2 = new String("Hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == string1);
        System.out.println(string1 == string2);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(string1));
        System.out.println(string1.equals(string2));
    }
}
