public class NestIF {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if (a > b) {
            if (a > c) {
                System.out.println("A MAX!");
            } else {
                System.out.println("C MAX!");
            }
        } else {
            if (b > c) {
                System.out.println("B MAX!");
            } else {
                System.out.println("C MAX!");
            }
        }
    }
}

