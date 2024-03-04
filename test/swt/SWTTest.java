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
     t=new SWT();
    }
/////////////// triangle type
    @Test
    public void testTriangleType() {
        // Test cases for triangleType method
        assertEquals("deu", t.triangleType(3, 3, 3));
        assertEquals("can", t.triangleType(3, 4, 3));
        assertEquals("vuong", t.triangleType(3, 4, 5));
        assertEquals("khac", t.triangleType(2, 3, 4));
        assertEquals("khong hop le", t.triangleType(1, 2, 3));
    

    }

   
//tinh sso  nguyen to
    @Test
    public void testIsPrimeNumber() {
        assertTrue(t.isPrimeNumber(2));
        assertTrue(t.isPrimeNumber(3));
        assertFalse(t.isPrimeNumber(4));
        assertTrue(t.isPrimeNumber(5));
        assertFalse(t.isPrimeNumber(6));
        assertTrue(t.isPrimeNumber(7));
        assertFalse(t.isPrimeNumber(8));
        assertTrue(t.isPrimeNumber(11));
    }

/////////////////////////////////////////////
    @Test
    public void testFactorial() {
           assertEquals(1, t.factorial(0));
        assertEquals(1, t.factorial(1));
        assertEquals(2, t.factorial(2));
        assertEquals(6, t.factorial(3));
        assertEquals(24, t.factorial(4));
        assertEquals(120, t.factorial(5));
        assertEquals(720, t.factorial(6));
        assertEquals(5040, t.factorial(7));
        assertEquals(40320, t.factorial(8));
        assertEquals(362880, t.factorial(9));
        assertEquals(3628800, t.factorial(10));
    }
////////////////////////////////////////////// t.giai pt bac 2
    @Test
    public void testGiaiPTBac2() {
        // Test case 1: Phương trình có vô số nghiệm
        assertEquals("Phuong trinh co vo so nghiem", t.giaiPTBac2(0, 0, 0));

        // Test case 2: Phương trình vô nghiệm
        assertEquals("Phuong trinh vo nghiem", t.giaiPTBac2(0, 0, 5));

        // Test case 3: Phương trình có một nghiệm
        // TH nay ham sai
        // assertEquals("Phuong trinh co mot nghiem", t.giaiPTBac2(0, 3, 0));
        
        // Test case 4: Phương trình có 2 nghiệm thực phân biệt
        assertEquals("Phuong trinh co 2 nghiem thuc phan biet", t.giaiPTBac2(1, -5, 6));

        // Test case 5: Phương trình có nghiệm kép
        assertEquals("Phuong trinh co nghiem kep", t.giaiPTBac2(1, -4, 4));

        // Test case 6: Phương trình vô nghiệm
        assertEquals("Phuong trinh vo nghiem", t.giaiPTBac2(2, 1, 3));
    }

  
//////////// palindrome
      @Test
    public void testIsPalindrome() {
        assertTrue(t.isPalindrome(12321)); // Số đối xứng
        assertTrue(t.isPalindrome(123321)); // Số đối xứng
        assertFalse(t.isPalindrome(12345)); // Số không đối xứng
        assertTrue(t.isPalindrome(0)); // Số đối xứng
        assertTrue(t.isPalindrome(121)); // Số đối xứng
        assertFalse(t.isPalindrome(123)); // Số không đối xứng
        assertTrue(t.isPalindrome(1221)); // Số đối xứng
        assertFalse(t.isPalindrome(1231)); // Số không đối xứng
        assertTrue(t.isPalindrome(1234321)); // Số đối xứng
    }

    @Test
     public void testIsArmstrong() {
        // Test với số Armstrong
        assertTrue(t.isArmstrong(153));
        assertTrue(t.isArmstrong(9474));
        assertTrue(t.isArmstrong(93084));
        
        // Test với số không phải Armstrong
        assertFalse(t.isArmstrong(123));
        assertFalse(t.isArmstrong(456));
        assertFalse(t.isArmstrong(7890));
        
        // Test với số 0
        assertTrue(t.isArmstrong(0));
        
        // Test với số âm không phải Armstrong
        assertFalse(t.isArmstrong(-370));
        assertFalse(t.isArmstrong(-1));
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
   
}
