public class lesson01 {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(getMonthName(5));
        System.out.println(getMonthName(15));
        System.out.println(checkElementInArray(new int[]{1, 2, 3, 4, 5}, 3));
        System.out.println(checkElementInArray(new int[]{1, 2, 3, 4, 5}, 6));
    }

    // get month name by number
    public static String getMonthName(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if (month >= 1 && month <= 12) {
            return monthNames[month-1];
        } else {
            return "Invalid month";
        }
    }

    // check element in array
    public static boolean checkElementInArray(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }
}