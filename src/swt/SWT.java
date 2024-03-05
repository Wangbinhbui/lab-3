/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swt;

/**
 *
 * @author Admin
 */
public class SWT {
// check tam giac

    public String triangleType(double side1, double side2, double side3) {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            return "khong hop le";
        } else if (side1 == side2 && side2 == side3) {
            return "deu";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "can";
        } else if (side1 * side1 == side2 * side2 + side3 * side3
                || side2 * side2 == side1 * side1 + side3 * side3
                || side3 * side3 == side1 * side1 + side2 * side2) {
            return "vuong";
        } else {
            return "khac";
        }
    }
//check so nguyenn to

    public boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    // tinh giai thua

    public long factorial(int n) {
        long giai_thua = 1;
        if (n == 0 || n == 1) {
            return giai_thua;
        } else {
            for (int i = 2; i <= n; i++) {
                giai_thua *= i;
            }
            return giai_thua;
        }
    }
// ptb2
    public String giaiPTBac2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    return "Phuong trinh co vo so nghiem";
                } else {
                    return "Phuong trinh vo nghiem";
                }
            } else {
                return "Phuong trinh co mot nghiem ";
            }
        }
        float delta = b * b - 4 * a * c;
        if (delta > 0) {
            return "Phuong trinh co 2 nghiem thuc phan biet";
        } else if (delta == 0) {
            return "Phuong trinh co nghiem kep";
        } else {
            return "Phuong trinh vo nghiem";
        }
    }
    // checkPalindrome

    public boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
    // amstrong number

    public  boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0;
        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, String.valueOf(number).length());
            originalNumber /= 10;
        }

        return result == number;
    }
// ki tu xuat hien nhieu nhat
     public  char findMostFrequentCharacter(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string is empty or null.");
        }

        int[] charCounts = new int[256]; // Assume ASCII characters

        // Count the occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            charCounts[str.charAt(i)]++;
        }

        // Find the character with the maximum count
        char mostFrequentChar = '\0';
        int maxCount = 0;

        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > maxCount) {
                maxCount = charCounts[i];
                mostFrequentChar = (char) i;
            }
        }

        return mostFrequentChar;
    }
     // tim  so lon nhat trong chuoi
       public  int findMaxNumber(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string is empty or null.");
        }

        int maxNumber = Integer.MIN_VALUE;
        StringBuilder currentNumber = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                currentNumber.append(ch);
            } else {
                if (currentNumber.length() > 0) {
                    int number = Integer.parseInt(currentNumber.toString());
                    maxNumber = Math.max(maxNumber, number);
                    currentNumber.setLength(0);
                }
            }
        }

        // Check for the last number if it ends with a digit
        if (currentNumber.length() > 0) {
            int number = Integer.parseInt(currentNumber.toString());
            maxNumber = Math.max(maxNumber, number);
        }

        return maxNumber;
    }
       // tim so be nhat trong chuoi
       public  int findSmallestNumber(String chuoi) {
        int min = Integer.MAX_VALUE; // Khởi tạo giá trị min là giá trị lớn nhất của kiểu int

        // Duyệt qua từng ký tự trong chuỗi
        for (int i = 0; i < chuoi.length(); i++) {
            char kyTu = chuoi.charAt(i);
            // Chuyển ký tự thành số và kiểm tra nếu nhỏ hơn giá trị min hiện tại
            if (Character.isDigit(kyTu)) {
                int so = Character.getNumericValue(kyTu);
                if (so < min) {
                    min = so;
                }
            }
        }

        if (min != Integer.MAX_VALUE) {
            return min;
        } else {
            // Trả về -1 nếu không có số nào trong chuỗi
            return -1;
        }
    }
// tinh tong cac so trong chuoi
        public  int calculateSumOfNumbers(String str) {
        if (str == null || str.isEmpty()) {
            return 0; // Trả về 0 nếu chuỗi là null hoặc rỗng
        }

        int sum = 0;
        StringBuilder currentNumber = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                currentNumber.append(ch);
            } else {
                if (currentNumber.length() > 0) {
                    int number = Integer.parseInt(currentNumber.toString());
                    sum += number;
                    currentNumber.setLength(0);
                }
            }
        }

        // Kiểm tra số cuối cùng nếu kết thúc với một chữ số
        if (currentNumber.length() > 0) {
            int number = Integer.parseInt(currentNumber.toString());
            sum += number;
        }

        return sum;
    }
}
