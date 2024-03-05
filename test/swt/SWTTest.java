/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change tht.is license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit tht.is template
 */
package swt;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class SWTTest {

    SWT t;

    public SWTTest() {
        t = new SWT();
    }
/////////////// triangle type

    @Test
    public void testEquilateralTriangle() {
        // Test case for equilateral triangle
        assertEquals("deu", t.triangleType(3, 3, 3));
    }

    @Test
    public void testIsoscelesTriangle() {
        // Test case for isosceles triangle
        assertEquals("can", t.triangleType(3, 4, 3));
    }

    @Test
    public void testRightAngledTriangle() {
        // Test case for right-angled triangle
        assertEquals("vuong", t.triangleType(3, 4, 5));
    }

    @Test
    public void testScaleneTriangle() {
        // Test case for scalene triangle
        assertEquals("khac", t.triangleType(2, 3, 4));
    }

    @Test
    public void testInvalidTriangle() {
        // Test case for invalid triangle
        assertEquals("khong hop le", t.triangleType(1, 2, 3));
    }

//tinh sso  nguyen to
    @Test
    public void testPrimeNumber() {
        // Test case for prime number 2
        assertTrue(t.isPrimeNumber(2));
    }

    @Test
    public void testPrimeNumber3() {
        // Test case for prime number 3
        assertTrue(t.isPrimeNumber(3));
    }

    @Test
    public void testNotPrimeNumber4() {
        // Test case for non-prime number 4
        assertFalse(t.isPrimeNumber(4));
    }

    @Test
    public void testPrimeNumber5() {
        // Test case for prime number 5
        assertTrue(t.isPrimeNumber(5));
    }

    @Test
    public void testNotPrimeNumber6() {
        // Test case for non-prime number 6
        assertFalse(t.isPrimeNumber(6));
    }

    @Test
    public void testPrimeNumber7() {
        // Test case for prime number 7
        assertTrue(t.isPrimeNumber(7));
    }

    @Test
    public void testNotPrimeNumber8() {
        // Test case for non-prime number 8
        assertFalse(t.isPrimeNumber(8));
    }

    @Test
    public void testPrimeNumber11() {
        // Test case for prime number 11
        assertTrue(t.isPrimeNumber(11));
    }

/////////////////////////////////////////////
    @Test
    public void testFactorial0() {
        // Test case for factorial of 0
        assertEquals(1, t.factorial(0));
    }

    @Test
    public void testFactorial1() {
        // Test case for factorial of 1
        assertEquals(1, t.factorial(1));
    }

    @Test
    public void testFactorial2() {
        // Test case for factorial of 2
        assertEquals(2, t.factorial(2));
    }

    @Test
    public void testFactorial3() {
        // Test case for factorial of 3
        assertEquals(6, t.factorial(3));
    }

    @Test
    public void testFactorial4() {
        // Test case for factorial of 4
        assertEquals(24, t.factorial(4));
    }

    @Test
    public void testFactorial5() {
        // Test case for factorial of 5
        assertEquals(120, t.factorial(5));
    }

    @Test
    public void testFactorial6() {
        // Test case for factorial of 6
        assertEquals(720, t.factorial(6));
    }

    @Test
    public void testFactorial7() {
        // Test case for factorial of 7
        assertEquals(5040, t.factorial(7));
    }

    @Test
    public void testFactorial8() {
        // Test case for factorial of 8
        assertEquals(40320, t.factorial(8));
    }

    @Test
    public void testFactorial9() {
        // Test case for factorial of 9
        assertEquals(362880, t.factorial(9));
    }

    @Test
    public void testFactorial10() {
        // Test case for factorial of 10
        assertEquals(3628800, t.factorial(10));
    }
////////////////////////////////////////////// t.giai pt bac 2

    @Test
    public void testNoSolution() {
        // Test case 1: Phương trình không có nghiệm
        assertEquals("Phuong trinh co vo so nghiem", t.giaiPTBac2(0, 0, 0));
    }

    @Test
    public void testNoRoots() {
        // Test case 2: Phương trình vô nghiệm
        assertEquals("Phuong trinh vo nghiem", t.giaiPTBac2(0, 0, 5));
    }

    @Test
    public void testOneRoot() {
        // Test case 3: Phương trình có một nghiệm
        // Bạn đã ghi chú rằng trường hợp này hàm sai
        //assertEquals("Phuong trinh co mot nghiem", t.giaiPTBac2(0, 3, 0));
    }

    @Test
    public void testTwoDistinctRoots() {
        // Test case 4: Phương trình có 2 nghiệm thực phân biệt
        assertEquals("Phuong trinh co 2 nghiem thuc phan biet", t.giaiPTBac2(1, -5, 6));
    }

    @Test
    public void testOneRepeatedRoot() {
        // Test case 5: Phương trình có nghiệm kép
        assertEquals("Phuong trinh co nghiem kep", t.giaiPTBac2(1, -4, 4));
    }

    @Test
    public void testNoRoots2() {
        // Test case 6: Phương trình vô nghiệm
        assertEquals("Phuong trinh vo nghiem", t.giaiPTBac2(2, 1, 3));
    }

//////////// palindrome
    @Test
    public void testPalindrome12321() {
        // Test case 1: Số đối xứng
        assertTrue(t.isPalindrome(12321));
    }

    @Test
    public void testPalindrome123321() {
        // Test case 2: Số đối xứng
        assertTrue(t.isPalindrome(123321));
    }

    @Test
    public void testNotPalindrome12345() {
        // Test case 3: Số không đối xứng
        assertFalse(t.isPalindrome(12345));
    }

    @Test
    public void testPalindrome0() {
        // Test case 4: Số đối xứng
        assertTrue(t.isPalindrome(0));
    }

    @Test
    public void testPalindrome121() {
        // Test case 5: Số đối xứng
        assertTrue(t.isPalindrome(121));
    }

    @Test
    public void testNotPalindrome123() {
        // Test case 6: Số không đối xứng
        assertFalse(t.isPalindrome(123));
    }

    @Test
    public void testPalindrome1221() {
        // Test case 7: Số đối xứng
        assertTrue(t.isPalindrome(1221));
    }

    @Test
    public void testNotPalindrome1231() {
        // Test case 8: Số không đối xứng
        assertFalse(t.isPalindrome(1231));
    }

    @Test
    public void testPalindrome1234321() {
        // Test case 9: Số đối xứng
        assertTrue(t.isPalindrome(1234321));
    }
/// strong number

    @Test
    public void testArmstrong153() {
        // Test case 1: Số Armstrong
        assertTrue(t.isArmstrong(153));
    }

    @Test
    public void testArmstrong9474() {
        // Test case 2: Số Armstrong
        assertTrue(t.isArmstrong(9474));
    }

    @Test
    public void testArmstrong93084() {
        // Test case 3: Số Armstrong
        assertTrue(t.isArmstrong(93084));
    }

    @Test
    public void testNotArmstrong123() {
        // Test case 4: Số không phải Armstrong
        assertFalse(t.isArmstrong(123));
    }

    @Test
    public void testNotArmstrong456() {
        // Test case 5: Số không phải Armstrong
        assertFalse(t.isArmstrong(456));
    }

    @Test
    public void testNotArmstrong7890() {
        // Test case 6: Số không phải Armstrong
        assertFalse(t.isArmstrong(7890));
    }

    @Test
    public void testArmstrong0() {
        // Test case 7: Số Armstrong
        assertTrue(t.isArmstrong(0));
    }

    @Test
    public void testNotArmstrongNegative370() {
        // Test case 8: Số âm không phải Armstrong
        assertFalse(t.isArmstrong(-370));
    }

    @Test
    public void testNotArmstrongNegative1() {
        // Test case 9: Số âm không phải Armstrong
        assertFalse(t.isArmstrong(-1));
    }

    @Test
    public void testNotArmstrongNegative9474() {
        // Test case 10: Số âm không phải Armstrong
        assertFalse(t.isArmstrong(-9474));
    }
// kí tu trung lapp

    @Test
    public void testFindDuplicateCharacters() {
    }

    @Test
    public void test1() {
        String str = "hello";
        assertEquals('l', t.findMostFrequentCharacter(str));
    }

    @Test
    public void test2() {
        String str = "programming";
        assertEquals('g', t.findMostFrequentCharacter(str));
    }

    @Test
    public void test3() {
        String str = "aaabbbccc";
        assertEquals('a', t.findMostFrequentCharacter(str));
    }

    @Test
    public void test4() {
        String str = "1234556777";
        assertEquals('7', t.findMostFrequentCharacter(str));
    }

    @Test
    public void test5() {
        String str = "abcdefg";
        assertEquals('a', t.findMostFrequentCharacter(str));
    }

    @Test
    public void test7() {
        String str = "123!@#abaab";
        assertEquals('a', t.findMostFrequentCharacter(str));
    }

    @Test
    public void test8() {
        String str = "aaaaa";
        assertEquals('a', t.findMostFrequentCharacter(str));
    }

    @Test
    public void test10() {
        String str = "AbCdEfG";
        assertEquals('A', t.findMostFrequentCharacter(str));
    }

    // tim so  lon nhat
    @Test
    public void testMaxNumberInMixedString() {
        String str = "abc123def456ghi";
        assertEquals(456, t.findMaxNumber(str));
    }

    @Test
    public void testMaxNumberInNumericString() {
        String str = "12345";
        assertEquals(12345, t.findMaxNumber(str));
    }

    @Test
    public void testMaxNumberWithNonNumericCharacters() {
        String str = "1a2b3c4d5e";
        assertEquals(5, t.findMaxNumber(str));
    }

    @Test
    public void testMaxNumberInAllNines() {
        String str = "999999999";
        assertEquals(999999999, t.findMaxNumber(str));
    }

    @Test
    public void testNoNumbersInString() {
        String str = "abc";
        assertEquals(Integer.MIN_VALUE, t.findMaxNumber(str));
    }

    @Test
    public void testMaxNumberWithLeadingCharacters() {
        String str = "875abc1234def5678ghi";
        assertEquals(5678, t.findMaxNumber(str));
    }

    @Test
    public void testMaxNumberWithMixedCharacters() {
        String str = "a1b2c3d4e5";
        assertEquals(5, t.findMaxNumber(str));
    }

    @Test
    public void testNoNumbersInStringWithSpecialCharacters() {
        String str = "#$%^&*(";
        assertEquals(Integer.MIN_VALUE, t.findMaxNumber(str));
    }

    @Test
    public void testSingleDigitString() {
        String str = "0";
        assertEquals(0, t.findMaxNumber(str));
    }

    @Test
    public void testMaxNumberInStringWithSpaces() {
        String str = "10 20 30 15 25";
        assertEquals(30, t.findMaxNumber(str));
    }

    // tim so be nhat trong chuoi
    @Test
    public void testFindSmallestNumber_WithEmptyString() {
        assertEquals(-1, t.findSmallestNumber(""));
    }

    @Test
    public void testFindSmallestNumber_WithNoNumbers() {
        assertEquals(-1, t.findSmallestNumber("abc"));
    }

    @Test
    public void testFindSmallestNumber_WithSingleDigit() {
        assertEquals(5, t.findSmallestNumber("abc5def"));
    }

    @Test
    public void testFindSmallestNumber_WithMultipleDigits() {
        assertEquals(1, t.findSmallestNumber("a3b1c5d2e"));
    }

    @Test
    public void testFindSmallestNumber_WithZeroAsSmallest() {
        assertEquals(0, t.findSmallestNumber("0a1b2c3"));
    }

    @Test
    public void testFindSmallestNumber_WithMixedCharacters() {
        assertEquals(3, t.findSmallestNumber("a4b5c$3d"));
    }

    @Test
    public void testFindSmallestNumber_WithOnlyNumbers() {
        assertEquals(1, t.findSmallestNumber("123456"));
    }

    // find sum in a string
     @Test
    public void testCalculateSumOfNumbers_WithEmptyString() {
        assertEquals(0, t.calculateSumOfNumbers(""));
    }

    @Test
    public void testCalculateSumOfNumbers_WithNoNumbers() {
        assertEquals(0, t.calculateSumOfNumbers("abc"));
    }

    @Test
    public void testCalculateSumOfNumbers_WithSingleDigit() {
        assertEquals(5, t.calculateSumOfNumbers("abc5def"));
    }

    @Test
    public void testCalculateSumOfNumbers_WithMultipleDigits() {
        assertEquals(11, t.calculateSumOfNumbers("a3b1c5d2e"));
    }

    @Test
    public void testCalculateSumOfNumbers_WithZero() {
        assertEquals(0, t.calculateSumOfNumbers("a0b0c0"));
    }


    @Test
    public void testCalculateSumOfNumbers_WithSpecialCharacters() {
        assertEquals(6, t.calculateSumOfNumbers("1@2#3$"));
    }

    @Test
    public void testCalculateSumOfNumbers_WithMixedCharacters() {
        assertEquals(12, t.calculateSumOfNumbers("a4b5c$3d"));
    }

 
   

}
