public class Main {
    public static void main(String[] args) {

        System.out.println(google(10, 20));
        System.out.println(google(25, -34));
        System.out.println(google(35, 4));
        System.out.println(google(14, -15));
        System.out.println(google(15, 15));
    }

    public static String google(int age, double temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (age > 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "остовайтесь дома";
        }
    }
}