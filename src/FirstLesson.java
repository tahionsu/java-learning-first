public class FirstLesson {
    public static void main(String[] args) {
        System.out.println(getMonthName(1));

        char[] arrayChar = {'a', 'b', 'c', 'd', '1'};
        System.out.println(searchValInArray(arrayChar, 'e'));

        String str = "hello";
        System.out.println(reverseString(str));

        int d = 12;
        System.out.println(decToHex(d));

        int[] arrayForSort = {1, 3, 20, 14, 2, 5, 7, 19};
        int[] arrSort = bubbleSort(arrayForSort);

        for (int i = 0; i < arrayForSort.length; i++) {
            System.out.print(arrayForSort[i]);
            System.out.print(" ");
        }
        System.out.println();

        for (int i = 0; i < arrSort.length; i++) {
            System.out.print(arrSort[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static String getMonthName(int monthNum) {
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

    public static int searchValInArray(char[] array, char ch) {
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ch) {
                index = i;
            }
        }
        return index;
    }

    public static String reverseString(String str) {
        char[] arrayChar = str.toCharArray();
        String resultString = "";
        for (int i = arrayChar.length - 1; i >= 0; i--) {
            resultString = resultString + arrayChar[i];
        }
        return resultString;
    }

    public static String decToHex(int d) {
        String digits = "0123456789ABCDEF";
        if (d == 0) return "0";
        int base = 16;
        String hex = "";
        while (d > 0) {
            int digit = d % base;
            hex = digits.charAt(digit) + hex;
            d = d / base;
        }
        return hex;
    }

    public static int[] bubbleSort(int[] sortArr) {
        int[] arrSort = new int[sortArr.length];

        for (int i = 0; i < sortArr.length; i++) {
            arrSort[i] = sortArr[i];
        }

        for (int i = 0; i < arrSort.length - 1; i++) {
            for (int j = 0; j < arrSort.length - i - 1; j++) {
                if (arrSort[j + 1] < arrSort[j]) {
                    int swap = arrSort[j];
                    arrSort[j] = arrSort[j + 1];
                    arrSort[j + 1] = swap;
                }
            }
        }
        return arrSort;
    }
}