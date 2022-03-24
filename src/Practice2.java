public class Practice2 {
    public static void main(String[] args) {
        String s = "HelloWord";
        String sub1 = s.substring(0,3); // ending index is exclusive

        System.out.println("Sub1: " + sub1);

        sub1 = s.substring(5);

        System.out.println("Sub1: " + sub1);

    }
}
