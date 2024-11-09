import java.util.Random;

public class home {
    public static void main(String[] args) {
        
        System.out.println(permission(15, 7));
        System.out.println(permission(43, 9));
        System.out.println(permission(100, 100));
        System.out.println(permission(5, 45));
        System.out.println(permission(3, -6));
        System.out.println(permission(generateRandomAge(), 10));
    }

    private static String permission(int age, int temp) {
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temp >= 0 && temp <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temp >= -10 && temp <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int rand = random.nextInt(100);
        System.out.println("Random Integers: " + rand);
        return rand;
    }

}
