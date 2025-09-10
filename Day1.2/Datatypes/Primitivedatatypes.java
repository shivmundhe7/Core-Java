//public class PrimitiveDatatypes {
//    public static void main(String[] args) {
//        int count = 100;
//        if(count==100);
//            System.out.println("YESSS");
//        else{
//            System.out.println("NO");}
//    }
//}
public class Primitivedatatypes {
    public static void main(String[] args) {

        // 1. Boolean (true/false values)
        boolean isStudent = true; // Am I a student? -> Yes
        boolean hasDrivingLicense = false; // Do I have a license? -> No
        System.out.println("Student: " + isStudent);
        System.out.println("Has Driving License: " + hasDrivingLicense);

        // 2. Character (single character)
        char grade = 'A';
        char currency = '₹';
        System.out.println("Grade: " + grade);
        System.out.println("Currency Symbol: " + currency);

        // 3. Integer types
        byte age = 20;
        short schoolStrength = 1200;
        int population = 1410000000;
        long worldWealth = 100000000000L;
        System.out.println("Age: " + age);
        System.out.println("School Strength: " + schoolStrength);
        System.out.println("India Population: " + population);
        System.out.println("World Wealth: " + worldWealth);

        // 4. Floating types
        float itemPrice = 99.99f;
        double earthRadius = 6371.0088;
        System.out.println("Item Price: " + itemPrice);
        System.out.println("Earth Radius: " + earthRadius);
    }
}
