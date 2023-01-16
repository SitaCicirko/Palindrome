public class Main {
    public static void main(String[] args) {
        String original = "race car";
        original = original.replace(" ", "");

        String reverse = " ";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
            System.out.println(reverse);
        }
        boolean palidrome = true;
        for (int i = 0; i < original.length(); i++) {
            if(original.charAt(i) != reverse.charAt(i)){
                palidrome = false;
            }
        }
        if (palidrome = true) {
            System.out.println("palidrome");
        } else {
            System.out.println("not palidrome");
        }
    }
}