public class Main {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println(hasTeen(9, 99, 19));   // true
        System.out.println(hasTeen(23, 15, 42));  // true
        System.out.println(hasTeen(22, 23, 34));  // false
        System.out.println(isCatPlaying(true, 10));    // false
        System.out.println(isCatPlaying(false, 36));   // false
        System.out.println(isCatPlaying(false, 35));   // true
        System.out.println(isCatPlaying(true, 44));    // true
        System.out.println(isCatPlaying(true, 46));    // false
        System.out.println(area(5.0, 4.0));   // 20.0
        System.out.println(area(-1.0, 4.0));  // -1
        System.out.println(area(5.0));        // 78.53981633974483
        System.out.println(area(-1));         // -1
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        return isBarking && (hourOfDay < 8 || hourOfDay > 19);
    }
    public static boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) ||
                (b >=13 && b <= 19) ||
                (c >= 13 && c <= 19);
    }
    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        int upperLimit = isSummer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;
    }
    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        }
        return width * height;
    }
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }

}
