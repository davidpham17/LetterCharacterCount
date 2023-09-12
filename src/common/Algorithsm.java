
package common;

import java.util.StringTokenizer;

public class Algorithsm {
    public void countCharacter(String s) {
    s = s.toLowerCase();
    
    // Khai báo một mảng để lưu trữ số lần xuất hiện của các chữ cái
    int[] letterCounts = new int[26]; // 26 chữ cái trong bảng chữ cái tiếng Anh
    
    // Duyệt qua chuỗi và đếm số lần xuất hiện của từng chữ cái
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c >= 'a' && c <= 'z') {
            int index = c - 'a'; // Xác định vị trí của chữ cái trong mảng (a=0, b=1, c=2, ...)
            letterCounts[index]++;
        }
    }
    
    for (char c = 'a'; c <= 'z'; c++) {
        int index = c - 'a';
        if (letterCounts[index] > 0) {
            System.out.println(c + ": " + letterCounts[index] + " times.");
        }
    }
}
    
    public void countLetters(String s) {
    StringTokenizer str = new StringTokenizer(s);
    
    while (str.hasMoreTokens()) {
        String word = str.nextToken();
        word = word.toLowerCase(); // Đưa từ về chữ thường để tránh phân biệt hoa thường
        
        // Đếm số lần xuất hiện của từng từ và in ra kết quả
        int count = 0;
        StringTokenizer str1 = new StringTokenizer(s);
        while (str1.hasMoreTokens()) {
            String word1 = str1.nextToken();
            word1 = word1.toLowerCase(); // Đưa từ về chữ thường
            if (word1.equals(word)) {
                count++;
            }
        }
        
        System.out.println(word + ": " + count + " times.");
    }
}
    
}
