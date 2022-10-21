public class FirstLesson {
    public static void main(String[] args) {
        System.out.println(getMonthName(1));

        char[] arrayChar = {'a', 'b', 'c', 'd', '1'};
        System.out.println(searchValInArray(arrayChar, 'e'));

        String str = "hello";
        System.out.println(reverseString(str));
    }

    public static String getMonthName(int monthNum){
        return switch (monthNum) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Not valid month number";
        };
    }

    public static int searchValInArray(char[] array, char ch){
        int index = -1;

        for(int i = 0; i < array.length; i++){
            if(array[i] == ch){
                index = i;
            }
        }
        return index;
    }

    public static String reverseString(String str){
        char[] arrayChar = str.toCharArray();
        String resultString = "";
        for (int i = arrayChar.length - 1; i >= 0; i--) {
            resultString = resultString + arrayChar[i];
        }
        return resultString;
    }
}