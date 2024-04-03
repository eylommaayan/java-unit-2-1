// כתוב תוכנית הקולטת שני מספרים
// הפלט יכלול שתי שורות: בשורה הראשונה יופיע שני מספרים בסדר עולה ובשורה השנייה יופיעו שני מספרים בסדר יורד. 
// כמו כן יוצג ההפרש החיובי בין שני המספרים. 



import java.util.Scanner;

public class SortAndDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // קליטת שני מספרים מהמשתמש
        System.out.println("Please enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Please enter the second number:");
        int num2 = scanner.nextInt();
        
        // מיון המספרים בסדר עולה ויורד וחישוב ההפרש החיובי
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        int difference = max - min;
        
        // הדפסת התוצאות
        System.out.println("Ascending order: " + min + " " + max);
        System.out.println("Descending order: " + max + " " + min);
        System.out.println("Positive difference: " + difference);
    }
}
